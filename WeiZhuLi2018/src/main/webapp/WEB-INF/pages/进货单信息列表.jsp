<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()   + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String id = request.getParameter("storeId");
    session.setAttribute("storeId",id);
    System.out.println(id);
%>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="<%=basePath%>/static/layui/layui/css/layui.css"  media="all">
    <script src="<%=basePath%>/static/layui/layui/layui.all.js"></script>

    <script>
        function exportExcel(){
            alert(123);
            var url = '<%=basePath%>/T_bought/feeList?storeId=${seller.storeId}'
            // 这里一定不能使用Ajax请求
            window.open(url);
        }
    </script>
</head>
<body>
<div class="demoTable">

    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
        <legend>进货详情</legend>
    </fieldset>
    商品编号：
    <div class="layui-inline">
        <input name="id" class="layui-input" id="demoReload" autocomplete="off">
    </div>
    <button class="layui-btn" data-type="reload">搜索</button>
</div>

<!---->

<!---->
<script id="checkboxTpl" type="text/html">
    <!-- 这里的 checked 的状态只是演示 -->
    <input type="checkbox" name="lock" value="{{d.ifPay}}" title="付款" lay-filter="lockDemo" {{ d.ifPay ==1?'checked':'' }}>
</script>

<!---->
<table class="layui-hide" id="LAY_table_user" lay-filter="user"></table>

<div>
    <input class="layui-btn layui-btn-radius layui-btn-normal" style="float: right;" id="export" type="button" value="导出EXCEL" onclick = "exportExcel()"/>
</div>
<div>

    总价:
    <div class="layui-inline" style="width:100px">
        <input name="" class="layui-input" id="" autocomplete="off">
    </div>

</div>
<div style="position:absolute;right:100px;bottom:100px;">
    <button class="layui-btn layui-btn-lg layui-btn-radius layui-btn-normal" style="wdith:200px">进货</button>
</div>
<!---->
<script>
    function addjinhuodan(){
        layui.use('layer', function(){ //独立版的layer无需执行这一句
            var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句
            layer.open({
                //layer提供了5种层类型。可传入的值有：0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
                type:1,
                title:"进货单",
                area: ['50%','70%'],
                content:$("#addjinhuodan")
            });

        });

        layui.use('laydate', function(){
            var laydate = layui.laydate;

            //执行一个laydate实例
            laydate.render({
                elem: '#test1' //指定元素

            });


            laydate.render({
                elem: '#test2' //指定元素

            });
        });


    }

    //
</script>

<!---->
<script>
    layui.use('table', function(){
        var table = layui.table
            ,form = layui.form;

        //方法级渲染
        table.render({
            elem: '#LAY_table_user'
            ,url: '<%=basePath%>/T_bought/select_tBought?storeId=${seller.storeId}'
            ,cols: [[
                {field:'goodsName', title: '商品名', width:300, sort: true, fixed: true}
                ,{field:'supplierName', title: '供应商', width:200}
                ,{field:'attributeSize', title: '规格', width:200, sort: true}
                ,{field:'attributePrice', title: '价格'}
                ,{field:'goodsNum', title: '订单数量'}
            ]]
            ,id: 'testReload'
            ,page: true
            ,height: 315
            ,done: function(res, curr, count){

            }
            ,limits: [10, 20, 30, 40, 50]
            ,limit: 2
        });
        //
        //监听付款操作
        form.on('checkbox(lockDemo)', function(obj){
            var data = $(obj.elem);

            var id = data.parents('tr').first().find('td').eq(0).text();
            alert(id);
            alert(obj.elem.checked);
            var check = obj.elem.checked;
            layer.tips(this.value + ' ' + this.name + '：'+ obj.elem.checked, obj.othis);
            $.ajax({
                url:"<%=basePath%>/T_bought/ifPay",                   //数据接口
                type:"post",
                data:{"id":id,"check":check},  //序列化表单                       键值段
                dataType:"json",
                success:function (data) {     //返回值data为{"result":"提交成功"}

                    //data代表返回的值
                }
            })


        });
        //监听行单击事件（单击事件为：rowDouble）
//  table.on('row(user)', function(obj){
//    var data = obj.data;
//
//	addjinhuodan();
//
//    layer.alert(JSON.stringify(data), {
//      title: '当前行数据：'
//    });
//
//    //标注选中样式
//    obj.tr.addClass('layui-table-click').siblings().removeClass('layui-table-click');
//  });
//


        //
        var $ = layui.$, active = {
            reload: function(){
                var demoReload = $('#demoReload');

                //执行重载
                table.reload('testReload', {

                    page: {
                        curr: 1 //重新从第 1 页开始
                    },
                    method:'post'
                    ,url:'${pageContext.request.contextPath}/T_bought/select_tBought?storeId=${seller.storeId}'    //和分页一个接口
                    ,where: {

                        id: demoReload.val()
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