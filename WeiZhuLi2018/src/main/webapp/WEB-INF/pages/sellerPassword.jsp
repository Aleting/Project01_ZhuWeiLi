<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/10/10
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <% String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()   + path + "/";
    %>
    <%
        String id = request.getParameter("sellerId");
    %>
    <meta charset="UTF-8">
    <meta name="author" content="order by dede58.com"/>
    <title>个人信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/common/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/common/bootstrap/css/bootstrap.css" media="all">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/common/global.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/main.css" media="all">
    <script type="text/javascript" src="<%=basePath%>/static/js/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>/static/layui/layui/layui.all.js"></script>
</head>
<body>
<div class="larry-personal">
    <header class="larry-personal-tit">
        <span>修改密码</span>
    </header><!-- /header -->
    <div class="larry-personal-body clearfix changepwd">
        <form class="layui-form col-lg-4" method="post" action="" id="form">
            <div class="layui-form-item">
                <label class="layui-form-label">用户名</label>
                <div class="layui-input-block">
                    <%--<input type="text" name="title"  autocomplete="off"  class="layui-input"  lay-verify="username"  >--%>
                        <input type="text" name="seller_login_name" autocomplete="off" lay-verify="seller_login_name"   class="layui-input"  value="<%=request.getParameter("sellerLoginName")%>" disabled="disabled">

                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">旧密码</label>
                <div class="layui-input-block">
                    <%--<input type="password" name="title"  autocomplete="off"  class="layui-input" lay-verify="pass" value="" placeholder="请输入旧密码">--%>

                        <input type="password" class="layui-input" lay-verify="pass" placeholder="请输入旧密码" id="seller_password" >
                        <%--<input type="text" name="seller_id" value="${seller.seller_id}" hidden="hidden" id="seller_id">--%>
                        <%--<input type="text" value="${seller.seller_password}" hidden="hidden" id="p0">--%>


                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">新密码</label>
                <div class="layui-input-block">
                    <%--<input id="layui-input-new" type="password" lay-verify="pass" name="title"  autocomplete="off"  class="layui-input" value="" placeholder="请输入新密码">--%>
                        <input type="password" id="layui-input-new" lay-verify="pass" autocomplete="off"  class="layui-input" value="" placeholder="请输入新密码" name="seller_password" >
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">确认密码</label>
                <div class="layui-input-block">
                    <%--<input id="layui-input-confirm" type="password" lay-verify="pass" name="title"  autocomplete="off"  class="layui-input" value="" placeholder="请输入确认新密码"  >--%>
                        <input type="password" id="layui-input-confirm"  lay-verify="pass" autocomplete="off"  class="layui-input" value="" placeholder="请输入新密码"  >

                </div>
            </div>
            <div class="layui-form-item change-submit">
                <div class="layui-input-block">
                    <%--<button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>--%>
                    <%--<button type="reset" class="layui-btn layui-btn-primary">重置</button>--%>

                        <c:if test="${seller.seller_id != null}">
                            <button type="submit" lay-filter="demo1" lay-submit="" formaction="" class="btn btn-default"    id="bt">修改密码</button>
                        </c:if>
                        <button type="submit" class="layui-btn" onClick="javascript:history.back(-1);">取消</button>
                </div>
            </div>
        </form>
    </div>
</div>

<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/layui/layui.js"></script>
<%--onclick="return check(this.form)"--%>

<script type="text/javascript">
    $("#seller_password0").change(function(){
        text = $(this).val();
        seller_id = $(this).next().val();
        $.post("ajax_password",
            {
                seller_password:text,
                seller_id :seller_id
            },
            function(data,status){
                /*   alert("数据: \n" + data + "\n状态: " + status);  */
                if(data == 'true'){
                    $("#bt").attr("disabled",false);
                }
                if(data == 'false'){
                    $("#bt").attr("disabled",true);
                }
            });
    })
</script>


<script type="text/javascript">
    //layui.use(['form','upload'],function(){
    //     var form = layui.form();
    //});
    layui.use('form', function() {
        var form = layui.form;
        form.render();
        //监听提交
        form.on('submit(demo1)', function (data) {
            layer.msg(JSON.stringify(data.field));
            var a = JSON.stringify(data.field);   //获取到表的的每一个数据 用键值段存储
            alert(a);
            $.ajax({
                url: "<%=basePath%>/user/check_old?id=<%=id%>",                   //数据接口
                type: "get",
                data: {"information": a},  //序列化表单                       键值段
                dataType: "json",
                success: function (data) {     //返回值data为{"result":"提交成功"}

                    //data代表返回的值
                }
            })

            return false;
        });
    }
    );



    function test(){
        var password = document.getElementById("layui-input-new");
        var passwordConfirm = document.getElementById("layui-input-confirm");
        if(password.value != passwordConfirm.value)
        {

            layui.use('layer', function () {
                var layer = layui.layer;
                layer.msg('两次密码不相同!');
            });

            return true;
        }
        return false;
    }








</script>
</body>
</html>
