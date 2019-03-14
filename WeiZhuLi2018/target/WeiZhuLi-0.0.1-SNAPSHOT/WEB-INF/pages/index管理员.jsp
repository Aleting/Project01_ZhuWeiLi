<!DOCTYPE html>
<html lang="en">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()   + path + "/";
%>

<head>
    <meta charset="UTF-8">
    <meta name="author" content="order by dede58.com"/>
    <meta name="author" content="order by dede58.com"/>
    <title>助微力微商管理系统</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <!-- load css -->
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/layui/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/common/layui/css/layui.css" media="all">

    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/common/global.css" media="all">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/adminstyle.css" media="all">
    <script type="text/javascript" src="<%=basePath%>/static/js/jquery.min.js"></script>
    <link rel="shortcut icon" href="<%=basePath%>/static/image/favicon.ico" type="image/x-icon" />
    <%
        session.setAttribute("seller",request.getAttribute("seller"));
    %>
    <script type="text/javascript">
        function loginas(src,a) {

             $('em').text(a);
            $("#iframeflage",parent.document.body).attr("src","<%=basePath%>"+src)
        }

        /**
         * 这里是平台流量 这里后台已经返回的数量 需要前台接收
         */
        window.onload = function() {
                var name = '${seller.sellerLoginName}';
                var access_time = new Date();
                $.ajax({
                    type: 'POST',
                    url: "<%=basePath%>/access/cord",
                    data: {"name":name, "access_time":access_time},
                    dataType: "json",
                    success: function(result){
                    }

                });
        }
        $().ready(function () {
            var s = '${seller.sellerState}';
            if(s!=1){
                alert("邮箱未激活，请前往邮箱激活");
                window.location.href="/home/start";
            }
        })
    </script>
</head>
<body>
<div class="layui-layout layui-layout-admin" id="layui_layout">
    <!-- 顶部区域 -->
    <div class="layui-header header header-demo">
        <div class="layui-main">
            <!-- logo区域 -->
            <div class="admin-logo-box">

                <a class="logo" href="" title="logo"> <img src="<%=basePath%>/static/images/开始页面.jpg" style="width: 40px;height: 40px;"/>&nbsp;&nbsp;&nbsp;&nbsp;助微力</a>
                <div class="larry-side-menu">
                    <i class="fa fa-bars" aria-hidden="true"></i>
                </div>
            </div>
            <!-- 顶级菜单区域 -->
            <div class="layui-larry-menu">
                <ul class="layui-nav clearfix">
                    <%--<li class="layui-nav-item layui-this">--%>
                        <%--<a href="#"><i class="iconfont icon-wangzhanguanli"></i>内容管理</a>--%>
                    <%--</li>--%>
                    <!--  <li class="layui-nav-item">
                             <a href="javascirpt:;"><i class="iconfont icon-weixin3"></i>微信公众</a>
                      </li>
                      <li class="layui-nav-item">
                             <a href="javascirpt:;"><i class="iconfont icon-ht_expand"></i>扩展模块</a>
                      </li>-->
                    <li  class="layui-nav-item">
                        <a href="#"><i class="iconfont icon-ht_expand"></i>有效日期截止到：<font class="layui-bg-gray">2018-02-15</font></a>

                    </li>-->
                </ul>
            </div>
            <!-- 右侧导航 -->
            <ul class="layui-nav larry-header-item">

                <li class="layui-nav-item">

                    <img style="width:40px;height:40px;border-radius:50%" src="<%=basePath%>${seller.sellerImg}" >

                </li>


                <li class="layui-nav-item first">

                    <a href="javascript:;">
                        <cite>账户名:</cite>
                        <cite>${seller.sellerLoginName}</cite>
                        <span class="layui-nav-more"></span>
                    </a>
                    <dl class="layui-nav-child">
                        <dd>
                            <a href="javascript:;" onclick="loginas('/home/person_info?sellerId=${seller.sellerId}','个人信息修改')">个人信息修改</a>

                        </dd>
                        <dd>
                            <%--<a href="<%=basePath%>/user/update_password?sellerId=${seller.sellerId}&sellerLoginName=${seller.sellerLoginName}">修改密码</a>--%>
                            <a href="javascript:;" onclick="loginas('/user/update_password?sellerId=${seller.sellerId}&sellerLoginName=${seller.sellerLoginName}','修改密码')">修改密码</a>

                        </dd>

                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="">控制台<span class="layui-badge">9</span></a>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;" id="lock">
                        <i class="iconfont icon-diannao1"></i>
                        锁屏</a>
                </li>
                <li class="layui-nav-item">
                    <a href="<%=basePath%>logout">
                        <i class="iconfont icon-exit"></i>
                        退出</a>
                </li>
            </ul>
        </div>
    </div>
    <!-- 左侧侧边导航开始 -->
    <c:if test="${seller.roleId==1}">
        <div class="layui-side layui-side-bg layui-larry-side" id="larry-side">
            <div class="layui-side-scroll" id="larry-nav-side" lay-filter="side">
                <ul class="layui-nav layui-nav-tree">
                    <li class="layui-nav-item layui-this">
                        <a href="#" data-url="">
                            <i class="iconfont icon-home1" data-icon='icon-home1'></i>
                            <span>后台首页</span>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
    </c:if>
    <c:if test="${seller.roleId!=1}">
        <div class="layui-side layui-side-bg layui-larry-side" id="larry-side">
            <div class="layui-side-scroll" id="larry-nav-side2" lay-filter="side">

                <!-- 左侧菜单 -->
                <ul class="layui-nav layui-nav-tree">

                    <!-- 个人信息 -->
                    <li class="layui-nav-item">
                        <a href="javascript:;" >
                            <i class="iconfont icon-jiaoseguanli" ></i>
                            <span>店铺管理</span>
                            <em class="layui-nav-more"></em>

                        </a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="javascript:;" data-url="http://www.baidu.com" onclick="loginas('/home/management?storeId=${seller.storeId}','店铺基本信息修改')">
                                    <i class="iconfont icon-geren1" data-icon='icon-geren1'></i>
                                    <span>基本信息修改</span>
                                </a>
                            </dd>
                            <dd>
                                <a href="javascript:;" data-url="changepwd.html" onclick="loginas('/home/renew?storeId=${seller.storeId}','续费')">
                                    <i class="iconfont icon-iconfuzhi01" data-icon='icon-iconfuzhi01'></i>
                                    <span>续费</span>
                                </a>
                            </dd>
                            <dd>
                                <a href="javascript:;" data-url="table.html" onclick="loginas('/clerk/list?storeId=${seller.storeId}&roleId=${seller.roleId}','店员管理')">
                                    <i class="iconfont icon-yonghu1" data-icon='icon-yonghu1'></i>
                                    <span>店员管理</span>
                                </a>
                            </dd>

                        </dl>
                    </li>
                        <%--订单管理--%>
                    <li class="layui-nav-item">
                        <a href="javascript:;">
                            <i class="iconfont icon-jiaoseguanli2" ></i>
                            <span>订单管理</span>
                            <em class="layui-nav-more"></em>
                        </a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="javascript:;" data-url="table.html" onclick="loginas('/home/management_order?storeId=${seller.storeId}','订单详情')">
                                    <i class="iconfont icon-yonghu1" data-icon='icon-yonghu1'></i>
                                    <span>订单详情</span>
                                </a>
                            </dd>
                            <dd>
                                <a href="javascript:;" data-url="table.html" onclick="loginas('/home/order_entry?sellerId=${seller.sellerId}','订单录入')">
                                    <i class="iconfont icon-yonghu1" data-icon='icon-yonghu1'></i>
                                    <span>订单录入</span>
                                </a>
                            </dd>
                            <dd>
                                <a href="javascript:;"  data-url="table_1.html" onclick="loginas('/home/order_audit?storeId=${seller.storeId}','订单审核')">
                                    <i class="iconfont icon-jiaoseguanli4" data-icon='icon-jiaoseguanli4'></i>
                                    <span>订单审核</span>
                                </a>
                            </dd>

                            <%--<dd>--%>
                                <%--<a href="javascript:;" data-url="table.html" onclick="loginas('/clerk/list?storeId=${seller.storeId}')">--%>
                                    <%--<i class="iconfont icon-yonghu1" data-icon='icon-yonghu1'></i>--%>
                                    <%--<span>店员管理</span>--%>
                                <%--</a>--%>
                            <%--</dd>--%>



                        </dl>
                    </li>
                    <!-- 用户管理 -->

                    <!-- 商品管理 -->
                    <li class="layui-nav-item">
                        <%--<a href="javascript:;">--%>
                            <%--<i class="iconfont icon-wenzhang1" ></i>--%>

                            <%--<span>商品管理</span>--%>
                          <%----%>
                        <%--</a>--%>
                            <a href="javascript:;" data-url="myloginfo.html" onclick="loginas('/home/shopassistant?sellerId=${seller.sellerId}','商品管理')">
                                <i class="iconfont icon-quanxian2" data-icon='icon-quanxian2'></i>
                                <span>商品管理</span>
                            </a>

                    </li>
                    <!-- 客户管理 -->

                    <li class="layui-nav-item">
                            <%--<a href="javascript:;">--%>
                            <%--<i class="iconfont icon-wenzhang1" ></i>--%>

                            <%--<span>商品管理</span>--%>
                            <%----%>
                            <%--</a>--%>
                                <a href="javascript:;" data-url="table.html" onclick="loginas('/home/addCustomer?sellerId=${seller.sellerId}','客户管理')">
                                    <i class="iconfont icon-yonghu1" data-icon='icon-yonghu1'></i>
                                    <span>客户管理</span>
                                </a>

                    </li>
                    <!-- 供应商管理 -->

                    <li class="layui-nav-item">

                                <a href="javascript:;" data-url="table.html" onclick="loginas('/home/supplier?storeId=${seller.storeId}','供应商管理','供应商管理')">
                                    <i class="iconfont icon-yonghu1" data-icon='icon-yonghu1'></i>
                                    <span>供应商管理</span>
                                </a>

                    </li>
                    <!-- 进货管理 -->

                    <li class="layui-nav-item">
                        <a href="javascript:;" data-url="myloginfo.html" onclick="loginas('/home/management_stock?storeId=${seller.storeId}','进货管理')">
                            <i class="iconfont icon-tags1" data-icon='icon-tags1'></i>
                            <span>进货管理</span>
                        </a>

                    </li>
                    <!-- 发货管理 -->

                    <li class="layui-nav-item">

                        <%--<a href="javascript:;" data-url="table.html" onclick="loginas('/home/supplier?storeId=${seller.storeId}')">--%>
                            <%--<i class="iconfont icon-yonghu1" data-icon='icon-yonghu1'></i>--%>
                            <%--<span>供应商管理</span>--%>
                        <%--</a>--%>

                    </li>
                    <%--<!-- 会员管理 -->--%>
                    <%--<li class="layui-nav-item">--%>
                        <%--<a href="javascript:;">--%>
                            <%--<i class="iconfont icon-m-members" ></i>--%>
                            <%--<span>单页面</span>--%>
                            <%--<em class="layui-nav-more"></em>--%>
                        <%--</a>--%>
                        <%--<dl class="layui-nav-child">--%>
                            <%--<dd>--%>
                                <%--<a href="javascript:;" data-url="404.html">--%>
                                    <%--<i class="iconfont icon-zhuti"  data-icon='icon-zhuti'></i>--%>
                                    <%--<span>404提示页面</span>--%>
                                <%--</a>--%>
                            <%--</dd>--%>
                            <%--<dd>--%>
                                <%--<a href="javascript:;" data-url="tab.html">--%>
                                    <%--<i class="iconfont icon-zhuti"  data-icon='icon-zhuti'></i>--%>
                                    <%--<span>选项卡页面</span>--%>
                                <%--</a>--%>
                            <%--</dd>--%>
                        <%--</dl>--%>
                    <%--</li>--%>

                    <%--<li class="layui-nav-item">--%>
                        <%--<a href="javascript:;">--%>
                            <%--<i class="iconfont icon-shengchengbaogao" ></i>--%>
                            <%--<span>网站维护</span>--%>
                            <%--<em class="layui-nav-more"></em>--%>
                        <%--</a>--%>
                        <%--<dl class="layui-nav-child">--%>
                            <%--<dd>--%>
                                <%--<a href="javascript:;">--%>
                                    <%--<i class="iconfont icon-zhuti"  data-icon='icon-zhuti'></i>--%>
                                    <%--<span>网站主题</span>--%>
                                <%--</a>--%>
                            <%--</dd>--%>
                            <%--<dd>--%>
                                <%--<a href="">--%>
                                    <%--<i class="iconfont icon-database" data-icon='icon-database'></i>--%>
                                    <%--<span>数据库管理</span>--%>
                                <%--</a>--%>
                            <%--</dd>--%>
                            <%--<dd>--%>
                                <%--<a href="">--%>
                                    <%--<i class="iconfont icon-shengchengbaogao" data-icon='icon-shengchengbaogao'></i>--%>
                                    <%--<span>生成页面</span>--%>
                                <%--</a>--%>
                            <%--</dd>--%>
                            <%--<dd>--%>
                                <%--<a href="">--%>
                                    <%--<i class="iconfont icon-qingchuhuancun" data-icon='icon-qingchuhuancun'></i>--%>
                                    <%--<span>更新缓存</span>--%>
                                <%--</a>--%>
                            <%--</dd>--%>

                        <%--</dl>--%>
                    <%--</li>--%>

                    <%--<!-- 系统设置 -->--%>
                    <%--<li class="layui-nav-item">--%>
                        <%--<a href="javascript:;">--%>
                            <%--<i class="iconfont icon-xitong" ></i>--%>
                            <%--<span>系统设置</span>--%>
                            <%--<em class="layui-nav-more"></em>--%>
                        <%--</a>--%>
                        <%--<dl class="layui-nav-child">--%>
                            <%--<dd>--%>
                                <%--<a href="javascript:;">--%>
                                    <%--<i class="iconfont icon-zhandianpeizhi" data-icon='icon-zhandianpeizhi'></i>--%>
                                    <%--<span>基本参数设置</span>--%>
                                <%--</a>--%>
                            <%--</dd>--%>
                            <%--<dd>--%>
                                <%--<a href="javascript:;">--%>
                                    <%--<i class="iconfont icon-zhandianguanli1" data-icon='icon-zhandianguanli1'></i>--%>
                                    <%--<span>多站点管理</span>--%>
                                <%--</a>--%>
                            <%--</dd>--%>
                            <%--<dd>--%>
                                <%--<a href="javascript:;">--%>
                                    <%--<i class="iconfont icon-anquanshezhi" data-icon='icon-anquanshezhi'></i>--%>
                                    <%--<span>安全设置</span>--%>
                                <%--</a>--%>
                            <%--</dd>--%>
                            <%--<dd>--%>
                                <%--<a href="javascript:;">--%>
                                    <%--<i class="iconfont icon-sms" data-icon='icon-sms'></i>--%>
                                    <%--<span>短信接口设置</span>--%>
                                <%--</a>--%>
                            <%--</dd>--%>
                            <%--<dd>--%>
                                <%--<a href="javascript:;">--%>
                                    <%--<i class="iconfont icon-iconfuzhi01" data-icon='icon-iconfuzhi01'></i>--%>
                                    <%--<span>系统日志管理</span>--%>
                                <%--</a>--%>
                            <%--</dd>--%>
                            <%--<dd>--%>
                                <%--<a href="javascript:;">--%>
                                    <%--<i class='iconfont icon-SQLServershujuku' data-icon='icon-SQLServershujuku'></i>--%>
                                    <%--<span>SQL命令行工具</span>--%>
                                <%--</a>--%>
                            <%--</dd>--%>
                            <%--<dd>--%>
                                <%--<a href="javascript:;">--%>
                                    <%--<i class='iconfont icon-xinxicaiji' data-icon='icon-xinxicaiji'></i>--%>
                                    <%--<span>防采集管理</span>--%>
                                <%--</a>--%>
                            <%--</dd>--%>
                        <%--</dl>--%>
                    <%--</li>--%>
                    <%--<!-- 友链设置 -->--%>
                    <%--<li class="layui-nav-item">--%>
                        <%--<a href="javascript:;">--%>
                            <%--<i class="iconfont icon-youqinglianjie"  data-icon='icon-youqinglianjie'></i>--%>
                            <%--<span>友情链接</span>--%>
                        <%--</a>--%>
                    <%--</li>--%>
                </ul>
            </div>
        </div>

    </c:if>

    <!-- 左侧侧边导航结束 -->
    <!-- 右侧主体内容 -->

    <div class="layui-body" id="larry-body" style="bottom: 0;border-left: solid 2px #2299ee;">
        <div class="layui-tab layui-tab-card larry-tab-box" id="larry-tab" lay-filter="demo" lay-allowclose="true">
            <div class="go-left key-press pressKey" id="titleLeft" title="滚动至最右侧"><i class="larry-icon larry-weibiaoti6-copy"></i> </div>
            <ul class="layui-tab-title">
                <li class="layui-this" id="admin-home"><i class="iconfont icon-diannao1"></i><em id="em">后台首页</em></li>
            </ul>
            <div class="go-right key-press pressKey" id="titleRight" title="滚动至最左侧"><i class="larry-icon larry-right"></i></div>

            <div class="layui-tab-content" style="min-height: 1000px; height:515px">
                <div class="layui-tab-item layui-show" style="height: 100%">
                    <iframe id="iframeflage" class="larry-iframe" data-id='0' src="${pageContext.request.contextPath}/home/shopowner"></iframe>
                </div>
            </div>
        </div>
    </div>
    <!-- 底部区域 -->
    <div class="layui-footer layui-larry-foot" id="larry-footer">
        <div class="layui-mian">
            <p class="p-admin">
                <span>2018 &copy;</span>
               助微力团队 版权所有
                <span style="margin-left:50px;">备案号:鲁ICP备18015898号</span>
            </p>
        </div>
    </div>
</div>
<!-- 加载js文件-->
<script type="text/javascript" src="<%=basePath%>/static/common/layui/layui.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/js/larry.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/js/index.js"></script>
<!-- 锁屏 -->
<div class="lock-screen" style="display: none;">
    <div id="locker" class="lock-wrapper">
        <div id="time"></div>
        <div class="lock-box center">
            <img src="images/userimg.jpg" alt="">
            <h1>admin</h1>
            <div class="form-group col-lg-12">
                <input type="password" placeholder='锁屏状态，请输入密码解锁' id="lock_password" class="form-control lock-input" autofocus name="lock_password">
                <button id="unlock" class="btn btn-lock">解锁</button>
            </div>
        </div>
    </div>
</div>

</body>

</html>