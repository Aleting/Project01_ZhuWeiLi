<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/10/24
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()   + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
    <!-- load css -->
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/common/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/login.css" media="all">
    <link rel="shortcut icon" href="<%=basePath%>/static/image/favicon.ico" type="image/x-icon" />
    <style>
        #img{
            border-radius:50%
        }
    </style>
    <script type="text/javascript">
        function loginStroe() {
            location.href = "<%=basePath%>user/admin2"
        }
        function reg() {
            location.href = "<%=basePath%>/home/register"
        }
    </script>
</head>
<body>
<form action="" method="post" class="layui-form">
    <div class="layui-canvs"></div>
    <div class="layui-layout layui-layout-login" style="position:static">
        <h1>
            <strong>助微力微商管理系统</strong>
            <em>Microbusiness Management System</em>
        </h1>

        <img id ="img" src="/static/images/开始页面.jpg"/>
       <div class="row">
           <div class="col-md-6 layui-submit larry-login" style="width:100px;">
               <button type="button"  onclick="reg()" class="layui-btn layui-btn-warm" >开店</button>

           </div>
           <div class="col-md-6 layui-submit larry-login" style="width:100px;margin-left:80px;" >
               <button type="button" onclick="loginStroe()" class="layui-btn layui-btn-warm" >进店</button>
           </div>
       </div>
        <div class="layui-login-text">
            <p>© 2018助微力团队</p>
            <p>版权所有</p>

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




</script>
</body>
</html>