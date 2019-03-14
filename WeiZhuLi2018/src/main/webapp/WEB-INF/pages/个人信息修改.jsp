<%--
  Created by IntelliJ IDEA.
  User: 18480
  Date: 2018/10/28
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()   + path + "/";
%>
<%
    String id = request.getParameter("sellerId");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/common/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/common/bootstrap/css/bootstrap.css" media="all">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/common/global.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/main.css" media="all">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/layui/layui/css/layui.css" >
    <script type="text/javascript" src="<%=basePath%>/static/js/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>/static/layui/layui/layui.all.js"></script>

</head>
<%--功能： 显示个人信息--%>
<script type="text/javascript">
    $(document).ready(function() {

        $.ajax({
            url : "<%=basePath%>/user/seller/<%=id%>",//后台请求的数据，用的是PHP
            dataType : "JSON",//数据格式
            type : "GET",//请求方式

            success : function(result) {//如果请求成功，返回数据。
                var seller = result.extend.seller[0];
                $("#customerLoginName").val(seller.sellerLoginName);
                $("#customerRealName").val(seller.customerRealName);
                $("#customerPhone").val(seller.sellerPhone);
                $("#customerEpay").val(seller.sellerEpay);
            },
        })
    })
</script>
<style>
    .layui-form-label{
        width: 100px;
    }
</style>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>个人信息修改</legend>
</fieldset>
<section class="layui-larry-box">
    <div class="larry-personal">

        <div class="larry-personal-body clearfix">
            <form class="layui-form col-lg-5" action="" method="post">
                <div class="layui-form-item">
                    <label class="layui-form-label">用户名</label>
                    <div class="layui-input-block">
                        <input type="text" name="customerLoginName" id="customerLoginName"  autocomplete="off"  class="layui-input" value="admin"  >
                    </div>
                </div>

                <div class="layui-form-item">
                    <label class="layui-form-label">真实姓名</label>
                    <div class="layui-input-block">
                        <input type="text" name="customerRealName" id="customerRealName" autocomplete="off" class="layui-input" value="Larry">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">手机号码</label>
                    <div class="layui-input-block">
                        <input type="text" id="customerPhone" name="customerPhone"  autocomplete="off" class="layui-input" placeholder="输入手机号码">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">支付宝</label>
                    <div class="layui-input-block">
                        <input type="text" name="customerEpay" id="customerEpay"  autocomplete="off"  class="layui-input" placeholder="请输入支付宝账号"  >
                    </div>
                </div>

                <div class="layui-form-item">
                    <label class="layui-form-label">修改头像</label>
                    <div class="layui-input-block">
                        <div class="layui-upload-drag" id="headImg">
                                    <span class="layui-icon" style="font-size: 30px; color: #1E9FFF;" ></span>
                            <p>点击上传图片，或将图片拖拽到此处</p>
                        </div>
                    </div>


                </div>

                <input type="text" hidden="hidden" id="img_url" name="sellerImg" value=""/>


                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <button class="layui-btn" lay-submit="" lay-filter="demo1" id="update_seller">立即提交</button>
                        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</section>
<script type="text/javascript" src="<%=basePath%>/static/layui/layui/layui.all.js"></script>
<script type="text/javascript">
    layui.use('form', function(){
        var form = layui.form;
        form.render();
        //监听提交
        form.on('submit(demo1)', function(data){
            var a=JSON.stringify(data.field);   //获取到表的的每一个数据 用键值段存储
            $.ajax({
                url:"<%=basePath%>user/update_person",                   //数据接口
                type:"post",
                data:{"person":a,"id":<%=id%>},  //序列化表单                       键值段
                dataType:"json",
                success:function (data) {     //返回值data为{"result":"提交成功"}

                    var seller = data.extend.seller;
                    $("#customerLoginName").val(seller.sellerLoginName);
                    $("#customerRealName").val(seller.customerRealName);
                    $("#customerPhone").val(seller.sellerPhone);
                    $("#customerEpay").val(seller.sellerEpay);
                    window.location.href='${pageContext.request.contextPath}/user/admin2';
                }
            });

            return false;
        });
    });
</script>
<script type="text/javascript">
    <%--$("#update_seller").click(function () {--%>
        <%--$.ajax({--%>
            <%--url:"<%=basePath%>/user/update_person",--%>
            <%--type:"POST",--%>
            <%--data:$("form").serialize(),--%>
            <%--success:function (result) {--%>
                <%--alert("保存成功");--%>
            <%--},--%>
            <%--error:function(xhr,emsg,e) {--%>
<%--//打印ajax发生的错误--%>
                <%--alert(e);--%>
                <%--alert(xhr.responseText());--%>
<%--//答应出ajax请求返回的文本信息--%>
                <%--console.log(xhr.responseText());--%>
            <%--}--%>
        <%--})--%>
    <%--});--%>
    <%----%>
    <%--function getCustomer(id) {--%>
        <%--$.ajax({--%>
            <%--url:"<%=basePath%>/cus"+id,--%>
            <%--type:"GET",--%>
            <%--success:function (result) {--%>
                <%--console.log(result);--%>
            <%--}--%>
        <%--})--%>
    <%--}--%>
    layui.use(["jquery", "upload", "form", "layer", "element"], function () {
        var $ = layui.$,
            element = layui.element,
            layer = layui.layer,
            upload = layui.upload,
            form = layui.form;
        //拖拽上传
        var uploadInst = upload.render({
            elem: '#headImg'
            , url: '<%=basePath%>/cus/upload_images'
            ,accept:'images'
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo1').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                alert(res.src);
                var a=res.src;
                document.getElementById("img_url").value=a;
                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                //上传成功
                //打印后台传回的地址: 把地址放入一个隐藏的input中, 和表单一起提交到后台, 此处略..
                console.log(res.data.src);
                // window.parent.uploadHeadImage(res.data.src);
                var demoText = $('#demoText');
                demoText.html('<span style="color: #8f8f8f;">上传成功!!!</span>');
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-mini demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        });
        element.init();
    });

</script>
</body>
</html>