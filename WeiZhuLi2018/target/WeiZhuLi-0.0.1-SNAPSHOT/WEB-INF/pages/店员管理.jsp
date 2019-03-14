<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/10/24
  Time: 9:23
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
<table class="layui-hide" id="test" lay-filter="test" lay-data=></table>




<!---->

<!-- 选择角色的按钮 -->
<div class="layui-row" id="popSearchRoleTest" style="display:none;">
    <div class="layui-col-md11" style="position:static">
        <form class="layui-form" lay-filter="formTestFilter2121" >
            <div class="layui-form-item">
                <label class="layui-form-label">店员名：</label>
                <div class="layui-input-inline">

                    <input type="text" name="userName"  class="layui-input" disabled="disabled">

                </div>
                <label class="layui-form-label">权限：</label>


                <div class="layui-input-block">
                    <input type="checkbox" name="" title="权限1" checked>
                    <input type="checkbox" name="" title="权限2">
                    <input type="checkbox" name="" title="权限3">
                    <input type="checkbox" name="" title="权限4">
                    <input type="checkbox" name="" title="权限5">
                    <input type="checkbox" name="" title="权限6">
                    <input type="checkbox" name="" title="禁用" disabled>
                </div>

                <div class="layui-input-inline" style="position:absolute;bottom:50px;left:37%">
                    <!--                  提交表单
                    -->                         <button class="layui-btn layui-btn-normal">确认修改</button>

                </div>
        </form>
    </div>



</div>



<script>
    function selectRole(){
        layui.use('layer', function(){ //独立版的layer无需执行这一句
            var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句
            layer.open({
//layer提供了5种层类型。可传入的值有：0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
                type:1,
                title:"权限设置",
                area: ['30%','50%'],
                offset: ['100px', '250px'],
                content:$("#popSearchRoleTest").html()
            });


        });
    }
</script>


<!---->
<script id="toolbarDemo" type="text/html">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
        <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
        <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
    </div>
</script>
<!--//-->
<script id="switchTpl" type="text/html">
    <input type="checkbox" name="启用" value="{{d.id}}" lay-skin="switch" lay-text="启用|禁用" lay-filter="sexDemo" {{ d.id == 10003 ? 'checked' : '' }}>
</script>
<!---->
<script id="barDemo" type="text/html">
    <a class="layui-btn layui-btn-xs"  type="button" onclick="selectRole()">权限</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>


<script src="layui/layui/layui.js" charset="utf-8"></script>
<script src="layui/layui/layui.all.js" charset="utf-8"></script>

<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

<script>
    layui.use('table', function(){
        var table = layui.table
            ,form = layui.form;

        //监听单元格编辑
        table.on('edit(test)', function(obj){
            var value = obj.value //得到修改后的值
                ,data = obj.data //得到所在行所有键值
                ,field = obj.field; //得到字段
            layer.msg('[ID: '+ data.id +'] ' + field + ' 字段更改为：'+ value);
//layer.msg(15165);
        });
        //
        table.render({
            elem: '#test'
            ,url:'table2.json'
            ,toolbar: '#toolbarDemo'
            ,title: '用户数据表'
            ,height: 315
            ,limit: 5 //每页默认显示的数量
            ,limits: [3,5,10]
            <%--,url: '<%=basePath%>/T_bought/select_tBought?storeId=${seller.storeId}'--%>
            ,url: '<%=basePath%>/user/select_seller'
            ,cols: [[
                {type: 'checkbox', fixed: 'left'}
                ,{field:'sellerId', title:'ID', width:80, fixed: 'left', unresize: true, sort: true}
                ,{field:'sellerLoginName', title:'店员用户名', width:120, }
                ,{field:'sellerMailbox', title:'邮箱', width:150, }/*templet: function(res){
        return '<em>'+ res.email +'</em>'
      }*/<!--}-->
                ,{field:'sellerSex', title:'性别', width:80, edit: 'text', sort: true}

                ,{field:'sellerPhone', title:'手机号', width:130, sort: true}
                // ,{field:'gongzi', title:'工资', width:120,edit: 'salary'}
                // ,{field:'logins', title:'登入次数', width:100, sort: true}
                ,{field:'sellerRegDate', title:'注册时间', width:120}
                ,{field:'sellerState', title:'启/禁', width:100, templet: '#switchTpl', unresize: true}
                ,{field: 'right', title:'操作', toolbar: '#barDemo',}
            ]]
            ,page: true


        });
        //监听禁启用
        form.on('switch(sexDemo)', function(obj){
            layer.tips(this.value + ' ' + this.name + '：'+ obj.elem.checked, obj.othis);
        });
        //

        //头工具栏事件
        table.on('toolbar(test)', function(obj){
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

        //监听行工具事件
        table.on('tool(test)', function(obj){
            var data = obj.data;
            //console.log(obj)
            if(obj.event === 'del'){
                layer.confirm('真的删除行么', function(index){
                    obj.del();
                    layer.close(index);
                });
            } else if(obj.event === 'edit'){
                layer.prompt({
                    formType: 2
                    ,value: data.email
                }, function(value, index){
                    obj.update({
                        email: value
                    });
                    layer.close(index);
                });
            }
        });
    });
</script>
</body>
</html>
