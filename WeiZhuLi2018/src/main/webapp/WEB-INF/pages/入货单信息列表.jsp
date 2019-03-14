<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/10/24
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()   + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <title>layui</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="<%=basePath%>/static/layui/layui/css/layui.css"  media="all">
  <script src="<%=basePath%>/static/layui/layui/layui.all.js"></script>
</head>
<body> 
 <div class="demoTable">
              
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>入货详情</legend>
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
  <input type="checkbox" name="lock" value="{{d.id}}" title="收货" lay-filter="lockDemo" {{ d.id == 10006 ? 'checked' : '' }}>
</script>

 <!---->
<table class="layui-hide" id="LAY_table_user" lay-filter="user"></table> 
 
<div style="position:absolute;right:100px;bottom:100px,">
  <button class="layui-btn layui-btn-lg layui-btn-radius layui-btn-normal" style="wdith:200px">确认</button>

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
    ,url: 'table2.json'
    ,cols: [[
     
      {field:'id', title: '商品编号', width:130, sort: true, fixed: true}
      ,{field:'username', title: '商品名', width:150}
      ,{field:'sex', title: '规格', sort: true}
      ,{field:'city', title: '订货数量', width:100}
      ,{field:'sign', title: '供货商编号', width:100}
	  ,{field:'sign', title: '供货商名称', width:100}
      ,{field:'sign', title: '供货商电话', width:100}
	  ,{field:'wealth', title: '备注', sort: true, width:135}
	  ,{field:'wealth', title: '确认收货', sort: true, width:135,templet: '#checkboxTpl', unresize: true}
    ]]
    ,id: 'testReload'
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
            ,page: true
            ,height: 315
  });
  //
    //监听付款操作
  form.on('checkbox(lockDemo)', function(obj){
    layer.tips(this.value + ' ' + this.name + '：'+ obj.elem.checked, obj.othis);
	
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
                            ,url:'${pageContext.request.contextPath}/tb/selTB'    //和分页一个接口
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