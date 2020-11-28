<template>
  <el-row :gutter="20">
    <el-col :span="15" :offset="2">
      <!-- 问题列表 -->
      <el-row :router="true">
        <div>
          <el-col :span="20" :offset="2" v-for="wt in wlist" :key="wt.uuid">
            <el-card class="box-card">
              <div>
                <h3 v-html="wt.timu" @click="gowenzhang(wt.uuid)"></h3>
                <br />
                <p v-html="wt.neirong"></p>
                <br />
                <span>作者:{{(wt.userid)}}&nbsp;&nbsp;创建时间:{{ timeFormat(wt.ctime) }}</span>
              </div>
              <hr />
            </el-card>
          </el-col>
        </div>
      </el-row>
    </el-col>
    <el-col :span="5">
      <div class="grid-content bg-purple-light">
        <el-tabs :tab-position="tabPosition" style="height: 200px;">
          <el-tab-pane label="用户管理">用户管理</el-tab-pane>
          <el-tab-pane label="配置管理">配置管理</el-tab-pane>
          <el-tab-pane label="角色管理">角色管理</el-tab-pane>
          <el-tab-pane label="定时任务补偿">定时任务补偿</el-tab-pane>
        </el-tabs>
      </div>
    </el-col>
  </el-row>
</template>

<script>
export default {
  data() {
    return {
      tabPosition: "right",
      wlist: []
    };
  },
  created() {
    this.getUserList();
    //   this.activePath = window.sessionStorage.getItem('activePath');// 取出session里的访问路径
  },
  methods: {
    async getUserList() {
      // 调用请求
      const { data: res } = await this.$http.get("wlist");
      this.wlist = res.t.reverse(); // 将返回数据赋值
    },
    gowenzhang(id) {
      window.sessionStorage.setItem("wenti", id);
      this.$router.push("/home/zhuti");
    },
    gohome() {
      this.$router.push("/home");
    },
    timeFormat(ts) {
      return new Date(ts).toLocaleString().replace(/:\d{1,2}$/, " ");
    }
  }
};
</script>

<style lang="less" scoped>
</style>
