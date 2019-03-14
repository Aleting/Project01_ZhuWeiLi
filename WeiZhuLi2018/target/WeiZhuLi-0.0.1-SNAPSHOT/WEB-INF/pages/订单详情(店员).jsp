<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/10/24
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()   + path + "/";
%>

<%@ page contentType="text/html;charset=UTF-8" language="java"
pageEncoding="utf-8"
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
<script src="<%=basePath%>/static/jquery/jquery-3.3.1.min.js"></script>
<script src="<%=basePath%>/static/layui/layui/layui.all.js"></script>
<script src="<%=basePath%>/static/assets/data.js"></script>
<script src="<%=basePath%>/static/assets/province.js"></script>
  <script>
      function exportExcel(){
          var url = '<%=basePath%>/order/feeList?storeId=${seller.storeId}'
          // 这里一定不能使用Ajax请求
          window.open(url);
      }
  </script>
</head>

<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>订单详情</legend>
</fieldset>

<div class="demoTable">
  订单编号：
  <div class="layui-inline">
    <input name="id" class="layui-input" id="demoReload" autocomplete="off">
  </div>
  <button class="layui-btn" data-type="reload">搜索</button>
</div>
<div></div>
<%--<div class="demoTable">--%>
  <%--订单时间：--%>
  <%--<div class="layui-inline">--%>
    <%--<input name="id" class="layui-input" id="demoReload" autocomplete="off">--%>
  <%--</div>--%>
  <%--<button class="layui-btn" data-type="reload">搜索</button>--%>
<%--</div>--%>

<table class="layui-hide" id="test"></table>
<div>
  <input class="layui-btn layui-btn-radius layui-btn-normal " style="float: right;" id="export" type="button" value="导出EXCEL" onclick = "exportExcel()"/>
</div>

<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

<script>
    layui.use('table', function(){
        var table = layui.table;

        //方法级渲染
        table.render({
            elem: '#test'
            ,url: '<%=basePath%>/order/select_order?storeId=${seller.storeId}'
            ,cols: [[
//   {checkbox: false, fixed: false}
                {field:'orderId', width:120, title: '订单编号', sort: true}
                ,{field:'goodsName', width:120, title: '商品名称', sort: true}
                ,{field:'orderTime2', width:120, title: '订单时间' ,sort: true}
                ,{field:'orderMoney', width:140, title: '订单的总金额', sort: true}
                ,{field:'orderState', width:120, title: '订单的状态'}//未发货，未入货，未进货
                ,{field:'customerLoginName', title: '顾客名称', width: '30%', minWidth: 150} //minWidth：局部定义当前单元格的最小宽度，layui 2.2.1 新增
                ,{field:'address', title: '收货地址', sort: true}
                ,{field:'orderEpayType', title: '订单支付类型', sort: true}

            ]]
            ,id: 'testReload'
            ,limits: [10, 20, 30, 40, 50]
            ,limit: 2
            ,page: true
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
                    ,url:'${pageContext.request.contextPath}/order/select_order?storeId=${seller.storeId}'    //和分页一个接口
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
