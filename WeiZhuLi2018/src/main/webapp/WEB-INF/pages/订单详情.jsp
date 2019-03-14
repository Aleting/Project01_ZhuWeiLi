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
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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

<form class="layui-form" action="" >
    <div class="layui-inline" style="width:300px;position:static">
        <label class="layui-form-label">客户:</label>
        <div class="layui-inline">
            <input name="title" class="layui-input" type="text" placeholder="" autocomplete="off" lay-verify="title">
        </div>
        <i class="layui-icon layui-icon-add-circle-fine " style="font-size: 17px;"></i>
    </div>
    <div class="layui-form-item">
    </div>
    <div class="layui-form-item" style="width:300px;">
        <label class="layui-form-label">发货人:</label>
        <div class="layui-input-block">
            <input name="username" class="layui-input" type="text" placeholder="" autocomplete="off" lay-verify="required">
        </div>
    </div>

    <div class="layui-inline" style="width:300px;">
        <label class="layui-form-label">收货人:</label>
        <div class="layui-inline">
            <input name="username" class="layui-input" type="text" placeholder="" autocomplete="off" lay-verify="required">
        </div>
        <i class="layui-icon layui-icon-add-circle-fine " style="font-size: 17px;"></i>

    </div>
    <div class="layui-form-item" >
    </div>
    <div class="layui-form-item" >
        <label class="layui-form-label" >发货地址:</label>
        <div class="layui-input-block" style="width:500px;">
            <input name="username" class="layui-input" type="text" placeholder="" autocomplete="off" lay-verify="required">
        </div>
    </div>
    <div class="layui-inline" >
        <label class="layui-form-label" >收货地址:</label>
        <div class="layui-inline" style="width:500px;">
            <input name="username" class="layui-input" type="text" placeholder="" autocomplete="off" lay-verify="required">
        </div>
        <a href="#"> <i id="xuanzediqu" class="layui-icon layui-icon-add-circle-fine " style="font-size: 17px;"></i>  </a>
    </div>
    <div class="layui-form-item" >
    </div>

    <!---->
    <!-- 全国地区-->
    <div class="layui-form-item" id="xianshidiqu" style="display:none">
        <label class="layui-form-label">选择地区</label>
        <div class="layui-input-inline">
            <select name="provid" id="provid" lay-filter="provid">
                <option value="">请选择省</option>
            </select>
        </div>
        <div class="layui-input-inline">
            <select name="cityid" id="cityid" lay-filter="cityid">
                <option value="">请选择市</option>
            </select>
        </div>
        <div class="layui-input-inline">
            <select name="areaid" id="areaid" lay-filter="areaid">
                <option value="">请选择县/区</option>
            </select>
        </div>
        <div class="layui-input-inline">
            <input  class="layui-input" type="text"   style="size:200px;width:200px;">

        </div>
        <div class="layui-input-inline">
            <button id="querenxiugai" class="layui-btn">确认修改</button>

        </div>
    </div>
    <!---->
    <div class="layui-form-item" >
        <label class="layui-form-label" >商品列表：</label>


        <div class="layui-inline" style="width:100px">
            <select name="interest" lay-filter="aihao" >
                <option value=""></option>
                <option value="0">写作</option>
                <option value="1" selected="">阅读</option>
                <option value="2">游戏</option>
                <option value="3">音乐</option>
                <option value="4">旅行</option>
            </select>
        </div>

        <div class="layui-inline">

            <input name="username" class="layui-input" type="text" placeholder="" autocomplete="off" >
        </div>
        <i class="layui-icon layui-icon-search"></i>


    </div>


    <!---->

    <div class="layui-input-block" >
        <!---->
        <table class="layui-hide" id="test"></table>
        <script id="toolbarDemo" type="text/html">
            <div class="layui-btn-container">
                <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
            </div>
        </script>
        <!---->
    </div>
    </div>
    <!---->
    <div class="layui-form-item" >


        <div class="layui-inline" >
            <label class="layui-form-label" >总价</label>
            <input  class="layui-input" type="text"   disabled="disabled" style="size:100px;width:100px;">
        </div>
        <div class="layui-inline" >
            <button class="layui-btn" lay-filter="demo1" lay-submit="">付款</button>

        </div>
        <div class="layui-inline" >
            <input type="checkbox" name="" title="已付款">

        </div>

    </div>


</form>
<div class="layui-row" id="fukuan" style="display:none;">
    <div><img src="image/微信.jpg" style="width:105px;height:100px"></div>
    <div><img src="image/支付宝.jpg" style="width:105px;height:100px">  </div>
</div>

<script>
    $("#xuanzediqu").click(function(){
        if($("#xianshidiqu").css("display")=="none" ){
            $("#xianshidiqu").css("display","");
        }
        else{
            $("#xianshidiqu").css("display","none");
        }

    });
    <!---->
    $("#querenxiugai").click(function(){
        $("#xianshidiqu").css("display","none");


    });


</script>
<script>
    layui.use('table', function(){
        var table = layui.table;

        table.render({
            elem: '#test'
            ,url:'table2.json'
            ,height:312
            ,toolbar: '#toolbarDemo'

            ,cols: [[
                {type:'checkbox'}
                ,{field:'goods_id', width:100, title: '商品编号', sort: true}
                ,{field:'goods_name', width:100, title: '商品名'}
                ,{field:'sort_id', width:100, title: '分类', sort: true}
                ,{field:'goods_img1', title: '商品图片'}
                ,{field:'goods_content', width:130, title: '商品说明', sort: true}
                ,{field:'score', width:100, title: '售价', sort: true}
                ,{field:'classify', width:100, title: 'VIP价'}
                ,{field:'wealth', width:100, title: '尺码', sort: true}
                ,{field:'wealth', width:100, title: '颜色', sort: true}
                ,{field:'1', width:100, title: '购买数量', sort: true}

            ]]
            ,page: true
        });
        //头工具栏事件
        form.table.on('toolbar(test)', function(obj){

            var checkStatus = table.checkStatus(obj.config.id);
            switch(obj.event){
                case 'getCheckData':
                    var data = checkStatus.data;
                    layer.alert(JSON.stringify(data));
                    break;
                case 'getCheckLength':
                    var data = checkStatus.data;
                    layer.msg('选中了：'+ data.length + ' 个');
                    break;
                case 'isAll':
                    layer.msg(checkStatus.isAll ? '全选': '未全选');
                    break;
            };
        });

    });

    //





    //
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;

        var lock = false;


        //监听提交
        form.on('submit(demo1)', function(data){
            layui.use('layer', function(){ //独立版的layer无需执行这一句


                var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句
                if(!lock){
                    lock = true;
                    layer.open({
//layer提供了5种层类型。可传入的值有：0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
                        type:1,
                        title:"请选用付款方式",
                        area: ['40%','40%'],
                        content:$("#fukuan").html()
                    });


                }
                else{
                    layer.alert(JSON.stringify(data.field), {
                        title: '最终的提交信息'
                    })
                }



            });

            return false;
        });



    });
</script>
</body>
</html>
