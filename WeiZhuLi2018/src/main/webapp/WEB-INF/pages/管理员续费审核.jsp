<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/10/24
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()   + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="<%=basePath%>/static/layui/layui/css/layui.css" rel="stylesheet" type="text/css" />
    <script src="<%=basePath%>/static/layui/layui/layui.all.js"></script>
</head>
<body>
<div class="demoTable">
    搜索ID：
    <div class="layui-inline">
        <input name="id" class="layui-input" id="demoReload" autocomplete="off">
    </div>
    <button class="layui-btn" data-type="reload">搜索</button>
</div>

<table class="layui-hide" id="LAY_table_user" lay-filter="user"></table>

<script id="checkboxTpl" type="text/html">
    <input type="checkbox" name="lock" value="{{d.id}}" title="审核通过" lay-filter="lockDemo" {{ d.id == 10006 ? 'checked' : '' }}>
</script>


<script>
    layui.use('table', function(){
        var table = layui.table;

        //方法级渲染
        table.render({
            elem: '#LAY_table_user'
            ,url: 'table2.json'
            ,cols: [[
                {checkbox: true, fixed: true}
                ,{field:'id', title: '店铺ID', width:130, sort: true, fixed: true}
                ,{field:'username', title: '店铺名', width:150}
                ,{field:'sex', title: '缴费日期', width:100, sort: true}
                ,{field:'city', title: '续费到', width:100}
                ,{field:'sign', title: '支付方式'}
                ,{field:'wealth', title: '审核', sort: true, width:135}
                ,{field:'1', title: '操作', sort: true, width:135, templet: '#checkboxTpl', unresize: true}
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
