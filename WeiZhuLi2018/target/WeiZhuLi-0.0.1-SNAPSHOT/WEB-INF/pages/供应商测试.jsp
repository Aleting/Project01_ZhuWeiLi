<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/10/23
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<% String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()   + path + "/";
%>
<%
    String id = request.getParameter("storeId");
    session.setAttribute("storeId",id);
    System.out.println(id);
%>
<%--
供应商页面
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="<%=basePath%>/static/layui/layui/css/layui.css" rel="stylesheet" type="text/css" />
    <script src="<%=basePath%>/static/jquery/jquery-3.3.1.min.js"></script>
    <script src="<%=basePath%>/static/layui/layui/layui.all.js"></script>
    <script>
        //
        function exportExcel(){
            alert("正在导出.....");
            var url = '<%=basePath%>/supplier/feeList?${seller.storeId}'
            // 这里一定不能使用Ajax请求
            window.open(url);
        }
    </script>
</head>

<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
    <legend><i class="layui-icon layui-icon-form" style="font-size:30px"></i>   供应商管理</legend>
</fieldset>
<div class="demoTable">
    <button class="layui-btn" type="button" onclick="addgongyingshang()">+添加供应商</button>
    &nbsp;&nbsp;&nbsp;&nbsp;

    &nbsp;&nbsp;&nbsp;&nbsp;

    &nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;

    供应商名称：
    <div class="layui-inline">
        <input name="id" class="layui-input" id="demoReload" autocomplete="off">
    </div>
    &nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button class="layui-btn" data-type="reload">搜索</button>
</div>
<!--添加商品-->
<div class="layui-row" id="addgongyingshang" style="display:none;">
    <div class="layui-col-m d11">
        <form class="layui-form"  >


    <!---->
    <div class="layui-form-item">
        <label class="layui-form-label">供应商名称:</label>
        <div class="layui-input-block">
            <input type="text" id="supplierName" name="supplierName" required  lay-verify="required" placeholder="请输入供应商名称" autocomplete="off" class="layui-input">
        </div>
    </div>
    <!---->
    <div class="layui-form-item">
        <label class="layui-form-label">供应商联系人:</label>
        <div class="layui-input-block">
            <input type="text" name="supplierContacts" id="supplierContacts" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
        </div>
    </div>
    <!---->
    <div class="layui-form-item">
        <label class="layui-form-label">供应商微信:</label>
        <div class="layui-inline">
            <input type="text" id="supplierWx" name="supplierWx" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
        </div>
    </div>
    <!---->
    <div class="layui-form-item">
        <label class="layui-form-label">支付宝账号:</label>
        <div class="layui-inline" >
            <input type="text" id="supplierEpay" name="supplierEpay" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
        </div>
    </div>
    <!---->
    <div class="layui-form-item">
        <label class="layui-form-label">供应商电话:</label>
        <div class="layui-inline" >
            <input type="text" id="supplierPhone" name="supplierPhone" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
        </div>
    </div>
    <!---->
    <!---->
    <div class="layui-form-item">
        <label class="layui-form-label">备注:</label>
        <div class="layui-inline" style="width:400px;height:100px;">
            <textarea name="supplierMemo" id="supplierMemo" class="layui-textarea" placeholder="请输入内容"></textarea>
        </div>
    </div>
    <!---->
    <div class="layui-form-item">
        &nbsp;   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;

        <button class="layui-btn" lay-filter="demo1" lay-submit="">立即提交</button>

    </div>
    </form>
</div>
</div>


<!---->

<table class="layui-hide" id="LAY_table_user" lay-filter="user"></table>

<div>
    <input class="layui-btn layui-btn-radius layui-btn-normal" style="float: right;" id="export" type="button" value="导出EXCEL" onclick = "exportExcel()"/>
</div>


<script id="switchTpl" type="text/html">
    <input type="checkbox" name="sex" value="{{d.id}}" lay-skin="switch" lay-text="下架|在售" lay-filter="sexDemo" }>
</script>
<script id="barDemo" type="text/html">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script type="text/javascript">

    <%--$(function () {--%>
        <%--$.ajax({--%>
            <%--url:"<%=basePath%>/supplier/supplier_info",--%>
            <%--data:"pn=1",--%>
            <%--type:"get",--%>
            <%--success:function (result) {--%>
                <%--//console.log(result);--%>
                <%--build_supplier_table(result);--%>
            <%--}--%>
        <%--});--%>
    <%--});--%>

    <%--function build_supplier_table(result){--%>
        <%--var suppliers = result.extend.pageInfo_suppliers.list;--%>
        <%--$.each(suppliers,function (index,item) {--%>
            <%--alert(item.supplierName);--%>
        <%--})--%>
    <%--}--%>
    <%--function bulid_page_nav(result) {--%>
        <%----%>
    <%--}--%>
</script>





<!---->
<script type="text/javascript">
    function addgongyingshang(){
        layui.use('layer', function(){ //独立版的layer无需执行这一句
            var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句
            layer.open({
                //layer提供了5种层类型。可传入的值有：0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
                type:1,
                title:"供应商",
                area: ['50%','70%'],
                content:$("#addgongyingshang").html()
            });

        });


    }

    //
</script>
<!---->
<script>
    var supplierId="";
    layui.use('table', function(){
        var table = layui.table;

        //方法级渲染
        table.render({
            elem: '#LAY_table_user'
            ,url: '<%=basePath%>/supplier/select_order_customer?storeId=${seller.storeId}'
            ,cols: [[
                <!--      {checkbox: true, fixed: true}
                -->
                {field:'supplierId', title:'编号' , width:120, sort: true, fixed: true}
                ,{field:'supplierName', title: '名称', width:100}
                ,{field:'supplierContacts', title: '联系人', width:130}
                ,{field:'supplierWx', title: '微信', width:80, }
                ,{field:'supplierEpay', title: '支付宝账号'}
                ,{field:'supplierPhone', title: '电话', sort: true, width:100, }
                ,{field:'storeId', title: '店铺编号', sort: true, width:110}
             //   ,{field:'supplierMemo', title: '备注', width:100}
                ,{field:'1', title: '查看', sort: true, width:350,toolbar: '#barDemo',align:'center',}
            ]]
            ,id: 'testReload'
            ,page: true
            ,height: 315
            ,done: function(res, curr, count){
                //如果是异步请求数据方式，res即为你接口返回的信息。
                //如果是直接赋值的方式，res即为：{data: [], count: 99} data为当前页数据、count为数据总长度
                console.log(res);

                //得到当前页码
                console.log(curr);

                //得到数据总量
                console.log(count);

            }
            ,limits: [10, 20, 30, 40, 50]
            ,limit: 2
        });

        var $ = layui.$, active = {
            reload: function(){
                var demoReload = $('#demoReload');
                //执行重载
                table.reload('testReload', {

                    page: {
                        curr: 1 //重新从第 1 页开始
                    },
                    method:'post'
                    ,url:'${pageContext.request.contextPath}/supplier/select_order_customer?storeId=${seller.storeId}'    //和分页一个接口
                    ,where: {

                        id: demoReload.val(),
                    }
                });
            }
        };

        $('.demoTable .layui-btn').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });

        //监听工具条
        table.on('tool(user)', function(obj){
            var a= obj.data;


            if(obj.event === 'detail'){
                layer.msg('ID：'+ data.id + ' 的查看操作');
            } else if(obj.event === 'del'){

                layer.confirm('真的删除行么', function(index){

                    obj.del();
                    layer.close(index);

                    //
                    $.ajax({
                        url : '<%=basePath%>/supplier/delete_supplier',
                        type : 'POST',
                        data:{"id":a.supplierId},  //序列化表单                       键值段
                        success : function(data) {
                        }
                    })
                });
            } else if(obj.event === 'edit'){
              //  layer.alert('编辑行：<br>'+ JSON.stringify(data))
                supplierId = a.supplierId;
                $.ajax({
                    url : "<%=basePath%>/supplier/select_supplier/"+supplierId,//请求地址
                    dataType : "JSON",//数据格式
                    type : "GET",//请求方式

                    success : function(result) {//如果请求成功，返回数据。
                        var supplier = result.extend.supplier;
                        $("#supplierName").val(supplier.supplierName);
                        $("#supplierContacts").val(supplier.supplierContacts);
                        $("#supplierWx").val(supplier.supplierWx);
                        $("#supplierEpay").val(supplier.supplierEpay);
                        $("#supplierPhone").val(supplier.supplierPhone);
                        $("#supplierMemo").val(supplier.supplierMemo);
                    },
                })

                layui.use('layer', function(){ //独立版的layer无需执行这一句
                    var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句
                    layer.open({
                        //layer提供了5种层类型。可传入的值有：0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
                        type:1,
                        title:"供应商",
                        area: ['50%','70%'],
                        content:$("#addgongyingshang"),
                        end: function () {
                            location.reload();
                        }
                    });

                });

                layui.use(['form', 'layedit', 'laydate'], function(){
                    var form = layui.form

//表单初始赋值
                    form.val('example', {
                        "gongyingshangmingcheng": data.username // "name": "value"   其他同理

                    })
                });

            }


        });
    });


    //
    layui.use('form',function(){
        var form = layui.form;
        form.render();

    })
    layui.use('form', function(){
        var form = layui.form;
        form.render();
        //监听提交
        form.on('submit(demo1)', function(data){

            layer.msg(JSON.stringify(data.field));
           var add= JSON.stringify(data.field)
            $.ajax({
                url : '<%=basePath%>/supplier/update_supplier?storeId=${seller.storeId}',
                type : 'POST',
                data:{"supplierId":supplierId,"add":add
                },  //序列化表单                       键值段
                dataType:"json",
                success : function(data) {
                }
            })

            return false;
        });
        //显示
        form.on('checkbox(chima)', function(data){
            if(data.elem.checked==true){
                alert("dsad");
                $("#chima").css("display","block");

            }

        });
        //
    });

    //图片上传
    layui.use('upload', function(){
        var upload = layui.upload;

        //执行实例
        var uploadInst = upload.render({
            elem: '#上传图片' //绑定元素
            ,url: '/upload/' //上传接口
            ,done: function(res){
                //上传完毕回调
            }
            ,error: function(){
                //请求异常回调
            }
        });
    });


</script>
<!--表单-->
</body>
</html>
