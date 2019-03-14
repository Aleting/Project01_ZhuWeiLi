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
    <meta http-equiv="refresh" content="5;url=http://xbnzs.cn:8080/home/start">
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
    <!-- load css -->
    <script type="text/javascript" src="<%=basePath%>/static/js/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/common/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/login.css" media="all">
    <script type="text/javascript" src="<%=basePath%>/static/js/jquery.beattext.js"></script>

    <script type="text/javascript" src="<%=basePath%>/static/js/easying.js"></script>
    <script type="text/javascript">

        $(document).ready(function() {
            /*
             *  参数详解:
             *	upTime			上移的时间
             *	downTime		下落的时间
             *	beatHeight		上移高度
             *	isAuth			是否自动
             *	isRotate		是否旋转
            */
            $('h1#autoRotateText').beatText({isAuth:true,upTime:700,downTime:700,beatHeight:"3em",isRotate:true});

        });

    </script>
    <style>

        /*下面两个是核心样式*/
        .beat-char {
            line-height: 3.4em;
            position: relative;
            display: inline-block;
            background: transparent;

        }

        .rotate{
            transform:rotate(360deg) ;
            -ms-transform:rotate(360deg); 	/* IE 9 */
            -moz-transform:rotate(360deg); 	/* Firefox */
            -webkit-transform:rotate(360deg); /* Safari 和 Chrome */
            -o-transform:rotate(360deg);
            -webkit-transition-duration: 0.7s;

        }
    </style>
</head>
<body>
<form action="" method="post" class="layui-form">
    <div class="layui-canvs"></div>
    <div class="layui-layout layui-layout-login" style="position:static">
        <h1>
            <strong>助微力微商管理系统</strong>
            <em>Microbusiness Management System</em>
        </h1>
        <h1 id="autoRotateText">对不起,您的用户名或者状态码无效，正在自动跳转</h1>
        <div class="layui-login-text">
            <p>© 2018青岛理工大学助微力团队</p>
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