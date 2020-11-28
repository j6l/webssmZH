<template>
  <el-container class="home-container">
    <el-header>
        <div>
            <p>&nbsp;&nbsp;Everyone of us is dfferent,just as there are no two identical leaves in the world.</p>
        </div>
      <div>
        <el-button type="primary" @click="gohome">返回主页</el-button>
        <el-button type="primary" @click="logout">退出</el-button>
      </div>
    </el-header>
    <el-container>
      <el-aside width="200px">
        <el-menu
          background-color="#545c64"
          text-color="#fff"
          active-text-color="#ffd04b"
          :router="true"
        >
          <!-- <el-submenu v-for="item in menuList" :key="item.id">
                      <template slot="title">
                        <span >{{item.title}}</span>
                      </template>
          </el-submenu>-->
          <el-menu-item v-if="isadmin.isout < 2" index="/zhongxin/adminuser">用户管理</el-menu-item>
          <el-menu-item v-if="isadmin.isout < 3" index="/zhongxin/userhuati">话题管理</el-menu-item>
          <el-menu-item-group>
            <template slot="title">分组一</template>
            <el-menu-item index="/zhongxin/userwenti">我的问题</el-menu-item>
            <el-menu-item index="/zhongxin/userpinglun">我的评论</el-menu-item>
            <el-menu-item index="/zhongxin/fabuwenti">发布问题</el-menu-item>
          </el-menu-item-group>
        </el-menu>
      </el-aside>
      <el-main>
        <div>
          <router-view></router-view>
        </div>
      </el-main>
    </el-container>
  </el-container>
</template>

<script>
export default {
  data() {
    return {
      // 左侧菜单
      menuList: [
        {
          id: 1,
          title: "asd"
        },
        {
          id: 2,
          title: "asd"
        },
        {
          id: 1,
          title: "asd"
        }
      ],
      isadmin:{
        isout: "",
      },
    };
  },
  created() {
      this.isadmin.isout = window.sessionStorage.getItem('role');
      this.luoji();
  },
  methods: {
    logout() {
      window.sessionStorage.clear();
      this.$router.push("/home");
    },
    gohome() {
      this.$router.push("/home");
    },
    luoji(){
      if(this.isadmin.isout == 1){
          
        }else if(this.isadmin.isout == 2){
          this.$router.push("/zhongxin/userhuati");
        }else if(this.isadmin.isout == 3){
          this.$router.push("/zhongxin/userwenti");
        }else{
          this.$router.push("/login");
        }
    }
  }
};
</script>

<style lang="less" scoped>
//头
.el-header {
  background-color: #1bb6e0;
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

//侧边
.el-aside {
  background-color: #4a5064;
  .el-menu {
    border-right: none; // 对其右边框
  }
}

//主题
.el-main {
  background-color: #eaedf1;
}
.home-container {
  height: 100%;
}
.iconfont {
  margin-right: 10px;
}
.toggle-button {
  background-color: #4a5064;
  font-size: 10px;
  line-height: 24px;
  color: #fff;
  text-align: center;
  letter-spacing: 0.2em;
  cursor: pointer; // 显示鼠标指针为：小手
}

.el-header {
  background-color: #1bb6e0;
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
</style>
