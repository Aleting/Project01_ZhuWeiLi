<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/10/24
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()   + path + "/";
%>
<%
    String id = request.getParameter("storeId");
    session.setAttribute("storeId",id);
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/layui/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/common/bootstrap/css/bootstrap.css" media="all">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/common/global.css" media="all">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/personal.css" media="all">
    <script type="text/javascript" src="<%=basePath%>/static/layui/layui/layui.all.js"></script>
    <script type="text/javascript" src="<%=basePath%>/static/jquery/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>/static/js/newsadd.js"></script>

    <script type="text/javascript">
        $(document).ready(function(){
            getBoards();
            $.ajax({
                url : "<%=basePath%>/user/seller_name",//后台请求的数据，用的是PHP
                dataType : "JSON",//数据格式
                type : "GET",//请求方式
                success : function(result) {//如果请求成功，返回数据。
                    var name = result.extend.name[0];
                    $("#sellerName").val(name.sellerLoginName);
                },
            })
        });
        function getBoards(){
            $.ajax({
                url : '<%=basePath%>/store/select_all_type',
                type : 'POST',
                dataType:"JSON",
                success : function(data) {
                    for(var i=0;i<=data.length;i++){
                        var optionStr = "";
                        optionStr += "<option value='" + data[i].typeId+ "'>"
                            +  data[i].typeName + "</option>";
                        $(".boards").append(optionStr);
                        layui.use(['form'], function(){
                            var form1 = layui.form;
                            form1.render('select');
                        })
                    }
                },
                error : function(data) {
                }
            });
        }
    </script>

</head>
<body>
<form class="layui-form">
    <div class="layui-form-item">
        <label class="layui-form-label">店铺名称</label>
        <div class="layui-input-block">
            <input class="layui-input newsName" lay-verify="required" placeholder="请输入店铺名称" type="text"  name="storeName" id="storeName">
        </div>
    </div>
    <div class="layui-form-item" style="position:static">
        <%--<div class="layui-inline">--%>
            <%--<label class="layui-form-label">店铺图片</label>--%>

            <%--<div class="layui-upload" style="position:absolute;top:0px;left:120px;">--%>
                <%--<button class="layui-btn" id="test1" type="button">上传图片</button>--%>
                <%--<div class="layui-upload-list">--%>
                    <%--<img class="layui-upload-img" id="demo1">--%>
                    <%--<p id="demoText"></p>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
        <div class="layui-inline">
            <label class="layui-form-label">店主</label>
            <div class="layui-input-inline">
                <input id="sellerName" class="layui-input newsAuthor" lay-verify="required" disabled="disabled" placeholder="" type="text">
            </div>
        </div>
        <%--<div class="layui-inline">--%>
            <%--<label class="layui-form-label">店铺注册时间</label>--%>
            <%--<div class="layui-input-inline">--%>
                <%--<!--<input class="layui-input newsTime" lay-verify="required|date" disabled="disabled" onClick="layui.laydate({elem:this})" type="text">-->--%>
                <%--<input  id="storeDate" class="layui-input newsTime" lay-verify="required|date" disabled="disabled"  type="text">--%>

            <%--</div>--%>
        <%--</div>--%>
        <div class="layui-inline">
            <label class="layui-form-label">店铺主营类型</label>
            <%--<div class="layui-input-inline">--%>
                <%--<select name="browseLook" class="newsLook" lay-filter="browseLook">--%>
                    <%--<option value="0">数码家电</option>--%>
                    <%--<option value="1">衣物服饰</option>--%>
                    <%--<option value="1">生活用品</option>--%>
                <%--</select><div class="layui-unselect layui-form-select">--%>
                <%--<div class="layui-select-title">--%>
                    <%--<input placeholder="开放浏览" value="开放浏览" readonly class="layui-input layui-unselect" type="text">--%>
                    <%--<i class="layui-edge">--%>
                    <%--</i></div><dl class="layui-anim layui-anim-upbit">--%>
                <%--<dd lay-value="0" class="layui-this">开放浏览</dd>--%>
                <%--<dd lay-value="1" class="">会员浏览</dd></dl></div>--%>
            <%--</div>--%>
            <div class="layui-input-inline" style="width:100px;">
                <select name="sortId" lay-verify="" id="sortId" class="boards">
                    <option selected="selected" value="0">-请选择-</option>
                </select>
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">注意：</label>

        <label class="layui-form-label" style="color:#F00;width:300px;" >请不要添加任何违法和虚假信息!谢谢合作</label>


    </div>

    <%--<div class="layui-form-item">--%>
        <%--<label class="layui-form-label">店主简介</label>--%>
        <%--<div class="layui-input-block">--%>
            <%--<textarea class="layui-textarea layui-hide" name="content" lay-verify="content" id="news_content"></textarea><div class="layui-layedit"><div class="layui-unselect layui-layedit-tool"><i class="layui-icon layedit-tool-b" title="加粗" lay-command="Bold" layedit-event="b" "=""></i><i class="layui-icon layedit-tool-i" title="斜体" lay-command="italic" layedit-event="i" "=""></i><i class="layui-icon layedit-tool-u" title="下划线" lay-command="underline" layedit-event="u" "=""></i><i class="layui-icon layedit-tool-d" title="删除线" lay-command="strikeThrough" layedit-event="d" "=""></i><span class="layedit-tool-mid"></span><i class="layui-icon layedit-tool-left" title="左对齐" lay-command="justifyLeft" layedit-event="left" "=""></i><i class="layui-icon layedit-tool-center" title="居中对齐" lay-command="justifyCenter" layedit-event="center" "=""></i><i class="layui-icon layedit-tool-right" title="右对齐" lay-command="justifyRight" layedit-event="right" "=""></i><span class="layedit-tool-mid"></span><i class="layui-icon layedit-tool-link" title="插入链接" layedit-event="link" "=""></i><i class="layui-icon layedit-tool-unlink layui-disabled" title="清除链接" lay-command="unlink" layedit-event="unlink" "=""></i><i class="layui-icon layedit-tool-face" title="表情" layedit-event="face" "=""></i><i class="layui-icon layedit-tool-image" title="图片" layedit-event="image"><input name="file" type="file"></i></div><div class="layui-layedit-iframe"><iframe id="LAY_layedit_1" name="LAY_layedit_1" textarea="news_content" style="height: 280px;" frameborder="0"></iframe></div></div>--%>
        <%--</div>--%>
    <%--</div>--%>
    <div class="layui-input-block">
        <textarea placeholder="请输入内容" class="layui-textarea" style="height:300px;width: 80%;"  name="storeContent" id="storeContent"></textarea>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="add">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>

<script>
    layui.use('form', function(){
        var form = layui.form;
        form.render();
    });
    //监听提交
    layui.use('form', function(){
        var form = layui.form;
        form.render();
        //监听提交
        form.on('submit(add)', function(data){
            var a=JSON.stringify(data.field);   //获取到表的的每一个数据 用键值段存储
            $.ajax({
                url:"<%=basePath%>/store/updateStore",                   //数据接口
                type:"post",
                data:{"add":a},  //序列化表单                       键值段
                dataType:"json",
                success:function (data) {     //返回值data为{"result":"提交成功"}
                }
            });

            return false;
        });
    });
</script>
</body>
</html>
