<template>
	<div class="login_container">
		<div class="login_box">
			<div class="avatar_box">
				<!--头像-->
				<img src="../assets/logo.png" @click="gohome()"/>
			</div>
		<div>
			<!--添加表单-->
			<el-form ref="loginFromRe" :rules="losinRules" :model="loginfrom" class="login_from" label-width="0">
				<el-form-item prop="username">
					<el-input v-model="loginfrom.name" prefix-icon="el-icon-user-solid" ></el-input>
				</el-form-item>
				<el-form-item prop="password">
					<el-input v-model="loginfrom.password" prefix-icon="el-icon-key" type="password" ></el-input>
				</el-form-item>
				<el-form-item class="btns">
					<el-button type="primary" @click="login">提交</el-button>
					<el-button type="info" @click="resetLoGin">重置</el-button>
				</el-form-item>
			</el-form>
		</div>
		</div>
	</div>
</template>

<script>
	export default {
		data() {
			return{
				loginfrom: {
					name: "admin",
					password: "admin",
				},
				losinRules: {
				// 	username:[
				// 		{ required: true, message: '请输入用户名称', trigger: 'blur' },
				// 		{ min: 5, max: 12, message: '长度在 5 到 12 个字符', trigger: 'blur' }
				// ],
					// password:[
					// 	{ required: true, message: '请输入用户密码', trigger: 'blur' },
					// 	{ min: 5, max: 10, message: '长度在 5 ~ 10 个字符', trigger: 'blur' }
					// ], 
				},
			};
		},
		methods: {
			//重置表单
			resetLoGin(){
				this.$refs.loginFromRe.resetFields();
			},
			//登录方法
			login(){
				//1验证效验规则
				this.$refs.loginFromRe.validate(async valid =>{
					if(!valid) return;//效验失败
					const {data:res} = await this.$http.post("login",this.loginfrom );//访问后台
					console.log(res);
					if(res.state === "200"){
						window.sessionStorage.setItem('user_token',res.t.token);
						window.sessionStorage.setItem('flag',res.t.user.uuid); // session 放置
						window.sessionStorage.setItem('role',res.t.user.role);
						this.$message.success("操作成功!!!!!!");//信息提示
						this.$router.push({path: "/home"});//页面跳转
						console.log(res.user);
					}else{
						this.$message.error(res.t);
					}
				});
			},
			gohome(){
				this.$router.push("/home/index");
			},
		},
	}
</script>

<style lang="less" scoped>

//根节点
.login_container{
	background-color: #2b4b6b;
	height: 100%;
}

//登录框
.login_box{
	width: 450px;
	height: 300px;
	background-color: #fff;
	border-radius: 5px;// 圆角
	position: absolute;// 绝对定位
	left: 50%;
	top: 50%;
	transform: translate(-50%, -50%);// 根据自己位置 以自己为长度位移
	//头像框
	.avatar_box{
		width: 130px;
		height: 130px;
		border: 1px solid #eee;
		border-radius: 50%;
		padding: 10px;
		box-shadow: 0 0 10px #ccc;// 盒子阴影
		position: absolute;
		left: 50%;
		transform: translate(-50%, -50%);
		background-color: #fff;
		img{
			width: 100%;
			height: 100%;
			border-radius: 50%;
			background-color: #eee;
		}
	}
}


.btns{
	display: flex;// 弹性布局
	justify-content: flex-end;// 尾部对齐
}
.login_from{
	position: absolute;
	bottom: 0%;
	width: 100%;
	padding: 0 20px;
	box-sizing: border-box;// 设置边框
}


</style>
