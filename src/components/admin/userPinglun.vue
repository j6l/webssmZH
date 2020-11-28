<template>
    <div>
        <el-table :data="pinglulist" stripe style="width: 100%">
            <el-table-column prop="uuid" label="ID"></el-table-column>
            <el-table-column prop="wenti" label="所属问题"></el-table-column>
            <el-table-column prop="neirong" label="内容" width="180"></el-table-column>
            <el-table-column prop="biaoji" label="是否加红"></el-table-column>
            <el-table-column prop="ctime" label="创建时间">
                <template slot-scope="scope">{{timeFormat(scope.row.ctime)}}</template>
            </el-table-column>
            <el-table-column fixed="right" label="操作">
              <template slot-scope="scope">
                <el-button @click="delpinglu(scope.row.uuid)" type="text" size="small">删除</el-button>
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
            pinglulist:[],
            user:{
                uuid: "",
            }
            
        };
    }, 
    created() {
     this.user.uuid = window.sessionStorage.getItem('flag');
     this.getpinglulist();
    },
    methods: {
    async getpinglulist(){
      const { data: res } = await this.$http.get("puid/"+this.user.uuid);
      if (res.state != "200") {
        return this.$message.error(res.t);
      }
      console.log(res)
      this.pinglulist = res.t;
      this.$message.success(res.t);
    },
    timeFormat(ts) {
      return new Date(ts).toLocaleString().replace(/:\d{1,2}$/, " ");
    },
    async delpinglu(uuid){
      const { data: res } = await this.$http.get("pdel/"+uuid);
      if (res.state != "200") {
        return this.$message.error(res.t);
      }
      this.$message.success(res.t);
      this.getpinglulist();
    },
  }
};


</script>

<style lang="less" scoped>

</style>
