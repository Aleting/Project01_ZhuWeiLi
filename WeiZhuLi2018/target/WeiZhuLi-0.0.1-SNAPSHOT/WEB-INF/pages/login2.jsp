<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/10/8
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<% String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()   + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="author" content="order by dede58.com"/>
    <title>LarryCMS后台登录</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <!-- load css -->


    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/layui/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/login.css" media="all">

</head>
<body>
<form action="${pageContext.request.contextPath}/user/checklogin" method="post" class="layui-form">
    <div class="layui-canvs">
    </div>
    <div class="layui-layout layui-layout-login">
        <h1>
            <strong>助微力微商管理系统</strong>
            <em>Microbusiness Management System</em>
        </h1>
        <div class="layui-user-icon larry-login">
            <input type="text" for="inputEmail" placeholder="账号" id="inputEmail" class="login_txtbx" name="sellerLoginName" lay-verify="username" required autofocus/>
        </div>
        <div class="layui-pwd-icon larry-login">
            <input type="password" for="inputPassword" placeholder="密码" id="inputPassword" class="login_txtbx" value="" name="sellerPassword" lay-verify="pass" required/>
        </div>
        <div class="layui-val-icon larry-login">
            <div class="layui-code-box">
                <input type="text" id="code" name="code" placeholder="验证码" maxlength="4" class="login_txtbx">
                <img src="images/verifyimg.png" alt="" class="verifyImg" id="verifyImg" onClick="javascript:this.src='xxx'+Math.random();">
            </div>
        </div>
        <p>${error}</p>
        <div class="layui-submit larry-login">
            <button lay-submit=""  lay-filter="*" class="submit_btn"  class="btn btn-lg btn-primary btn-block">立即登录</button>

        </div>
        <div class="layui-login-text">
            <p>© 2016-2017 Larry 版权所有</p>
            <a href="${pageContext.request.contextPath}/home/register"><p>马上注册</p></a>


        </div>
    </div>
</form>
<script type="text/javascript" src="<%=basePath%>/static/common/layui/lay/dest/layui.all.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/js/login.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/jsplug/jparticle.jquery.js"></script>
<script type="text/javascript">

    $(function(){
        $(".layui-canvs").jParticle({
            background: "#141414",
            color: "#E6E6E6"
        });
    });




    layui.use('form', function(){
        var form = layui.form();

        //console.log(data.elem) //被执行事件的元素DOM对象，一般为button对象
        // console.log(data.form) //被执行提交的form对象，一般在存在form标签时才会返回
        // console.log(data.field) //当前容器的全部表单字段，名值对形式：{name: value}
        //return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
        //监听提交
         form.on('submit(*)', function(data){
           // layer.alert(JSON.stringify(data.field), {
            //     title: '最终的提交信息'
           //  })
         //   location.href="index.html"
            // return false;
             document.location = '${pageContext.request.contextPath}/index1'

         });


        //自定义验证
        form.verify({
            username: function(value, item){ //value：表单的值、item：表单的DOM对象
                if(!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(value)){
                    return '用户名不能有特殊字符';
                }
                if(/(^\_)|(\__)|(\_+$)/.test(value)){
                    return '用户名首尾不能出现下划线\'_\'';
                }
                if(/^\d+\d+\d$/.test(value)){
                    return '用户名不能全为数字';
                }
                return false;
            }
//我们既支持上述函数式的方式，也支持下述数组的形式
            //数组的两个值分别代表：[正则匹配、匹配不符时的提示文字]
            ,pass: [
                /^[\S]{6,12}$/
                ,'密码必须6到12位，且不能出现空格'
            ]
        });

    });
</script>
</body>
</html>