<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/10/24
  Time: 9:28
  To change this template use File | Settings | File Templates.
--%>
<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()   + path + "/";
%>

<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="utf-8"
%>
<%
    String id = request.getParameter("sellerId");
    session.setAttribute("sellerId",id);
    System.out.println(id);
%>
<style>
    .layui-table-cell{
        height:60px;
        line-height: 60px;
    }
</style>
<html>
</body>
</html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="<%=basePath%>/static/layui/layui/css/layui.css" rel="stylesheet" type="text/css" />
    <script src="<%=basePath%>/static/layui/layui/layui.all.js"></script>
    <script src="<%=basePath%>/static/jquery/jquery-3.3.1.min.js"></script>
    <script>
        var defaults = {
            s1: 'provid',
            s2: 'cityid',
            s3: 'areaid',
            v1: null,
            v2: null,
            v3: null
        };

    </script>

</head>

<body>



<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>订单录入</legend>
</fieldset>
<div class="demoTable">
    <form class="layui-form demoTable" action="" >
        <div class="layui-inline" style="width:300px;position:static">
            <label class="layui-form-label">客户:</label>
            <div class="layui-inline" style="width:150px;">
                <select name="customerId" lay-filter="aihao" id="boards2">
                    <option selected="selected" value="">--请选择--</option>
                </select>
            </div>
            <i class="layui-icon layui-icon-add-circle-fine " style="font-size: 17px;"></i>
        </div>


        <div class="layui-form-item">
        </div>
        <div class="layui-form-item" >
            <div class="layui-inline">
                <label class="layui-form-label">发货人:</label>
                <div class="layui-input-inline">
                    <input name="发货人" class="layui-input" type="tel" autocomplete="off" lay-verify="required">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">发货人电话:</label>
                <div class="layui-input-inline">
                    <input name="发货人电话" class="layui-input" type="text" autocomplete="off" lay-verify="required">
                </div>
            </div>
            <!---->
            <div class="layui-inline" >
                <label class="layui-form-label">发货地址:</label>
                <div class="layui-input-inline" style="width:500px;">

                    <input name="发货地址" class="layui-input" type="text" placeholder="" autocomplete="off" lay-verify="required">
                </div>


                <!---->
            </div>
            <div class="layui-form-item" >
            </div>

            <div class="layui-form-item" >
                <label class="layui-form-label">收货人:</label>
                <div class="layui-inline">
                    <input name="收货人" class="layui-input" type="text" placeholder="" autocomplete="off" lay-verify="required">
                </div>
                <div class="layui-inline">

                    <i class="layui-icon layui-icon-add-circle-fine " style="font-size: 17px;"></i>
                </div>
                <div class="layui-inline">
                    <label class="layui-form-label">收货人电话:</label>
                    <div class="layui-input-inline">
                        <input name="收货人电话" class="layui-input" type="text" placeholder="" autocomplete="off" lay-verify="required">

                    </div>
                </div>
                <!---->
                <div class="layui-inline" >
                    <label class="layui-form-label" >收货地址:</label>
                    <div class="layui-input-inline" style="width:500px;">
                        <input name="收货地址" class="layui-input" type="text" placeholder="" autocomplete="off" lay-verify="required">
                    </div>
                    <a href="#"> <i id="xuanzediqu" class="layui-icon layui-icon-add-circle-fine " style="font-size: 17px;"></i>  </a>
                </div>

                <!---->
            </div>

            <div class="layui-form-item" >
            </div>

            <!---->
            <!-- 全国地区-->
            <%--<div class="layui-form-item" id="xianshidiqu" style="display:none">--%>
                <%--<label class="layui-form-label">选择地区</label>--%>
                <%--<div class="layui-input-inline">--%>
                    <%--<select name="provid" id="provid" lay-filter="provid">--%>
                        <%--<option value="">请选择省</option>--%>
                    <%--</select>--%>
                <%--</div>--%>
                <%--<div class="layui-input-inline">--%>
                    <%--<select name="cityid" id="cityid" lay-filter="cityid">--%>
                        <%--<option value="">请选择市</option>--%>
                    <%--</select>--%>
                <%--</div>--%>
                <%--<div class="layui-input-inline">--%>
                    <%--<select name="areaid" id="areaid" lay-filter="areaid">--%>
                        <%--<option value="">请选择县/区</option>--%>
                    <%--</select>--%>
                <%--</div>--%>
                <%--<div class="layui-input-inline">--%>
                    <%--<input  class="layui-input" type="text"   style="size:200px;width:200px;">--%>

                <%--</div>--%>
                <%--<div class="layui-input-inline">--%>
                    <%--<button id="querenxiugai" class="layui-btn">确认修改</button>--%>

                <%--</div>--%>
            <%--</div>--%>
            <!---->
            <div class="layui-form-item" >
                <label class="layui-form-label" >商品列表：</label>

                <div class="layui-inline">


                    <div class="layui-inline" style="width:100px">
                        <label class="layui-form-label" >商品名：</label>

                    </div>

                    <div class="layui-inline ">

                        <input name="username" id="goodsName" class="layui-input" type="text" placeholder="" autocomplete="off" >
                    </div>
                    <a href="#" class="layui-btn1" data-type="reload"> <i class="layui-icon layui-icon-search "></i></a>

                </div>


                <!---->
                <div class="layui-inline">


                    <div class="layui-inline" style="width:100px">
                        <label class="layui-form-label" >商品编号：</label>

                    </div>

                    <div class="layui-inline">

                        <input name="username" id="goodsId" class="layui-input" type="text" placeholder="" autocomplete="off" >
                    </div>
                    <a href="#" class="layui-btn2" data-type="reload"><i class="layui-icon layui-icon-search"></i></a>

                </div>
                <div class="layui-inline">
                    <label class="layui-form-label" >分类：</label>

                </div>
                <!---->
                <div class="layui-inline" style="width:150px;">
                    <select name="interest" lay-filter="aihao" id="boards">
                        <option selected="selected" value="">--请选择--</option>
                    </select>
                </div>

                <!---->
                <div class="layui-inline">
                    <a href="#" class="layui-btn3" data-type="reload"> <i class="layui-icon layui-icon-search "></i></a>

                </div>
            </div>


            <!---->

            <div class="layui-input-block" >
                <!---->

                <table class="layui-hide" id="test" lay-filter="test"></table>
                <%--<script id="toolbarDemo" type="text/html">--%>
                    <%--<div class="layui-btn-container">--%>
                        <%--<button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>--%>
                    <%--</div>--%>
                <%--</script>--%>
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
                <input type="checkbox" name="已付款" title="已付款">

            </div>

        </div>


    </form>
</div>
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
    var jsonstr="[]";
    var jsonarray="";
    jsonarray = eval('('+jsonstr+')');
    function hoverOpenImg(){
        var img_show = null; // tips提示
        $('td img').hover(function(){
            //alert($(this).attr('src'));
            var img = "<img class='img_msg' src='"+$(this).attr('src')+"' style='width:130px;' />";
            img_show = layer.tips(img, this,{
                tips:[2, 'rgba(41,41,41,.5)']
                ,area: ['160px']
            });
        },function(){
            layer.close(img_show);
        });
        $('td img').attr('style','max-width:70px');
    }

    layui.use('table', function(){
        var table = layui.table;

        table.render({
            elem: '#test'
            ,url:'<%=basePath%>/cmc/select_goods?sellerId=${seller.sellerId}'
            ,height:515
            ,toolbar: '#toolbarDemo'

            ,cols: [[
                {type:'checkbox'}
                ,{field:'goodsId', width:100, title: '商品编号', sort: true}
                ,{field:'goodsName', width:100, title: '商品名'}
                ,{field:'sortName', width:100, title: '分类', sort: true}
                ,{field:'goodsImg1', title: '商品图片',templet:'<div><img src="<%=basePath%>{{d.goodsImg1}}"></div>'}
                ,{field:'goodsContent', width:130, title: '商品说明', sort: true}
                ,{field:'attributePrice', width:100, title: '售价', sort: true}
                ,{field:'startTime', width:200, title: '上架时间'}
                ,{field:'attributeSize', width:100, title: '规格', sort: true}
                ,{field:'goodsNum', width:100, title: '购买数量', sort: true,edit: 'text'}

            ]]
            ,id: 'testReload'
            ,page: true
            ,done: function(res, curr, count){
                //如果是异步请求数据方式，res即为你接口返回的信息。
                    hoverOpenImg();//显示大图
                    $('table tr').on('click',function(){
                        $('table tr').css('background','');
                    });
            }

            ,limits: [10, 20, 30, 40, 50]
            ,limit: 2
        });

        var $ = layui.$, active = {
            reload: function(){
                var goodsId = $('#goodsId');
                var goodsName = $('#goodsName').val();
                var sort = $('#boards').val();
                //执行重载
                table.reload('testReload', {

                    page: {
                        curr: 1 //重新从第 1 页开始
                    },
                    method:'post'
                    ,url:'${pageContext.request.contextPath}/cmc/select_goods?sellerId=${sellerId}'    //和分页一个接口
                    ,where: {
                        goodsId: goodsId.val(),
                        goodsName: goodsName,
                        sort:sort
                    }
                });
            }
        };
        //
        $('.demoTable .layui-btn1').on('click', function(){

            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';

        });

        $('.demoTable .layui-btn2').on('click', function(){

            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';

        });

        $('.demoTable .layui-btn3').on('click', function(){

            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';

        });
        //监听单元格编辑
        table.on('edit(test)', function(obj){
            var value = obj.value //得到修改后的值
                ,data = obj.data //得到所在行所有键值
                ,field = obj.field; //得到字段
            layer.msg('[ID: '+ data.id +'] ' + field + ' 字段更改为：'+ value);
        });
        //监听复选框事件
        table.on('checkbox(test)', function(obj){
              if(obj.type=="one"){
                  alert(JSON.stringify(obj.data));
                  jsonarray.push(obj.data);


              }
            else{
                  jsonarray.push(obj.data);
              }



        });
        //


    });
    layui.use(['form', 'layedit', 'laydate'], function(){
        var id=<%=id%>;
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;
        getBoards();
        getBoards2();
        var lock = false;


        //监听提交
        form.on('submit(demo1)', function(data){
            layui.use('layer', function(){ //独立版的layer无需执行这一句


                var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句
                if(!lock){
                    lock = true;
                    layer.open({
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
                var a =   JSON.stringify(jsonarray);
                var b =   JSON.stringify(data.field);
                //
                $.ajax({
                    url : '<%=basePath%>/Order_Goods/add_order?sellerId=${sellerId}',
                    type : 'POST',
                    dataType : "JSON",//数据格式
                    data:{"Table":a,"Form":b},  //序列化表单                       键值段
                    success : function(data) {
                    }
                })


                //
            });
            return false;
        });
    });


    function getBoards(){
        $.ajax({
            url : '<%=basePath%>/sort/order_fenlei',
            type : 'POST',
            dataType:"JSON",
            data:{"id":<%=id%>},  //序列化表单                       键值段
            success : function(data) {
                for(var i=0;i<=data.length;i++){
                    var optionStr = "";
                    optionStr += "<option value='" + data[i].sortId+ "'>"
                        +  data[i].sortName + "</option>";
                    $("#boards").append(optionStr);
                    layui.use(['form'], function(){
                        var form1 = layui.form;
                        form1.render('select');
                    })
                }
            },
            error : function(data) {
               //alert('查找板块报错');
            }
        });
    }
    function getBoards2(){
        $.ajax({
            url : '<%=basePath%>/cus/seleCus2',
            type : 'POST',
            dataType:"JSON",
            data:{"id":<%=id%>},
            success : function(data) {
                for(var i=0;i<=data.length;i++){
                    var optionStr = "";
                    optionStr += "<option value='" + data[i].customerId+ "'>"
                        +  data[i].customerLoginName + "</option>";
                    $("#boards2").append(optionStr);
                    layui.use(['form'], function(){
                        var form1 = layui.form;
                        form1.render('select');
                    })
                }
            },
            error : function(data) {
            }
        });
    }
</script>


</body>
</html>
