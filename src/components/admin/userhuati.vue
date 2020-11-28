<template>
    <div>
        <div>
            <el-row :gutter="25">
                <el-col :span="5" :offset="18">
                <el-button type="primary" @click="addhuati = true">添加话题</el-button>
                </el-col>
            </el-row>
            <el-table :data="huatilist" stripe style="width: 100%">
                <el-table-column prop="uuid" label="ID"></el-table-column>
                <el-table-column prop="wid" label="名称"></el-table-column>
                <el-table-column prop="ctime" label="创建时间">
                    <template slot-scope="scope">{{timeFormat(scope.row.ctime)}}</template>
                </el-table-column>
                <el-table-column fixed="right" label="操作">
                <template slot-scope="scope">
                    <el-button @click="delhuati(scope.row.uuid)" type="text" size="small">删除</el-button>
                    <el-button @click="xghuati(scope.row.uuid,scope.row.wid)" type="text" size="small">修改</el-button>
                </template>
            </el-table-column>
            </el-table>
        </div>
        <el-dialog title="修改话题" :visible.sync="ishuati" width="50%" @close="ishuatiDialogClosed">
            <el-form :model="huati" ref="huatiFormRef" label-width="70px">
                <el-form-item label="话题" prop="wid">
                <el-input v-model="huati.wid"></el-input>
                </el-form-item>
            </el-form>
            <span slot="footer" class="dialog-footer">
                <el-button @click="ishuati = false">取 消</el-button>
                <el-button type="primary" @click="uphuati">确 定</el-button>
            </span>
        </el-dialog>
        <el-dialog title="添加话题" :visible.sync="addhuati" width="50%" @close="addhuatiDialogClosed">
            <el-form :model="huati" ref="addhuatiFormRef" label-width="70px">
                <el-form-item label="话题" prop="wid">
                <el-input v-model="huati.wid"></el-input>
                </el-form-item>
            </el-form>
            <span slot="footer" class="dialog-footer">
                <el-button @click="addhuati = false">取 消</el-button>
                <el-button type="primary" @click="tianjiahuati">确 定</el-button>
            </span>
        </el-dialog>

    </div>
    
</template>

<script>
export default {
  data(){
        return{
            huatilist:[],
            user:{
                uuid: "",
            },
            huati:{
                uuid: "",
                wid: "",
            },
            ishuati: false,
            addhuati: false,
            
        };
    }, 
    created() {
     this.user.uuid = window.sessionStorage.getItem('flag');
     this.gethuatilist();
    },
    methods: {
    async gethuatilist(){
      let that=this;
      const { data: res } = await this.$http.get("hlist");
      if (res.state != "200") {
        return that.$message.error(res.t);
      }
      that.huatilist = res.t;
      that.$message.success(res.t);
    },
    timeFormat(ts) {
      return new Date(ts).toLocaleString().replace(/:\d{1,2}$/, " ");
    },
    async delhuati(uuid){
      const { data: res } = await this.$http.get("hdel/"+uuid);
      if (res.state != "200") {
        return this.$message.error(res.t);
      }
      this.$message.success(res.t);
      this.gethuatilist();
    },
    ishuatiDialogClosed(){
        this.$refs.huatiFormRef.resetFields();
    },
    addhuatiDialogClosed(){
        this.$refs.addhuatiFormRef.resetFields();
    },
    xghuati(uid,wid){
        this.huati.uuid = uid;
        this.huati.wid = wid;
        this.ishuati= true;
    },
    async uphuati(){
    const { data: res } = await this.$http.post("hupdate/",this.huati);
      if (res.state != "200") {
        return this.$message.error(res.t);
      }
      this.$message.success(res.t);
      this.gethuatilist();
      this.ishuati= false;
    },
    async tianjiahuati(){
    const { data: res } = await this.$http.post("hadd/",this.huati);
      if (res.state != "200") {
        return this.$message.error(res.t);
      }
      this.$message.success(res.t);
      this.gethuatilist();
      this.addhuati= false;
    },
  }
};
</script>

<style lang="less" scoped>

</style>
