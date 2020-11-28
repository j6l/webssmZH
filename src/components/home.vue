<template>
  <el-container class="home-container">
    <el-header>
      <div>
        <img src="../assets/zlogo.png" alt class="logo_img" />
        <span @click="gohome">网络在线问答平台</span>
      </div>
      <div>
        <el-button type="success" @click="isdenguser" >{{login}}</el-button>
        <el-button type="warning" @click="goout">安全退出</el-button>
      </div>
    </el-header>
    <el-main>
       <router-view></router-view>
    </el-main>
  </el-container>
</template>

<script>
export default {
  data() {
      return {
          isdeng: false,
          login: "登录",
          serflag: "",
      };
  },
  created() {
      this.serflag = window.sessionStorage.getItem('flag');
      this.isdenglu();
    },
  methods: {
    isdenglu(){
      if(this.serflag.length!=0){
        this.isdeng= true;
        this.login="个人中心";
      }else{
        this.isdeng= false;
        this.login="登录";
      }
    },
    isdenguser(){
      if(this.isdeng){
        this.zhogn();
      }else{
        this.indexuser();
      }
    },
    zhogn(){
      this.$router.push("/zhongxin");
    },
    goout() {
      window.sessionStorage.clear();
      this.$router.push("/home/index");
      this.$router.go(0);
    },
    indexuser(){
      this.$router.push("/login");
    },
    gohome(){
      this.$router.push("/home/index");
    }
  }
};
</script>

<style lang="less" scoped>
//主题
.el-main {
  background-color: #eaedf1;
}
.home-container {
  height: 100%;
}
.el-header {
  background-color: #1BB6E0;
  display: flex;
  justify-content: space-between; // 左右贴边
  padding-left: 0%; // 左边界
  align-items: center; // 水平
  color: #fff;
  font-size: 20px;
  > div {
    //左侧div加布局
    display: flex;
    align-items: center;
    span {
      margin-left: 15px;
    }
  }
}

.logo_img {
  width: 20%;
  height: 80%;
}
</style>
