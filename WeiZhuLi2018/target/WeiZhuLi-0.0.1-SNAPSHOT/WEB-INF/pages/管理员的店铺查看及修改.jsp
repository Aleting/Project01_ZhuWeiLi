<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/10/24
  Time: 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()   + path + "/";
%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="<%=basePath%>/static/layui/layui/css/layui.css"  media="all">

    <script src="<%=basePath%>/static/layui/layui/layui.all.js" charset="utf-8"></script>
    <script>
        layui.use('laydate', function(){
            var laydate = layui.laydate;

            //执行一个laydate实例
            laydate.render({
                elem: '#test1' //指定元素
            });
        });
    </script>
</head>
<body>
<div class="demoTable ">
    <div class="layui-input-inline layui-inline layui-form" style="width:100px;">
        <select name="modules" lay-search="" lay-verify="required">
            <option value="">直接选择或搜索选择</option>
            <option value="1">layer</option>
            <option value="2">form</option>
            <option value="3">layim</option>
            <option value="4">element</option>
            <option value="5">laytpl</option>
            <option value="6">upload</option>
            <option value="7">laydate</option>

        </select>
    </div>


    <div class="layui-inline">
        <input name="id" class="layui-input" id="demoReload" autocomplete="off">
    </div>
    <button class="layui-btn" data-type="reload">搜索</button>
    <button class="layui-btn" data-type="reload">今日注册</button>
</div>

<table class="layui-hide" id="LAY_table_user" lay-filter="user"></table>


<script id="switchTpl" type="text/html">
    <form class="layui-form" >
        <input type="checkbox" name="qiyongjinyong" value="{{d.id}}" lay-skin="switch" lay-text="禁用|启用" lay-filter="sexDemo" {{ d.id == 10003 ? 'checked' : '' }}>
    </form>
</script>




<script id="yanqi" type="text/html">

    <input type="text" class="layui-input" id="test1"  placeholder="yyyy-MM-dd">
</script>

<script id="barDemo" type="text/html">
    <a class="layui-btn layui-btn-danger layui-btn-xs" >提醒续费</a>
</script>
<script>
    layui.use('laydate',function(){
        var laydate = layui.laydate;
        //
        laydate.render({
            elem: '#test1' //指定元素
        });



    })
</script>


<script>
    layui.use(['table','form','laydate'],function(){
        var table = layui.table;
        var form = layui.form;


        //

        form.on('checkbox(filter)', function(data){
            console.log(data.elem); //得到checkbox原始DOM对象
            alert(console.log(data.elem.checked)); //是否被选中，true或者false
            console.log(data.value); //复选框value值，也可以通过data.elem.value得到
            console.log(data.othis); //得到美化后的DOM对象
        });




        //方法级渲染
        table.render({
            elem: '#LAY_table_user'
            ,url: 'table2.json'
            ,cols: [[
                {checkbox: true, fixed: true}
                ,{field:'id', title: '店铺ID', width:100, sort: true, fixed: true}
                ,{field:'username', title: '店铺名称', width:100}
                ,{field:'sex', title: '店主ID', width:100, sort: true}
                ,{field:'city', title: '店主名称', width:100}
                ,{field:'sign', title: '店铺头像',width:100}
                ,{field:'experience', title: '店铺信息', sort: true,}
                ,{field:'score', title: '操作', sort: true, width:100, templet: '#switchTpl', unresize: true}
                ,{field:'classify', title: '店铺到期时间', width:135,sort: true,}
                ,{field:'wealth', title: '延期至', sort: true, width:135,templet: '#yanqi'}
                ,{field:'tixing', title: '提醒', width:100,toolbar: '#barDemo'}
            ]]
            ,id: 'testReload'
            ,page: true
            ,height: 315
        });

        var $ = layui.$, active = {
            reload: function(){
                var demoReload = $('#demoReload');

                //执行重载
                table.reload('testReload', {

                    page: {
                        curr: 1 //重新从第 1 页开始
                    }
                    ,where: {
                        key: {
                            id: demoReload.val()
                        }
                    }
                });
            }
        };

        $('.demoTable .layui-btn').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
    });


</script>
</body>
</html>
