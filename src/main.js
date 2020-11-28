import Vue from 'vue'
import App from './App.vue'
import router from './router'
import './plugins/element.js'
//导入axios
import axios from 'axios'
//挂载
Vue.prototype.$http = axios
//设置访问根目录
axios.defaults.baseURL = '/api'

axios.interceptors.request.use(config => {
  
  // 请求头挂载信息
  let token = window.sessionStorage.getItem("user_token");
  if (token != null) {
    config.headers['user_token'] = token;
  }
  let token1 = window.sessionStorage.getItem("Authorization");
  if (token != null) {
    config.headers['Authorization'] = "Bearer "+ token1;
  }
  
  
  console.log("config" + config);
  // 在最后必须return config
  return config;
})

Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
