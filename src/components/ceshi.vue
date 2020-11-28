<template>
  <div>
      <p>{{sd}}</p>
      
  </div>
</template>

<script>
export default {
  data() {
      return{
      sd: "",
      user: {
          username: "admin",
          password: "admin"
      }
    };
  },
  created() {
      this.getpinglunList();
    //   this.activePath = window.sessionStorage.getItem('activePath');// 取出session里的访问路径
    },
  methods: {
        async getpinglunList() {
        // 调用请求
        const { data: res1 } = await this.$http.post("/login",this.user);
        // this.pingluns = res1; // 将返回数据赋值
        console.log(res1)
        },
        timeFormat(ts){
            return new Date(ts).toLocaleString().replace(/:\d{1,2}$/,' '); 
        }
    },
};

</script>

<style lang="less" scoped>
</style>
