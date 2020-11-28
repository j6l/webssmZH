<template>
  <div>
    <el-card>
      <el-row :gutter="25">
        <el-col :span="10">
          <!-- 搜索添加 -->
          <el-input placeholder="请输入搜索内容" v-model="queryInfo.query" clearable @clear="getUserList">
            <el-button slot="append" icon="el-icon-search" @click="getUserList"></el-button>
          </el-input>
        </el-col>

        <el-col :span="5" :offset="6">
          <el-button type="primary" @click="addDialogVisible = true">添加用户</el-button>
        </el-col>
      </el-row>
      <el-table :data="tableData" stripe style="width: 100%">
        <el-table-column prop="uuid" label="ID" width="230px"></el-table-column>
        <el-table-column prop="name" fixed label="账户名"></el-table-column>
        <el-table-column prop="password" label="密码"></el-table-column>
        <el-table-column prop="mail" label="邮箱"></el-table-column>
        <el-table-column prop="role" label="权限"></el-table-column>
        <el-table-column prop="isout" fixed="right" label="状态">
          <!-- scope.row 就是当前行的信息 -->
          <template slot-scope="scope">
            <el-switch
              v-model="scope.row.isout"
              active-value="1"
              inactive-value="0"
              @change="userStateChanged(scope.row)"
            ></el-switch>
          </template>
        </el-table-column>
        <el-table-column prop="ctime" label="创建时间">
          <template slot-scope="scope">{{timeFormat(scope.row.ctime)}}</template>
        </el-table-column>
        <el-table-column prop="utime" label="最后修改时间">
          <template slot-scope="scope">{{timeFormat(scope.row.utime)}}</template>
        </el-table-column>
        <el-table-column fixed="right" label="操作">
          <template slot-scope="scope">
            <el-button @click="deluser(scope.row.uuid)" type="text" size="small">删除</el-button>
            <el-button type="text" size="small" @click="xguser(scope.row)">编辑</el-button>
          </template>
        </el-table-column>
      </el-table>
    </el-card>
    <!-- 添加用户弹窗 -->
    <el-dialog title="添加用户" :visible.sync="addDialogVisible" width="50%" @close="addDialogClosed">
      <el-form :model="addForm" ref="addFormRef" label-width="70px">
        <!-- 用户名 -->
        <el-form-item label="用户名" prop="username">
          <el-input v-model="addForm.name"></el-input>
        </el-form-item>
        <!-- 密码 -->
        <el-form-item label="密码" prop="password">
          <el-input v-model="addForm.password"></el-input>
        </el-form-item>
        <!-- 邮箱 -->
        <el-form-item label="邮箱" prop="email">
          <el-input v-model="addForm.mail"></el-input>
        </el-form-item>
        <el-form-item label="权限">
          <el-select v-model="addForm.role" placeholder="请选择权限">
            <el-option label="管理员" value="1"></el-option>
            <el-option label="版主" value="2"></el-option>
            <el-option label="注册会员" value="3"></el-option>
          </el-select>
        </el-form-item>
      </el-form>
      <!-- 内容底部区域 -->
      <span slot="footer" class="dialog-footer">
        <el-button @click="addDialogVisible = false">取 消</el-button>
        <el-button type="primary" @click="addUser">确 定</el-button>
      </span>
    </el-dialog>

    <!-- 添加用户弹窗 -->
    <el-dialog title="修改用户" :visible.sync="xinuseris" width="50%" @close="xgDialogClosed">
      <el-form :model="xinuser" ref="xgFormRef" label-width="70px">
        <!-- 用户名 -->
        <el-form-item label="用户名" prop="username">
          <el-input v-model="xinuser.name"></el-input>
        </el-form-item>
        <!-- 密码 -->
        <el-form-item label="密码" prop="password">
          <el-input v-model="xinuser.password"></el-input>
        </el-form-item>
        <!-- 邮箱 -->
        <el-form-item label="邮箱" prop="email">
          <el-input v-model="xinuser.mail"></el-input>
        </el-form-item>
        <el-form-item label="权限">
          <el-select v-model="xinuser.role" placeholder="请选择权限">
            <el-option label="管理员" value="1"></el-option>
            <el-option label="版主" value="2"></el-option>
            <el-option label="注册会员" value="3"></el-option>
          </el-select>
        </el-form-item>
      </el-form>
      <!-- 内容底部区域 -->
      <span slot="footer" class="dialog-footer">
        <el-button @click="xinuseris = false">取 消</el-button>
        <el-button type="primary" @click="xguserhou">确 定</el-button>
      </span>
    </el-dialog>
  </div>
</template>

<script>
export default {
  data() {
    return {
      tableData: [],
      addDialogVisible: false,
      //   控制修改用户对话框显示/隐藏
      editDialogVisible: false,
      addForm: {
        name: "",
        password: "",
        mail: "",
        role: ""
      },
      queryInfo: {
        query: ""
      },
      userisnot: {
        uuid: "",
        isout: ""
      },
      xinuser: {
        uuid: "",
        name: "",
        password: "",
        mail: "",
        role: ""
      },
      xinuseris: false,
    };
  },
  created() {
    this.getUserList();
  },
  methods: {
    async getUserList() {
      const { data: res } = await this.$http.get("ulist");
      if (res.state == "200") {
        this.tableData = res.t;
      } else {
        this.$message.error("操作失败!");
      }
    },
    timeFormat(ts) {
      return new Date(ts).toLocaleString().replace(/:\d{1,2}$/, " ");
    },
    // 监听添加用户
    addDialogClosed() {
      this.$refs.addFormRef.resetFields(); // 重置表单项
    },
    // 监听修改用户
    xgDialogClosed() {
      this.$refs.xgFormRef.resetFields(); // 重置表单项
    },
    // 修改用户状态
    async userStateChanged(userinfo) {
      this.userisnot.uuid = userinfo.uuid;
      this.userisnot.isout = userinfo.isout;

      const { data: res } = await this.$http.post("uupdate", this.userisnot);
      if (res.state != "200") {
        return this.$message.error(res.t);
      }
      this.$message.success(res.t);
    },
    // 添加用户
    addUser() {
      this.$refs.addFormRef.validate(async valid => {
        console.log(valid);
        if (!valid) return;
        // 发起请求
        const { data: res } = await this.$http.post("uadd", this.addForm);
        if (res.state != "200") {
          return this.$message.error(res.t);
        }
        this.$message.success(res.t);
        //隐藏
        this.addDialogVisible = false;
        this.getUserList();
      });
    },
    async deluser(uuid){
      const { data: res } = await this.$http.get("udel/"+uuid);
      if (res.state != "200") {
        return this.$message.error(res.t);
      }
      this.$message.success(res.t);
      this.getUserList();
    },
    xguser(us){
      this.xinuser.uuid = us.uuid;
      this.xinuser.name = us.name;
      this.xinuser.password = us.password;
      this.xinuser.mail = us.mail;
      this.xinuser.role = us.role;
      
      this.xinuseris = true;
    },
    async xguserhou(){
      const { data: res } = await this.$http.post("uupdate",this.xinuser);
      if (res.state != "200") {
        return this.$message.error(res.t);
      }
      this.$message.success(res.t);
      this.xinuseris = false;
      this.getUserList();
    },
  }
};
</script>

<style lang="less" scoped>
</style>
