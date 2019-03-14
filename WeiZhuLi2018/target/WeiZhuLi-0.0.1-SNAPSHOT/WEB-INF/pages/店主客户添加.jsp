<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/10/24
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%
    String id = request.getParameter("sellerId");
    session.setAttribute("sellerId",id);
    System.out.println(id);
%>
<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()   + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="<%=basePath%>/static/layui/layui/css/layui.css" rel="stylesheet" type="text/css" />
    <script src="<%=basePath%>/static/layui/layui/layui.all.js"></script>

    <script src="<%=basePath%>/static/jquery/jquery-3.3.1.min.js"></script>


</head>
<style>
    .layui-table-cell{
        height:60px;
        line-height: 60px;
    }
</style>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
    <legend><i class="layui-icon layui-icon-form" style="font-size:30px"></i>   客户管理</legend>
</fieldset>
<%--//--%>
<div class="demoTable">
    <button class="layui-btn" type="button" onclick="addRole()">+添加客户</button>
    &nbsp;&nbsp;&nbsp;&nbsp;

    &nbsp;&nbsp;&nbsp;&nbsp;

    &nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;

    客户：
    <div class="layui-inline">
        <input name="id" class="layui-input" id="demoReload" autocomplete="off" placeholder="手机" >
    </div>
    &nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button class="layui-btn" data-type="reload">搜索</button>
</div>






<%--//--%>
<%--<a class="layui-btn layui-btn-xs"  type="button" onclick="addRole()">添加客户</a>--%>
<table class="layui-hide" id="LAY_table_user" lay-filter="user"></table>

<script id="barDemo" type="text/html">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<%--//添加客户--%>
<div class="layui-row" id="popSearchRoleTest" style="display:none;">
    <div class="layui-col-md11" style="position:static">
        <form class="layui-form">
            <div class="layui-form-item">
                <label class="layui-form-label">用户名</label>
                <div class="layui-input-block">
                    <input name="customerLoginName" required  lay-verify="customerLoginName" id="customerLoginName" class="layui-input" type="text" placeholder="请输入用户名" autocomplete="off" lay-verify="title">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">密码框</label>
                <div class="layui-input-block">
                    <input name="customerPassword" id="customerPassword" required lay-verify="customerPassword" class="layui-input" type="password" placeholder="请输入密码" autocomplete="off">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">确认密码框</label>
                <div class="layui-input-block">
                    <input name="customerRePassword" id="customerRePassword"required lay-verify="customerRePassword" class="layui-input" type="password" placeholder="请确认密码" autocomplete="off">
                </div>
            </div>

            <div class="layui-form-item">

                <div class="layui-inline">
                    <div class="layui-inline">
                <label class="layui-form-label">真实姓名</label>
                <div class="layui-input-inline">

                    <input type="text" name="customerRealName" id="customerRealName" required lay-verify="required" placeholder="请输入真实姓名" autocomplete="off" class="layui-input">

                </div>




                </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">上传图片</label>
                        <div class="layui-input-inline uploadHeadImage">
                            <div class="layui-upload-drag" id="headImg">
                                <span class="layui-icon" style="font-size: 30px; color: #1E9FFF;" ></span>
                                <p>点击上传图片，或将图片拖拽到此处</p>
                            </div>
                        </div>
                        <div class="layui-input-inline">
                            <div class="layui-upload-list">
                                <img class="layui-upload-img headImage" src="http://t.cn/RCzsdCq" id="demo2">
                                <p id="demoText"></p>
                            </div>
                        </div>
                    </div>
                    <input type="text" name="customerImg" id="customerImg"  >
                <!---->
                <div class="layui-form-item">
                    <%--<div class="layui-inline">--%>
                    <%--<label class="layui-form-label">手机号</label>--%>
                    <%--<div class="layui-input-inline">--%>
                        <%--<input name="customerPhone" required lay-verify="required" class="layui-input" type="text" placeholder="请输入手机号" autocomplete="off" lay-verify="title">--%>
                    <%--</div>--%>
                    <%--</div>--%>

                    <%--<div class="layui-inline">--%>
                        <%--<label class="layui-form-label">邮箱</label>--%>
                        <%--<div class="layui-input-inline">--%>
                            <%--<input name="customerEmail" required lay-verify="required" class="layui-input" type="text" placeholder="请输入邮箱" autocomplete="off" lay-verify="title">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                        <div class="layui-inline">
                            <label class="layui-form-label">手机号:</label>
                            <div class="layui-input-inline" style="width:200px;">
                                <input name="customerPhone" id="customerPhone" required lay-verify="customerPhone" class="layui-input" type="text" placeholder="请输入手机号" autocomplete="off" lay-verify="title">                            </div>
                        </div>



                        <%--<div class="layui-inline">--%>
                            <%--<label class="layui-form-label">邮箱:</label>--%>
                            <%--<div class="layui-input-inline" style="width:200px;">--%>
                                <%--<input name="customerEmail" required lay-verify="customerEmail" class="layui-input" type="text" placeholder="请输入邮箱" autocomplete="off" lay-verify="title">--%>
                            <%--</div>--%>
                        <%--</div>--%>

                </div>
                <!---->
                <%--<div class="layui-form-item">--%>
                    <%--<label class="layui-form-label">邮箱</label>--%>
                    <%--<div class="layui-input-block">--%>
                        <%--<input name="customerEmail" required lay-verify="required" class="layui-input" type="text" placeholder="请输入邮箱" autocomplete="off" lay-verify="title">--%>
                    <%--</div>--%>
                <%--</div>--%>
                <!---->
                <div class="layui-form-item">
                    <label class="layui-form-label">客户等级</label>
                    <div class="layui-input-block">
                        <input type="radio" name="dengji" value="putong" title="普通顾客">
                        <input type="radio" name="dengji" value="vip" title="VIP顾客" checked>
                        <input type="radio" name="dengji" value="" title="禁用" disabled>
                    </div>
                </div>
                <!---->
                <div class="layui-form-item">
                    <label class="layui-form-label">备注</label>
                    <div class="layui-input-block">
                        <textarea placeholder="请输入内容" id="clMemo" name="备注" class="layui-textarea" style="height:100px;width: 500px;"></textarea>

                    </div>
                </div>




                <!---->
                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <button class="layui-btn" lay-filter="demo1" lay-submit >立即提交</button>
                    </div>
                </div>
                <!---->
            </div>
        </form>
    </div>

</div>
<%--//添加客户OVer--%>

<script type="text/javascript">
    //



    //
    //验证密码是否一致

    $("#customerRePassword").blur(function(){
        alert(123);
        if( $("#customerPassword").val()!=$("#customerRePassword").val())
        {
            layer.msg('密码不相同');
        }
    });





    function addRole(){
        layui.use('layer', function(){ //独立版的layer无需执行这一句
            var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句
            layer.open({
                //layer提供了5种层类型。可传入的值有：0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
                type:1,
                title:"客户",
                area: ['60%','70%'],
                content:$("#popSearchRoleTest"),
                end: function () {
                    location.reload();
                }
            });

        });
        //
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
                        $('#demo2').attr('src', result); //图片链接（base64）
                    });
                }
                , done: function (res) {
                    var a=res.src;
                    document.getElementById("customerImg").value=a;

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
        //




    }

    //
</script>
<script>
    var customerId="";
    layui.use('form',function(){
        var form=layui.form;
        form.render();
            //
        //自定义验证
        //验证邮箱

        form.verify({
            customerLoginName: function(value, item){ //value：表单的值、item：表单的DOM对象
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
                    url : ""+value,//请求地址
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
            ,customerPassword: [
                /^[\S]{6,12}$/
                ,'密码必须6到12位，且不能出现空格'
            ]
            ,customerRePassword: [
                /^[\S]{6,12}$/
                ,'密码必须6到12位，且不能出现空格'
            ]
            ,customerPhone: [
                /^[\S]{11}$/
                ,'手机号为 11位'
            ]
        });

        //验证over
        form.on('submit(demo1)',function(data){

            layer.msg(JSON.stringify(data.field));
            var a=JSON.stringify(data.field);   //获取到表的的每一个数据 用键值段存储
            $.ajax({
                url:"<%=basePath%>/cus/add_Customer?sellerId=${sellerId}",                   //数据接口
                type:"POST",
                data:{"customer_info":a,"customerId":customerId},  //序列化表单                       键值段
                dataType:"json",
                success:function (data) {     //返回值data为{"result":"提交成功"}

                    //data代表返回的值
                }
            })
            return false;
        });

    });
</script>


<script>
    function hoverOpenImg(){
        var img_show = null; // tips提示
        $('td img').hover(function(){
            //alert($(this).attr('src'));
            var img = "<img class='img_msg' src='"+$(this).attr('src')+"' style='width:130px;' />";
            img_show = layer.tips(img, this,{
                tips:[2, 'rgba(41,41,41,.5)']
                ,area: ['160px']
            });
        },function(){
            layer.close(img_show);
        });
        $('td img').attr('style','max-width:70px');
    }
    layui.use('table', function(){
        var table = layui.table;

        //方法级渲染
        table.render({
            elem: '#LAY_table_user'
            ,url: '<%=basePath%>/cus/seleCus'
            ,cols: [[
                <!--      {checkbox: true, fixed: true}
                -->
              <!--  {field:'', title:'编号' , width:120, sort: true, fixed: true},-->
                {field:'customerLoginName', title: '用户名', width:150}
                // ,{field:'customerSex', title: '性别', width:150}
                ,{field:'customerRealName', title: '真实姓名', width:150}
                ,{field:'customerImg', title: '头像',templet:'<div><img src="<%=basePath%>{{d.customerImg}}"></div>'}
                ,{field:'customerPhone', title: '手机号',width:150,sort: true}
                // ,{field:'', title: '邮箱', sort: true, width:150 }
                ,{field:'customerGrade', title: '等级',  width:120}
                ,{field:'clMemo', title: '备注', width:150}
                ,{field:'1', title: '查看', sort: true,width:250,toolbar: '#barDemo',align:'center',}
            ]]
            ,id: 'testReload'
            ,page: true
            ,done:function(res,curr,count){
                hoverOpenImg();//显示大图
            }
            ,limits: [10, 20, 30, 40, 50]
            ,limit: 2
        });
        //重载
        var $ = layui.$, active = {
            reload: function(){
                var demoReload = $('#demoReload');
                alert(demoReload.val());
                //执行重载
                table.reload('testReload', {

                    page: {
                        curr: 1 //重新从第 1 页开始
                    },
                    method:'post'
                    ,url:'${pageContext.request.contextPath}/cus/seleCus'    //和分页一个接口
                    ,where: {
                        phone: demoReload.val(),
                    }
                });
            }
        };
        //重载over
        //
        $('.demoTable .layui-btn').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
        //
        // 监听工具条
        table.on('tool(user)', function(obj) {
            var a = obj.data;


            if (obj.event === 'detail') {
                layer.msg('ID：' + data.id + ' 的查看操作');
            } else if (obj.event === 'del') {

                layer.confirm('真的删除行么', function (index) {

                    obj.del();
                    layer.close(index);

                    //
                    $.ajax({
                        url: '<%=basePath%>/cus/delete_customer',
                        type: 'POST',
                        data: {"id": a.customerId},  //序列化表单                       键值段
                        success: function (data) {
                        }
                    })
                });
            } else if (obj.event === 'edit') {
                customerId = a.customerId;
                $.ajax({
                    url: "<%=basePath%>/cus/customer/" +a.customerId,//请求地址
                    dataType: "JSON",//数据格式
                    type: "GET",//请求方式
                    success: function (result) {//如果请求成功，返回数据。
                         var supplier = result.extend.customer[0];
                         $("#customerLoginName").val(supplier.customerLoginName);
                        $("#customerPassword").val(supplier.customerPassword);
                        $("#customerRePassword").val(supplier.customerPassword);
                        $("#clMemo").val(supplier.clMemo);
                        $("#customerPhone").val(supplier.customerPhone);
                        $("#customerRealName").val(supplier.customerRealName);
                    },
                });

                layui.use('layer', function () { //独立版的layer无需执行这一句
                    var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句
                    layer.open({
                        //layer提供了5种层类型。可传入的值有：0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
                        type: 1,
                        title: "客户",
                        area: ['60%', '70%'],
                        content:$("#popSearchRoleTest"),
                        end: function () {
                            location.reload();
                        }

                    });
                    //
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
                                var a=res.src;
                                document.getElementById("customerImg").value=a;

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


                    //

                });
            }
        });

                //
    });

</script>

</body>
</html>
