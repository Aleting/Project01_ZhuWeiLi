<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/10/24
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="utf-8"
%>
<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()   + path + "/";
%>
<%
    String id = request.getParameter("storeId");
    session.setAttribute("storeId",id);
    System.out.println(id);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="<%=basePath%>/static/layui/layui/css/layui.css" rel="stylesheet" type="text/css" />
<script src="<%=basePath%>/static/layui/layui/layui.all.js"></script>
</head>

<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>订单审核</legend>
</fieldset>

 
<div class="demoTable">
   <div class="layui-inline" style="width:100px;">
   <form class="layui-form" action="">
  <select name="city" lay-verify="" id="Keyword">
  <option value="">请选择</option>
  <option value="1">订单编号</option>
  <option value="2">顾客用户名</option>
</select>   
</form>
</div>
  <div class="layui-inline">
    <input name="id" class="layui-input" id="demoReload" autocomplete="off">
  </div>
  <button class="layui-btn" data-type="reload">搜索</button>
</div>
 <script id="checkboxTpl" type="text/html">

  <input type="checkbox" name="lock" value="{{d.orderState}}" title="是否付款" lay-filter="lockDemo"  {{ d.orderState ==1?'checked':'' }}>
</script>
<table class="layui-hide" id="LAY_table_user" lay-filter="user"></table> 
               
          
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
layui.use('table', function(){
  var table = layui.table,
      form = layui.form;
  
  //方法级渲染
  table.render({
    elem: '#LAY_table_user'
    ,url: '<%=basePath%>/order/select_order_customer?storeId=${storeId}'
    ,cols: [[
<!--      {checkbox: true, fixed: true}
-->      
      {field:'orderId', title: '订单编号', width:100, sort: true, fixed: true}
                ,{field:'orderTime2', title: '订单时间', width:100}
                ,{field:'customerId', title: '顾客编号', width:100, sort: true}
                ,{field:'customerLoginName', title: '顾客用户名'}
                ,{field:'address', title: '收货地址', width:300}
                ,{field:'orderMoney', title: '订单总金额', sort: true, width:130}
                ,{field:'orderEpayType', title: '订单支付类型', sort: true, width:130}
                ,{field:'goodsName', title: '商品名称', sort: true, width:130}

          ,{field:'orderState', title: '订单状态', sort: true, width:135,templet: '#checkboxTpl', unresize: true}
    ]]
    ,id: 'testReload'
    ,page: true
    ,height: 315
    ,done: function(res, curr, count){

            }
            ,limits: [10, 20, 30, 40, 50]
            ,limit: 2
  });
  //监视订单状态

    form.on('checkbox(lockDemo)', function(obj){
        var data = $(obj.elem);

        var id = data.parents('tr').first().find('td').eq(0).text();
        var check = obj.elem.checked;
        layer.tips(this.value + ' ' + this.name + '：'+ obj.elem.checked, obj.othis);
        $.ajax({
            url:"<%=basePath%>/order/update_OrderState",                   //数据接口
            type:"post",
            data:{"id":id,"check":check},  //序列化表单                       键值段
            dataType:"json",
            success:function (data) {     //返回值data为{"result":"提交成功"}

                //data代表返回的值
            }
        })


    });
    //
   var $ = layui.$, active = {
                   reload: function(){

                       var demoReload = $('#demoReload');
                        var Keyword = $('#Keyword option:selected').val();


                       //执行重载
                       table.reload('testReload', {

                           page: {
                               curr: 1 //重新从第 1 页开始
                           },
                               method:'post'
                           ,url:'${pageContext.request.contextPath}/order/select_order_customer?storeId=${storeId}'    //和分页一个接口
                           ,where: {

                               id: demoReload.val(),
                               data: Keyword
                           }
                       });
                   }
               };
  
  $('.demoTable .layui-btn').on('click', function(){
    var type = $(this).data('type');
    active[type] ? active[type].call(this) : '';
  });
});


//
layui.use('form',function(){
	var form = layui.form;
	form.render();
	
	})
</script>

</body>
</html>
