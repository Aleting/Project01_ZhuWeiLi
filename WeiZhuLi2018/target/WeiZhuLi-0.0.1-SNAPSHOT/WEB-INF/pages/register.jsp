<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/10/9
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()   + path + "/";
%>
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


    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/common/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/login.css" media="all">

</head>
<body>
<form action="" method="post" class="layui-form">
    <div class="layui-canvs">
    </div>
    <div class="layui-layout layui-layout-login">
        <h1>
            <strong>助微力微商管理系统</strong>
            <em>Microbusiness Management System</em>
        </h1>
        <div class="layui-user-icon larry-login">
            <input type="text" for="inputEmail" placeholder="昵称" id="inputEmail" class="login_txtbx" name="seller_login_name" lay-verify="seller_login_name" required autofocus />
        </div>
        <div class="layui-pwd-icon larry-login">
            <input type="text" for="inputPassword" placeholder="真实姓名" id="inputname" class="login_txtbx" value="" name="seller_real_name" lay-verify="seller_real_name" required/>
        </div>
        <div class="layui-val-icon larry-login">
            <input type="text" for="inputPassword" placeholder="密码" id="inputPassword" class="login_txtbx" value="" name="seller_password" lay-verify="seller_password" required/>
        </div>
        <div class="layui-val-icon larry-login">
            <input type="text" for="inputPassword" placeholder="确认密码" id="inputrePassword" class="login_txtbx" value="" name="seller_repassword" lay-verify="seller_repassword" required/>
        </div>
        <div class="layui-val-icon larry-login">
            <input type="text" for="inputPassword" placeholder="邮箱" id="input1email" class="login_txtbx" value="" name="seller_mailbox" lay-verify="seller_mailbox" required/>
            " required/>
        </div>
        <%--<div class="layui-val-icon larry-login">--%>
            <%--<input type="text" for="inputPassword" placeholder="推荐人" id="inputtuijianname" class="login_txtbx" value="" name="seller_id" lay-verify="seller_id" required/>--%>
        <%--</div>--%>
        <div class="layui-submit larry-login">
            <button lay-submit=""  lay-filter="*" class="submit_btn" name="demo1" class="btn btn-lg btn-primary btn-block">注册</button>

        </div>
        <div class="layui-submit larry-login">
            <button   class="submit_btn"onClick="javascript:history.back(-1);"  class="btn btn-lg btn-primary btn-block">取消</button>
        </div>
        <div class="layui-login-text">
            <p>© 2018助微力团队版权所有</p>



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
    //触发事件

    //
    layui.use('form', function(){
        var form = layui.form();
        $("#inputrePassword").blur(function(){
            if( $("#inputrePassword").val()!=$("#inputPassword").val())
            {
                layer.msg('密码不相同');
            }
        });
        //console.log(data.elem) //被执行事件的元素DOM对象，一般为button对象
        // console.log(data.form) //被执行提交的form对象，一般在存在form标签时才会返回
        // console.log(data.field) //当前容器的全部表单字段，名值对形式：{name: value}
        //return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
        //监听提交
       form.on('submit(*)', function(data){
            layer.msg('邮件发送，请前往邮箱激活！',{time: 5000, icon:6});


                             var a=JSON.stringify(data.field);   //获取到表的的每一个数据 用键值段存储
                             $.ajax({
                                 url:"<%=basePath%>/user/seller_register",                   //数据接口
                                 type:"post",
                                 data:{"add":a},  //序列化表单                       键值段
                                 dataType:"json",
                                 success:function (data) {     //返回值data为{"result":"提交成功"}
                                     // alert("邮件发送，请前往邮箱激活！")
                                 }
                             });



           layer.open({
               type: 1
               ,title: false //不显示标题栏
               ,closeBtn: false
               ,area: '300px;'
               ,shade: 0.8
               ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
               ,btn: ['确认']
               ,btnAlign: 'c'
               ,moveType: 1 //拖拽模式，0或者1
               ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">邮件发送成功，请前往邮箱激活。</div>'
               ,success: function(layero){
                   var btn = layero.find('.layui-layer-btn');
                   btn.find('.layui-layer-btn0').attr({
                       href:  '<%=basePath%>home/start'
                       ,target: '_blank'
                   });
               }
           });

            <%--window.setTimeout(location.href = "<%=basePath%>home/start",5000);--%>
             return false;


        });

        //自定义验证
        //验证邮箱

        form.verify({
            seller_login_name: function(value, item){ //value：表单的值、item：表单的DOM对象
                if(!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(value)){
                    return '用户名不能有特殊字符';
                }
                if(/(^\_)|(\__)|(\_+$)/.test(value)){
                    return '用户名首尾不能出现下划线\'_\'';
                }
                if(/^\d+\d+\d$/.test(value)){
                    return '用户名不能全为数字';
                }
                var flag=-1;
                $.ajax({
                    url : "<%=basePath%>/user/select_name/"+value,//请求地址
                    dataType : "JSON",//数据格式
                    type : "GET",//请求方式
                    async:false,
                    success : function(result) {//如果请求成功，返回数据。
                           flag = result;
                    },
                })
                if(flag==0){
                    return '用户名已被占用！'
                }
                return false;
            }
//我们既支持上述函数式的方式，也支持下述数组的形式
            //数组的两个值分别代表：[正则匹配、匹配不符时的提示文字]
            ,seller_password: [
                /^[\S]{6,12}$/
                ,'密码必须6到12位，且不能出现空格'
            ]
            ,seller_mailbox: [
                /^[a-z0-9._%-]+@([a-z0-9-]+\.)+[a-z]{2,4}$|^1[3|4|5|7|8]\d{9}$/
                , '邮箱格式不对'
            ]
        });

    });
</script>
</body>
</html>