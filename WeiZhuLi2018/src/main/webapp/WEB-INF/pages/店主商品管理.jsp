<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()   + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String id = request.getParameter("sellerId");
    session.setAttribute("sellerId",id);
    System.out.println(id);
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>店主商品管理</title>
    <link href="<%=basePath%>/static/layui/layui/css/layui.css" rel="stylesheet" type="text/css" />
    <script src="<%=basePath%>/static/layui/layui/layui.all.js"></script>
    <script src="<%=basePath%>/static/jquery/jquery-3.3.1.min.js"></script>
    <script>
        //
        function exportExcel() {
            var url = '<%=basePath%>/cmc/feeList?sellerId=${sellerId}'
            // 这里一定不能使用Ajax请求
            window.open(url);
        }
    </script>
    <style>
        .layui-table-cell{
            height:60px;
            line-height: 60px;
        }
    </style>
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
    <legend><i class="layui-icon layui-icon-form" style="font-size:30px"></i>   商品管理</legend>
</fieldset>
<div class="demoTable">
    <button class="layui-btn" type="button" onclick="addgoods(-1,-1)">+添加商品</button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button class="layui-btn layui-btn-normal " onclick="addfenlei()">+商品分类</button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    商品分类：
    <div class="layui-inline" style="width:150px;">
        <form class="layui-form"  lay-filter="tanchuang">
            <select name="interest" lay-filter="aihao" class="boards">
                <option selected="selected" value="">--请选择--</option>
            </select>
        </form>
    </div>
    <div class="layui-inline" style="margin-left: 20px;margin-right: 50px;">
    <a href="#" class="layui-btn3" data-type="reload"> <i class="layui-icon layui-icon-search "></i></a>
</div>
    商品名称：
    <div class="layui-inline">
        <input name="id" class="layui-input" id="goodsName" autocomplete="off">
    </div>
    <div class="layui-inline"  style="margin-left: 20px;">
        <a href="#" class="layui-btn3" data-type="reload"> <i class="layui-icon layui-icon-search "></i></a>
    </div>

</div>
<!--添加分类-->

<div class="layui-row" id="addfenlei" style="display:none;">
    <form class="layui-form">
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">添加分类:</label>
            <div class="layui-input-inline">
                <input type="text" name="addSort" id="addSort" required  lay-verify="" placeholder="" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <button class="layui-btn" lay-filter="demo6" lay-submit="">确认添加</button>
        </div>
    </div>
    </form>
</div>
<!--添加商品-->
<div class="layui-row" id="addgoods" style="display:none;">
    <div class="layui-col-md11">
        <form class="layui-form"  lay-filter="tanchuang2" >
            <div class="layui-form-item">
                <label class="layui-form-label">上传图片</label>
                <div class="layui-input-inline uploadHeadImage">
                    <div class="layui-upload-drag" id="headImg">
                        <span class="layui-icon" style="font-size: 30px; color: #1E9FFF;" ></span>
                        <p>点击上传图片，或将图片拖拽到此处</p>
                    </div>
                </div>
                <div class="layui-input-inline">
                    <div class="layui-upload-list">
                        <img class="layui-upload-img headImage" src="http://t.cn/RCzsdCq" id="demo1">
                        <p id="demoText"></p>
                    </div>
                </div>
            </div>
            <input type="text" name="goodsImg" id="goodsImg" hidden="hidden" >
            <!---->
            <div class="layui-form-item">
                <label class="layui-form-label">名称:</label>
                <div class="layui-input-block">
                    <input type="text" name="goodsName" id="goodsName2" required  lay-verify="required" placeholder="请输入商品名称" autocomplete="off" class="layui-input">
                </div>
            </div>
            <!---->
            <div class="layui-form-item">
                <%--<div class="layui-inline">--%>
                    <%--<label class="layui-form-label">设置编号:</label>--%>
                    <%--<div class="layui-input-inline" style="width:100px;">--%>
                        <%--<input type="text" name="goodsVid" id="goodsVid" required  lay-verify="required" placeholder="请输入商品虚拟编号" autocomplete="off" class="layui-input">--%>

                    <%--</div>--%>
                    <%--<div>--%>

                    <div class="layui-inline">
                        <label class="layui-form-label">设置编号:</label>
                        <div class="layui-input-inline" style="width:200px;">
                            <input type="text" name="goodsVid" id="goodsVid" required  lay-verify="required" placeholder="请输入商品虚拟编号" autocomplete="off" class="layui-input">
                        </div>
                    </div>



                <div class="layui-inline">
                <label class="layui-form-label">分类:</label>
                <div class="layui-input-inline" style="width:100px;">
                    <select name="sortId" lay-verify="" id="boards" class="boards">
                        <option selected="selected" value="">-请选择-</option>
                    </select>
                </div>
                </div>
            </div>
            <!---->
            <div class="layui-form-item">
                <label class="layui-form-label">简介:</label>
                <div class="layui-inline" style="width:400px;height:100px;">
                    <textarea name="goodsContent" id="goodsContent" class="layui-textarea" placeholder="请输入内容"></textarea>
                </div>
            </div>
            <!---->
            <div class="layui-form-item">
                <label class="layui-form-label">规格:</label>
                <div class="layui-inline" >
                    <%--<li><input id="chimaid" name="goodsSize" title="尺码" type="checkbox"  lay-filter="chima" >--%>
                    <%--</li>--%>

                    <%--<div  id="chima" style="display:none;" class="layui-form-item" >--%>
                        <%--<input type="checkbox" name="L" title="L" lay-skin="primary" >--%>
                        <%--<input type="checkbox" name="XL" title="XL" lay-skin="primary">--%>
                        <%--<input type="checkbox" name="XXL" title="XXL" lay-skin="primary" >--%>

                    <%--</div>--%>

                    <%--<li>      <input lay-filter="yanse" name="goodsyanse" title="颜色" type="checkbox" lay-filter="颜色">--%>
                    <%--</li>--%>
                    <%--<div  id="yanse" style="display:none;"  >--%>
                        <%--<div>--%>
                            <%--<input type="checkbox" name="红色" title="红色" lay-skin="primary" >--%>
                            <%--<input type="checkbox" name="橙色" title="橙色" lay-skin="primary">--%>
                            <%--<input type="checkbox" name="黄色" title="黄色" lay-skin="primary" >--%>
                            <%--<input type="checkbox" name="绿色" title="绿色" lay-skin="primary" >--%>
                        <%--</div>--%>
                        <%--<div>--%>
                            <%--<input type="checkbox" name="青色" title="青色" lay-skin="primary" >--%>
                            <%--<input type="checkbox" name="蓝色" title="蓝色" lay-skin="primary" >--%>
                            <%--<input type="checkbox" name="紫色" title="紫色" lay-skin="primary" >--%>
                        <%--</div>--%>
                    <%--</div>--%>


                    <!---->
                    <div  id="qita" class="layui-form-item" >
                        <!---->
                        <div class="layui-inline">
                            <div class="layui-input-inline">
                                <input type="text" name="goodsElse" required  lay-verify="" placeholder="" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <!---->
                    </div>

                </div>
            </div>
            <!---->
            <%--<div class="layui-form-item">--%>
                <%--<label class="layui-form-label">状态:</label>--%>
                <%--<div class="layui-inline" style="width:100px;">--%>
                    <%--<input name="goodsState" type="checkbox" checked="" lay-filter="switchTest" lay-skin="switch" lay-text="在售|下架">--%>
                <%--</div>--%>
            <%--</div>--%>
            <!---->
            <div class="layui-form-item">
                <label class="layui-form-label">供货商:</label>
                <div class="layui-inline" style="width:100px;">
                    <select name="supplierId" lay-verify="" class="boards2">
                        <option selected="selected" value="">-请选择-</option>
                    </select>
                </div>
            </div>
            <!---->
            <div class="layui-form-item">
                <div class="layui-inline">
                <label class="layui-form-label">进价:</label>
                <div class="layui-input-inline" style="width:100px">
                    <input type="text" name="attributePrice0" id="attributePrice0" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                </div>
                </div>

                <div class="layui-inline">
                    <label class="layui-form-label">售价:</label>
                    <div class="layui-input-inline" style="width:100px">
                        <input type="text" name="attributePrice" id="attributePrice" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                    </div>
                </div>

                <%--<div class="layui-inline">--%>
                    <%--<label class="layui-form-label">库存:</label>--%>
                    <%--<div class="layui-input-inline" style="width:100px">--%>
                        <%--<input type="text" name="attributeRepertory" id="attributeRepertory" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">--%>
                    <%--</div>--%>
                <%--</div>--%>
            </div>
            <!---->
            <%--<div class="layui-form-item">--%>
                <%--<label class="layui-form-label">售价:</label>--%>
                <%--<div class="layui-input-block" style="width:100px">--%>
                    <%--<input type="text" name="attributePrice" id="attributePrice" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">--%>
                <%--</div>--%>
            <%--</div>--%>
            <%--<div class="layui-form-item">--%>
                <%--<label class="layui-form-label">库存:</label>--%>
                <%--<div class="layui-input-block" style="width:100px">--%>
                    <%--<input type="text" name="attributeRepertory" id="attributeRepertory" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">--%>
                <%--</div>--%>
            <%--</div>--%>
            <!---->
            <div class="layui-form-item">
                <label class="layui-form-label">备注:</label>
                <div class="layui-inline" style="width:400px;height:100px;">
                    <textarea name="attributeMemo" id="attributeMemo" class="layui-textarea" placeholder="请输入内容"></textarea>
                </div>
            </div>
            <!---->
            <div class="layui-form-item">
                &nbsp;   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;
                <button class="layui-btn" lay-filter="demo1" lay-submit="">立即提交</button>
            </div>
        </form>
    </div>
</div>


<!---->

<table class="layui-hide" id="LAY_table_user" lay-filter="user"></table>
<!--导出excel-->
<div>
    <input class="layui-btn layui-btn-radius layui-btn-normal" style="float: right;" id="export" type="button" value="导出EXCEL" onclick = "exportExcel()"/>
</div>
<script id="switchTpl" type="text/html">
    <input type="checkbox"  value="{{d.goodsState}}" lay-filter="lockDemo" lay-skin="switch" lay-text="下架|在售" {{ d.goodsState ==1?'checked':'' }}>
</script>
<script id="barDemo" type="text/html">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<!---->
<script type="text/javascript">
    function addgoods(id,aid){
        layui.use('layer', function(){ //独立版的layer无需执行这一句
            var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句
            layer.open({
                //layer提供了5种层类型。可传入的值有：0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
                type:1,
                title:"商品",
                area: ['60%','80%'],
                content:$("#addgoods"),
                end: function () {
                    location.reload();
                }
            });
        });
        layui.use('form', function(){
            var form = layui.form,
                $=layui.jquery;
            form.render();

            //监听提交
            form.on('submit(demo1)', function(data){
                layer.msg(JSON.stringify(data.field));
                var add = JSON.stringify(data.field);

                $.ajax({
                    url : '<%=basePath%>/goods/add_goods?sellerId=${sellerId}',
                    type : 'POST',
                    dataType : "JSON",//数据格式
                    data:{"goodsId":id,"attributeId":aid,"add":add},  //序列化表单                       键值段
                    success : function(data) {
                    }
                })

                return false;
            });
            //
            //监听指定开关
            form.on('switch(switchTest)', function(data){
                layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
                    offset: '6px'
                });
                layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
            });


            //显示
            form.on('checkbox(chima)',function(data){
                if(data.elem.checked==true){
                    $("#chima").css("display","");
                    form.render();
                }
                else{
                    $("#chima").css("display","none");
                    form.render();
                }
            });
            //
            //显示
            form.on('checkbox(yanse)',function(data){
                if(data.elem.checked==true){
                    $("#yanse").css("display","");
                    form.render();
                }
                else{

                    $("#yanse").css("display","none");
                    form.render();
                }
            });
            //
            //显示
            form.on('checkbox(qita)',function(data){
                if(data.elem.checked==true){
                    $("#qita").css("display","");
                    form.render();
                }
                else{
                    $("#qita").css("display","none");
                    form.render();
                }
            });

        });

//图片上传
        layui.use('upload', function(){
            var upload = layui.upload;
            var $ =layui.jquery;
            //执行实例
            var uploadInst = upload.render({
                elem: '#test1' //绑定元素
                ,url: '<%=basePath%>/cmc/upload_images' //上传接口
                ,accept:'images'  //设置上传类型
                ,before:function(obj){  //预览本地文件实例
                    obj.preview(function (index,file,result) {
                        $('#demo1').attr('src',result);
                    })
                }
                ,done: function(res){
                    //上传完毕回调
                    if(res.code>0){
                        return layer.msg('上传失败');
                    }
                    else{
                        alert("上传成功"+res.url);
                        document.getElementById("img_url").value=res.url;
                    }
                }
                ,error: function(){
                    //请求异常回调
                    var demoText=$('demoText');
                    demoText.html('<span style="color:#FF5722;">上传失败 </span>' +
                        '<a class="layui-btn layui-btn-mini demo-reload">重试</a>');

                    demoText.find('.demo-reload').on('click',function ( ) {
                        uploadInst.upload;
                    })
                }
            });
        });
    }
    //
</script>
<!---->
<script>
    var a="";
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
        var table = layui.table
    ,form = layui.form;
        //方法级渲染
        table.render({
            elem: '#LAY_table_user'
            ,url: '<%=basePath%>/cmc/select_goods?sellerId=${sellerId}'
            ,cols: [[
//   {checkbox: false, fixed: false}
                 {field:'virtualId', title: '商品编号', width:150, sort: true, fixed: true}
                ,{field:'goodsName', title: '商品名称', width:150, sort: true, fixed: true}
                ,{field:'sortName', title: '商品分类', width:100}
                ,{field:'startTime', title: '时间', width:100}
                ,{field:'attributePrice', title: '售价(￥)', width:100, sort: true}
                // ,{field:'attributePriceVip', title: 'VIP价(￥)', width:100}
                // ,{field:'attributePrice0', title: '进价(￥)', width:100}
                ,{field:'goodsImg1', title: '图片',templet:'<div><img src="<%=basePath%>{{d.goodsImg1}}"></div>'}
                ,{field:'supplierName', title: '供应商', sort: true, width:100}
                ,{field:'goodsState', title: '状态', sort: true, width:100,templet: '#switchTpl', unresize: true}
                ,{field:'attributeSize', width:70, title: '规格', sort: true}
                //,{field:'attributeRepertory', title: '库存', width:80}
                ,{field:'wealth', title: '操作', sort: true, width:120,toolbar: '#barDemo'}
            ]]
            ,id: 'testReload'
            ,limits: [10, 20, 30, 40, 50]
            ,done:function(res,curr,count){
                hoverOpenImg();//显示大图
            }
            ,limit: 2
            ,page: true
        });
        //监视在售状态
        form.on('switch(lockDemo)', function(obj){
            var data = $(obj.elem);

            var id = data.parents('tr').first().find('td').eq(0).text();
            var check = obj.elem.checked;
            layer.tips(this.value + ' ' + this.name + '：'+ obj.elem.checked, obj.othis);
            $.ajax({
            url:"<%=basePath%>/goods/updata_goodsState",                   //数据接口
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
                var goodsName = $('#goodsName').val();
                var sort = $('.boards').val();
                //执行重载
                table.reload('testReload', {

                    page: {
                        curr: 1 //重新从第 1 页开始
                    },
                    method:'post'
                    ,url:'${pageContext.request.contextPath}/cmc/select_goods?sellerId=${sellerId}'    //和分页一个接口
                    ,where: {
                        goodsName: goodsName,
                        sort:sort
                    }
                });
            }
        };
        $('.demoTable .layui-btn3').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });

        $('.demoTable .layui-btn1').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });


        //监听工具条
        table.on('tool(user)', function(obj){
            a= obj.data;
            var aid=a.attributeId;

            if(obj.event === 'detail'){
                layer.msg('ID：'+ data.id + ' 的查看操作');
            } else if(obj.event === 'del'){

                layer.confirm('真的删除行么', function(index){

                    obj.del();
                    layer.close(index);

                    //
                    $.ajax({
                        url : '<%=basePath%>/goods/delete_goods',
                        type : 'POST',
                        data:{"id":a.goodsId},  //序列化表单                       键值段
                        success : function(data) {
                        }
                    })
                });
            } else if(obj.event === 'edit'){
                //  layer.alert('编辑行：<br>'+ JSON.stringify(data))
                var id=a.goodsId;

                $.ajax({
                    url : "<%=basePath%>/cmc/select_goods/"+id,//请求地址
                    dataType : "JSON",//数据格式
                    type : "GET",//请求方式
                    success : function(result) {//如果请求成功，返回数据。
                        var commodityManagement = result.extend.commodityManagement;
                        $("#goodsName2").val(commodityManagement.goodsName);
                        $("#goodsContent").val(commodityManagement.goodsContent);
                        $("#attributePrice0").val(commodityManagement.attributePrice0);
                        $("#attributePrice").val(commodityManagement.attributePrice);
                        $("#attributeRepertory").val(commodityManagement.attributeRepertory);
                        $("#attributeMemo").val(commodityManagement.attributeMemo);

                    },
                })
                addgoods(id,aid);
            }
        });
    });
</script>
<!--表单-->
<script>
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
                        title:"提交信息",
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
                    $(".boards").append(optionStr);
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
    function getBoards2(){
        $.ajax({
            url : '<%=basePath%>/supplier/select_supplier_storeId',
            type : 'POST',
            dataType:"JSON",
            data:{"id":<%=id%>},  //序列化表单                       键值段
            success : function(data) {
                for(var i=0;i<=data.length;i++){
                    var optionStr = "";
                    optionStr += "<option value='" + data[i].supplierId+ "'>"
                        +  data[i].supplierName + "</option>";
                    $(".boards2").append(optionStr);
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
<script>
    layui.use(["jquery", "upload", "form", "layer", "element"], function () {
        var $ = layui.$,
            element = layui.element,
            layer = layui.layer,
            upload = layui.upload,
            form = layui.form;
        //拖拽上传
        var uploadInst = upload.render({
            elem: '#headImg'
            , url: '<%=basePath%>/cus/upload_images'
            ,accept:'images'
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo1').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                var a=res.src;
                document.getElementById("goodsImg").value=a;

                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                //上传成功
                //打印后台传回的地址: 把地址放入一个隐藏的input中, 和表单一起提交到后台, 此处略..
                console.log(res.data.src);
                // window.parent.uploadHeadImage(res.data.src);
                var demoText = $('#demoText');
                demoText.html('<span style="color: #8f8f8f;">上传成功!!!</span>');
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-mini demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        });
        element.init();
    });
</script>
<script type="text/javascript">
    function addfenlei(){
        layui.use('layer', function(){ //独立版的layer无需执行这一句
            var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句
            layer.open({
                //layer提供了5种层类型。可传入的值有：0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
                type:1,
                title:"分类",
                area: ['40%','20%'],
                content:$("#addfenlei").html(),
                end: function () {
                    location.reload();
                }
            });
        });
        layui.use('form', function(){
            var form = layui.form,
                $=layui.jquery;
            form.render();

            //监听提交
            form.on('submit(demo6)', function(data){
                layer.msg(JSON.stringify(data.field));
               var sortName = JSON.stringify(data.field);
                $.ajax({
                    url : '<%=basePath%>/sort/add_sort?sellerId=${sellerId}',
                    type : 'POST',
                    dataType : "JSON",//数据格式
                    data:{"sortName":sortName},  //序列化表单                       键值段
                    success : function(data) {
                    }
                })

                return false;
            });
        });
    }
</script>
</body>

</html>
