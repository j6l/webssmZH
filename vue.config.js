
module.exports = {
  publicPath: './',
  css: {
    extract: false
  },
  devServer: {
    host: '0.0.0.0',
    // port: 9080,
    https: false,
    proxy: {
      '/api': {
        // target: 'http://localhost:8092/', 
        target: 'http://localhost:8080/webssmZH', // 设置你调用的接口域名和端口号 别忘了加http
        changeOrigin: true,
        secure: false,
        pathRewrite: {
          '^/api': '/' // 这里理解成用‘/api’代替target里面的地址，后面组件中我们掉接口时直接用api代替
        }
      }
    }
  }
};

