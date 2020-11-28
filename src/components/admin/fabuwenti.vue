<template>
  <div>
    <el-row >
      <el-col :span="3">
        <h3>题目:</h3>
      </el-col>
      <el-col :span="10">
        <el-input
          type="text"
          prefix-icon="el-icon-s-order"
          placeholder="请输入内容"
          maxlength="10"
          show-word-limit
          v-model="user.timu"
        ></el-input>
      </el-col>

      <el-col :span="5" :offset="6">
        <el-select v-model="huati1.wid" placeholder="所属话题">
          <el-option v-for="id in huati" :key="id.uuid" :label="id.wid" :value="id.uuid"></el-option>
        </el-select>
      </el-col>
    </el-row>
    <mavon-editor v-model="value" @save="tohtml" />
    <!-- <el-button type="primary" @click="mdhtml" ></el-button> -->
  </div>
</template>

<script>
export default {
  data() {
    return {
      value: "",
      user: {
        userid: "",
        huati: "",
        timu: "",
        neirong: ""
      },
      huati: {
      },
      huati1:{
          wid: "科技",
      }
    };
  },
  created() {
    this.user.userid = window.sessionStorage.getItem("flag");
    this.gethuati();
  },
  methods: {
      async gethuati(){
          const { data: res} = await this.$http.get("hlist");
          this.huati = res.t;
      },
    async tohtml(value, render) {
      // let html = this.$refs['editor'].d_render;
      // .editor.;
      this.user.huati = this.huati1.wid;
      this.user.neirong = render;
      const { data: res } = await this.$http.post("wadd", this.user);
      if (res.state != "200") {
          this.$message.error(res.t);
      }else{
          this.$message.success(res.t);
          this.$router.go(0);
      }
    }
  }
};
</script>

<style lang="less" scoped>
</style>
