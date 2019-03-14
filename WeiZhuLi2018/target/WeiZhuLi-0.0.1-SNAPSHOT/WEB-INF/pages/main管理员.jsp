<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/10/24
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()   + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/common/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/common/bootstrap/css/bootstrap.css" media="all">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/common/global.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/main.css" media="all">

    <link rel="shortcut icon" href="<%=basePath%>/static/image/favicon.ico" type="image/x-icon" />
</head>
<body>
<section class="larry-wrapper">
    <!-- overview -->
    <div class="row state-overview" >
        <div class="col-lg-3 col-sm-6 layui-anim layui-anim-up" >
            <section class="panel">
                <div class="symbol userblue layui-anim layui-anim-rotate" style="height:80px;"> <i style="font-size: 30px;" class="iconpx-users"></i>
                </div>
                <div class="value">
                    <a href="#" class="layui-btn site-demo-active" data-type="tabAdd1"  onclick="loginas('/home/admin_shop')">
                        <h1 id="count1">${store_num}</h1>
                    </a>
                    <a href="javascript:;" data-url="http://www.baidu.com" >
                        <p>查看店铺/新开店铺</p>
                    </a>
                </div>
            </section>
        </div>
        <div class="col-lg-3 col-sm-6 layui-anim layui-anim-up" >
            <section class="panel">
                <div class="symbol commred layui-anim layui-anim-rotate" style="height:80px;"> <i  style="font-size: 30px;" class="iconpx-user-add"></i>
                </div>
                <div class="value" style="">
                    <a href="#" class="layui-btn site-demo-active" data-type="tabAdd2" >
                        <h1 id="count2">1</h1>
                    </a>
                    <p>续费审核</p>
                </div>
            </section>
        </div>
        <div class="col-lg-3 col-sm-6 layui-anim layui-anim-up">
            <section class="panel">
                <div class="symbol articlegreen layui-anim layui-anim-rotate" style="height:80px;">
                    <i class="iconpx-file-word-o" style="font-size: 30px;"></i>
                </div>
                <div class="value">
                    <a href="#" class="layui-btn site-demo-active" data-type="tabAdd3">
                        <h1 id="count3">${access_num}</h1>
                    </a>
                    <p>平台流量</p>
                </div>
            </section>
        </div>
        <div class="col-lg-3 col-sm-6 layui-anim layui-anim-up">
            <section class="panel">
                <div class="symbol rsswet layui-anim layui-anim-rotate" style="height:80px;">
                    <i class="iconpx-check-circle" style="font-size: 30px;"></i>
                </div>
                <div class="value">
                    <a href="#" class="layui-btn site-demo-active" data-type="tabAdd4" >
                        <h1 id="count4">0</h1>
                    </a>
                    <p>平台财务</p>
                </div>
            </section>
        </div>
    </div>





    <div class="layui-tab" lay-filter="demo" lay-allowclose="true">
        <ul class="layui-tab-title">
            <li class="layui-this" lay-id="11">系统公告</li>

        </ul>
        <div class="layui-tab-content">
            <div class="layui-tab-item layui-show"><section class="panel">
                <header class="panel-heading bm0">
                    <span class='span-title'>系统公告</span>
                    <span class="tools pull-right"><a href="javascript:;" class="iconpx-chevron-down"></a></span>
                </header>
                <div class="panel-body">
                    <table class="table table-hover personal-task shortcut">
                        <tr>
                            <td>
                                <div class="c1">1</div>
                                <div class="c2">2</div>

                                <br>
                            </td>
                        </tr>
                    </table>
                </div>
            </section></div>

        </div>
    </div>
</section>






        <script type="text/javascript" src="<%=basePath%>/static/common/layui/layui.js"></script>
        <script type="text/javascript" src="<%=basePath%>/static/layui/layui/layui.all.js"></script>

        <script type="text/javascript">
            layui.use('element', function(){
                var $ = layui.jquery
                    ,element = layui.element; //Tab的切换功能，切换事件监听等，需要依赖element模块


                //触发事件
                var active = {
                    tabAdd1: function(){
                        //var content=$(this).attr('lay-href');
//		var exist=$("li[lay-id='"+content+"']").length; //判断是否存在tab
                        //新增一个Tab项
                        // alert(exist)
                        var li = $("li[lay-id="+1+"]").length;
                        if(li==0){
                            element.tabAdd('demo', {
                                title: '查看店铺/新开店铺'//用于演示
                                ,content: '<iframe style="height:500px;width:100%"  src="<%=basePath%>/home/admin_shop"></iframe>'
                                ,id:"1" //实际使用一般是规定好的id，这里以时间戳模拟下
                            })


                            element.tabChange('demo', '1');
                        }
                    }
                    //第二个
                    ,tabAdd2: function(){
                        var li = $("li[lay-id="+2+"]").length;
                        //新增一个Tab项
                        if(li==0){
                            element.tabAdd('demo', {
                                title: '续费审核'//用于演示
                                ,content: '<iframe style="height:500px;width:100%"  src="<%=basePath%>/home/admin_renewal"></iframe>'
                                ,id: "2" //实际使用一般是规定好的id，这里以时间戳模拟下
                            })
                            element.tabChange('demo', '2');
                        }
                    }
                    //第三个
                    ,tabAdd3: function(){
                        var li = $("li[lay-id="+3+"]").length;

                        //新增一个Tab项
                        if(li==0){
                            element.tabAdd('demo', {
                                title: '平台流量' //用于演示
                                ,content: '<iframe style="height:500px;width:100%"  src="<%=basePath%>/home/platform"></iframe>'
                                ,id: "3" //实际使用一般是规定好的id，这里以时间戳模拟下
                            })
                            element.tabChange('demo', '3');
                        }
                    }
                    //第四个
                    ,tabAdd4: function(){
                        var li = $("li[lay-id="+4+"]").length;

                        //新增一个Tab项
                        if(li==0){
                            element.tabAdd('demo', {
                                title: '平台财务' //用于演示
                                ,content: '内容'+ (Math.random()*1000|0)
                                ,id:"4"//实际使用一般是规定好的id，这里以时间戳模拟下
                            })
                            element.tabChange('demo', '4');
                        }
                    }
                    //最后
//    ,tabDelete: function(othis){
//      //删除指定Tab项
//      element.tabDelete('demo', '44'); //删除：“商品管理”
//
//
//      othis.addClass('layui-btn-disabled');
//    }
                    ,tabChange: function(){
                        //切换到指定Tab项
                        element.tabChange('demo', '1'); //切换到：用户管理
                    }


                };

                $('.site-demo-active').on('click', function(){
                    var othis = $(this), type = othis.data('type');
                    active[type] ? active[type].call(this, othis) : '';
                });

                //Hash地址的定位
                var layid = location.hash.replace(/^#test=/, '');
                element.tabChange('test', layid);

                element.on('tab(test)', function(elem){
                    location.hash = 'test='+ $(this).attr('lay-id');
                });

            });
        </script>

</body>
</html>
