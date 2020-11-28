<template>
    <div>
        <el-table :data="wentilist" stripe style="width: 100%">
            <el-table-column prop="uuid" label="ID"></el-table-column>
            <el-table-column prop="timu" label="题目"></el-table-column>
            <el-table-column prop="neirong" label="内容" width="180"></el-table-column>
            <el-table-column prop="huati" label="所属板块"></el-table-column>
            <el-table-column prop="ctime" label="创建时间">
                <template slot-scope="scope">{{timeFormat(scope.row.ctime)}}</template>
            </el-table-column>
            <el-table-column fixed="right" label="操作">
              <template slot-scope="scope">
                <el-button @click="delwenti(scope.row.uuid)" type="text" size="small">删除</el-button>
                <!-- <el-button type="text" size="small" @click="xguser(scope.row.uuid)">编辑</el-button> -->
              </template>
          </el-table-column>
    </el-table>
    </div>
</template>

<script>

export default {
    data(){
        return{
            wentilist:[],
            user:{
                uuid: "",
            }
            
        };
    }, 
    created() {
     this.user.uuid = window.sessionStorage.getItem('flag');
     this.getwentilist();
    },
    methods: {
    async getwentilist(){
      let that=this;
      const { data: res } = await this.$http.get("wuid/"+this.user.uuid);
      if (res.state != "200") {
        return that.$message.error(res.t);
      }
      that.wentilist = res.t;
      that.$message.success(res.t);
    },
    timeFormat(ts) {
      return new Date(ts).toLocaleString().replace(/:\d{1,2}$/, " ");
    },
    async delwenti(uuid){
      const { data: res } = await this.$http.get("wdel/"+uuid);
      if (res.state != "200") {
        return this.$message.error(res.t);
      }
      this.$message.success(res.t);
      this.getwentilist();
    },
  }
};


</script>

<style lang="less" scoped>

</style>
