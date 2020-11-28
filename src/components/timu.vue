<template>
  <div>
      <h2>标题:{{ wenti.timu }}</h2>
      <h4 v-html="wenti.neirong"></h4>
      <p>所属话题:{{ wenti.huati }}</p>
      <span>作者:{{(wenti.user)}}&nbsp;&nbsp;创建时间:{{ timeFormat(wenti.ctime) }}</span> 

    <div v-for="(pl,index) in pingluns" :key="pl.uuid">
        <h2>评论{{ index+1 }}</h2>
        <p>详情:{{pl.wenti}}</p>
        <p v-html="pl.neirong"></p>
        <span>作者:{{(pl.user)}}&nbsp;&nbsp;创建时间:{{ timeFormat(pl.ctime) }}</span> 
    </div>
    <br/>
    <br/>
    <div>
        <el-form ref="loginFromRe" :model="pinglun" class="login_from" style="width:300px">
            <!-- <el-form-item label="neirong">
                <el-input v-model="pinglun.neirong" style="width:300px"></el-input>
            </el-form-item> -->
            <el-form-item >
                <textarea cols="50" rows="10" v-model="pinglun.neirong">text2</textarea>
            </el-form-item>
            <el-form-item>
                <el-button type="primary" @click="onSubmit">提交</el-button>
                <el-button @click="this.pinglun.neirong = '' ">取消</el-button>
            </el-form-item>
        </el-form>
    </div>
  </div>
</template>

<script>
export default {
  data() {
      return{
      uuid: '',
      wenti: [],
      pingluns: [],
      sd: "",
      pinglun: {
          user: '',
          neirong: ' ',
          wenti: '',
      }
    };
  },
  created() {
      this.pinglun.wenti = window.sessionStorage.getItem('wenti');
      this.pinglun.user = window.sessionStorage.getItem('flag');
      this.uuid = this.$route.params.id;
      this.getwentiList();
    //   this.activePath = window.sessionStorage.getItem('activePath');// 取出session里的访问路径
    },
  methods: {
        async onSubmit() {
            if(this.pinglun.user.length >5){
            const { data: res } = await this.$http.post("/padd",this.pinglun);
            }else{
            this.$message.error("未登录操作失败!")
            this.$router.push("/login");
            }
            this.$router.go(0);
        },
        async getwentiList() {
        // 调用请求
        if(this.pinglun.wenti.length !=0){
            const { data: res } = await this.$http.get("/wid/"+this.pinglun.wenti);
            // console.log(res);
            this.wenti = res.t; // 将返回数据赋值
            this.getpinglunList();
        }else{
            this.$message.error("操作失败!")
            this.$router.push("/home");
        }
        },
        async getpinglunList() {
        // 调用请求
        const { data: res1 } = await this.$http.get("/pid/"+this.pinglun.wenti);
        this.pingluns = res1.t; // 将返回数据赋值
        },
        timeFormat(ts){
            return new Date(ts).toLocaleString().replace(/:\d{1,2}$/,' '); 
        }
    },
};

</script>

<style lang="less" scoped>
</style>
