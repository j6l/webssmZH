import Vue from 'vue'
import VueRouter from 'vue-router'
import Index from '../components/index.vue'
import Timu from '../components/timu.vue'
import Home from '../components/home.vue'
import Login from '../components/Login.vue'
import Zhongxin from '../components/admin/zhongxin.vue'
import Adminuser from '../components/admin/adminuser.vue'
import Userwenti from '../components/admin/userWenti.vue'
import Userpinglun from '../components/admin/userPinglun.vue'
import Fabuwenti from '../components/admin/fabuwenti.vue'
import Userhuati from '../components/admin/userhuati.vue'
import mavonEditor from 'mavon-editor'
import 'mavon-editor/dist/css/index.css'
import Cssa from '../components/ceshi.vue'



Vue.use(VueRouter)

const routes = [
  {
    path: "/",
    redirect: "/home",
  },
  {
    path: "/login",
    component: Login,
  },
  {
    path: "/cs",
    component: Cssa,
  },
  {
    path: "/home",
    component: Home,
    redirect: "/home/index",
    children: [
      { path: '/home/index', component: Index },
      { path: '/home/zhuti', component: Timu }
    ],
  },
  {
    path: "/zhongxin",
    component: Zhongxin,
    redirect: "/zhongxin/adminuser",
    children: [
      { path: "/zhongxin/adminuser", component: Adminuser },
      { path: "/zhongxin/userhuati", component: Userhuati },
      { path: "/zhongxin/userwenti", component: Userwenti },
      { path: "/zhongxin/userpinglun", component: Userpinglun },
      { path: "/zhongxin/fabuwenti", component: Fabuwenti },
    ]
  },
  {
    path: '*', // 404 页面
    component: () => import('../views/About.vue') // 或者使用component也可以的

  },

]

Vue.use(mavonEditor)
new Vue({
  'el': '#main',
  data() {
    return { value: '' }
  }
})

const router = new VueRouter({
  routes
})

export default router
