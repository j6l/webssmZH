<template>
  <el-row :gutter="20">
    <el-col>
      <div class="grid-content bg-purple-light">
        <el-tabs :tab-position="tabPosition" @tab-click="xinwtlist">
          <el-tab-pane label="首页"  id="nu1">
              <div :router="true">
                <div v-for="wt in wlist" :key="wt.uuid">
                  <el-card class="box-card">
                    <div @click="gowenzhang(wt.uuid)">
                      <h3 v-html="wt.timu"></h3>
                      <br />
                      <p v-html="wt.neirong"></p>
                      <br />
                      <span>作者:{{(wt.userid)}}&nbsp;&nbsp;创建时间:{{ timeFormat(wt.ctime) }}</span>
                    </div>
                    <hr />
                  </el-card>
                </div>
              </div>
          </el-tab-pane>
          <el-tab-pane v-for="ht in huatilist" :key="ht.uuid" :label="ht.wid" :id="ht.uuid">
            <div :router="true">
                <div v-for="wt1 in xinwlist" :key="wt1.uuid">
                  <el-card class="box-card">
                    <div>
                      <h3 v-html="wt1.timu" @click="gowenzhang(wt1.uuid)"></h3>
                      <br />
                      <p v-html="wt1.neirong"></p>
                      <br />
                      <span>作者:{{(wt1.userid)}}&nbsp;&nbsp;创建时间:{{ timeFormat(wt1.ctime) }}</span>
                    </div>
                    <hr />
                  </el-card>
                </div>
              </div>
            </el-tab-pane>
          <el-tab-pane v-for="intro in introlucelist" :key="intro.id" :label="intro.type" :id="intro.id">
            <div>
            <p v-html="intro.content"></p>
            <p >{{intro.content}}</p>
            </div>
          </el-tab-pane>
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
      wlist: [], //首页问题
      huatilist: [], //话题列表
      xinwlist:[], //分类问题列表
      introlucelist:[], //公告
    };
  },
  created() {
    this.getUserList();
    this.gethuatilist();
    this.getinteoluce();
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
    },
    async gethuatilist(){
      let that=this;
      const { data: res } = await this.$http.get("hlist");
      if (res.state != "200") {
        return that.$message.error(res.t);
      }
      that.huatilist = res.t;
      that.$message.success(res.t);
    },
    async xinwtlist(tab, event) {
       let uuid = tab.$attrs['id'];
       if(uuid.length > 5) {
         const { data: res } = await this.$http.get("whtlist/"+uuid);
         this.xinwlist = res.t; // 将返回数据赋值
       }
    },
    async getinteoluce(){
      const { data: res } = await this.$http.get("ilist");
      this.introlucelist = res.t;
      console.log(res);
    }

  }
};
</script>

<style lang="less" scoped>
</style>
