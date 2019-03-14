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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
    <link href="<%=basePath%>/static/layui/layui/css/layui.css" rel="stylesheet" type="text/css" />
    <%--<link rel="stylesheet" href="https://res.layui.com/layui/dist/css/layui.css?t=1542630986934"  media="all">--%>
    <%--<link rel="stylesheet" href="https://res.layui.com/static/css/global.css?t=1542630986934-6" media="all">--%>
    <script src="<%=basePath%>/static/layui/layui/layui.all.js" charset="utf-8"></script>
    <%--<script async src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>--%>
    <script src="<%=basePath%>/static/jquery/jquery-3.3.1.min.js"></script>
</head>

<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
  <legend>续费界面</legend>
</fieldset>
<form class="layui-form layui-form-pane" action="">
  <div class="layui-form-item">
    <label class="layui-form-label">店铺名:</label>
    <div class="layui-input-inline">
      <input name="storeName" id="storeName" class="layui-input" type="text"  autocomplete="off" >
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">注册日期:</label>
    <!--注册时期-->
    <div class="layui-input-inline">
      <input name="storeStartTime" id="storeStartTime" class="layui-input" type="text"  autocomplete="off" >
    </div>
  </div>
  
  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">到期日期:</label>
      <div class="layui-input-inline">
      <input name="endTime" id="endTime" class="layui-input" type="text"  autocomplete="off" >

      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">续费日期:</label>
      <div class="layui-input-inline">
              <input name="date" class="layui-input" id="date1" type="text" autocomplete="off">
      </div>
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">付费方式:</label>
    <div class="layui-input-block">
     <input type="radio" name="method" value="支付宝" title="支付宝">
      <input type="radio" name="method" value="微信" title="微信" checked>
    </div>
  </div>
  
  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">金额:</label>
      <div class="layui-input-inline" style="width: 100px;">
        <input name="jine" class="layui-input" id="jine" type="text" placeholder="￥" autocomplete="off" disabled="disabled">
      </div>
     
  </div>
  

  <div class="layui-form-item">
    <button class="layui-btn" lay-filter="demo1" lay-submit="">付费</button>
  </div>
</form>
<!--弹窗-->
          <div class="layui-row" id="zhifubao" style="display:none;position:static">
          <div style="position:absolute;top:50%; 
left:50%; 
margin-top:-150px; 
margin-left:-100px; ">	 
         <img src="images/付款码.jpg">
         </div>
         
         <div  style="position:absolute; 
left:75%; 
bottom:0px; 
margin-left:-100px; ">
         <button class="layui-btn" id="wancheng1">完成</button>
         </div>
          </div>  
  <!--弹窗-->
          <div class="layui-row" id="weixin" style="display:none;position:static">	 
          
          <div style="position:absolute;top:50%; 
left:50%; 
margin-top:-150px; 
margin-left:-100px; ">	 
         <img src="images/付款码.jpg">
         </div>
         
         <div  style="position:absolute;
left:75%; 
bottom:0px; 
margin-left:-100px; ">
         <button class="layui-btn" id="wancheng2">完成</button>
         </div>
          </div>  

<script>
layui.use(['form', 'layedit', 'laydate','jquery'], function(){
  var form = layui.form
 
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;
  var $ = layui.$;
  form.render();

    $.ajax({
        url : "<%=basePath%>/store/select_store_id",//后台请求的数据，用的是PHP
        dataType : "JSON",//数据格式
        type : "GET",//请求方式

        success : function(result) {//如果请求成功，返回数据。
            var seller = result.extend.store;
            $("#storeName").val(seller.storeName);
            $("#storeStartTime").val(seller.storeImg);
        },
    })

    $.ajax({
        url : "<%=basePath%>/cost/select_cost",//后台请求的数据，用的是PHP
        dataType : "JSON",//数据格式
        type : "GET",//请求方式

        success : function(result) {//如果请求成功，返回数据。
            var seller = result.extend.cost[0];
            $("#endTime").val(seller.payment);
        },
    })
 
  laydate.render({
          elem: '#date1'
          ,done: function(value, date){
  //   layer.alert('你选择的日期是：' + value + '<br>获得的对象是' + JSON.stringify(date));
	var xufei = Date.parse(new Date(value));

	var daoqi = Date.parse(new Date($('#endTime').val()));


	var usedTime = xufei - daoqi;  //两个时间戳相差的毫秒数
	if(usedTime<=0)
	{
		 layer.alert('请选择正确日期！')
		}
		else{
	var days=Math.floor(usedTime/(24*3600*1000));
	//金额设置
	var jine = days*10;
$("#jine").attr("value",jine);//推荐这种写法,可正常赋值
}
  }
  });
//日期over
  
  //监听提交
  form.on('submit(demo1)', function(data){
//    layer.alert(JSON.stringify(data.field), {
//      title: '最终的提交信息'
//    })
	if(data.field.method=="支付宝")
	{
        var method="支付宝";
        var endTime = $('#date1').val();
        var money = $('#jine').val();
        var type=1;
        addImg(method);
        //点击完成事件
        $("#wancheng1").click(function(){
            $.ajax({
                type: "GET",
                url: '<%=basePath%>/cost/addcost',
                data: {"endTime":endTime,"money":money,"type":type},
                dataType: "json",
                success: function(data){

                }
            });
			})
		}
	else{
		var method="微信";
        var endTime = $('#date1').val();
        var money = $('#jine').val();
        var type=2;
		addImg(method);
		
		$("#wancheng2").click(function(){
			  $.ajax({
             type: "GET",
                  url: '<%=basePath%>/cost/addcost',
                  data: {"endTime":endTime,"money":money,"type":type},
             dataType: "json",
             success: function(data){

                      }
         });
			})
		}
	
    return false;
  });

});
//监听提交over

</script>
<script type="text/javascript">
function addImg(  method){
	if(method=="支付宝"){
	layui.use('layer', function(){ //独立版的layer无需执行这一句
  var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句
layer.open({        	
//layer提供了5种层类型。可传入的值有：0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
            type:1,            
			title:method+"支付",            
			area: ['20%','70%'],            
			content:$("#zhifubao"),
			 end: function () {
        location.reload();
      }     
			 });
});
}
else
{
	layui.use('layer', function(){ //独立版的layer无需执行这一句
  var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句
layer.open({        	
//layer提供了5种层类型。可传入的值有：0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
            type:1,            
			title:method+"支付",            
			area: ['20%','70%'],            
			content:$("#weixin"),
			 end: function () {
        location.reload();
      }  
			 });
});
	
	}

	
	}
</script>
</body>

</body>
</html>
