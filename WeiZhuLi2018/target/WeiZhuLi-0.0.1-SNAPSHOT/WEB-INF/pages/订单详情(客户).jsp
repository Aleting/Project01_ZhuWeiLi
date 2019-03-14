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
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="<%=basePath%>/static/layui/layui/css/layui.css" rel="stylesheet" type="text/css" />
<script src="<%=basePath%>/static/jquery/jquery-3.3.1.min.js"></script>
<script src="<%=basePath%>/static/layui/layui/layui.all.js"></script>
<script src="<%=basePath%>/static/layui/layui/layui.js"></script>
<script src="<%=basePath%>/static/assets/data.js"></script>
<script src="<%=basePath%>/static/assets/province.js"></script>

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

<table class="layui-hide" id="test"></table>
              
          
<script src="//res.layui.com/layui/dist/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
 
<script>
layui.use('table', function(){
  var table = layui.table;
  
  table.render({
    elem: '#test'
    ,url:'table2.json'
    ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
	 ,page:true
    ,limits:5
	,height:313
    ,cols: [[

 
    ]]
    ,id: 'testReload',
            done: function(res, curr, count){
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
            ,page: true
  });
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
                    ,where: {
                        id: demoReload.val(),
                        data: Keyword
                    }
                });
            }
        };
  };
  $('.demoTable .layui-btn').on('click', function(){
    var type = $(this).data('type');
    active[type] ? active[type].call(this) : '';
  });
});
</script>


</body>

</body>
</html>
