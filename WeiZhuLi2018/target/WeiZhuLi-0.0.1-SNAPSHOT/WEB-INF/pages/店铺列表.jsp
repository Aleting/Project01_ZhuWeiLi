<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/10/24
  Time: 9:21
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
    <script src="<%=basePath%>/static/layui/layui/layui.all.js"></script>
</head>
<body>
<section class="layui-larry-box">
    <div class="larry-personal">
        <div class="layui-tab">
            <blockquote class="layui-elem-quote news_search">

                <div class="layui-inline">
                    <div class="layui-input-inline">
                        <input value="" placeholder="请输入店铺ID" class="layui-input search_input" type="text">
                    </div>
                    <a class="layui-btn search_btn">查询店铺</a>
                </div><div class="layui-inline">
                <a class="layui-btn layui-btn-normal">添加店铺</a>
            </div>

                <div class="layui-inline">
                    <div class="layui-form-mid layui-word-aux">本页面刷新后除新添加的文章外所有操作无效，关闭页面所有数据重置</div>
                </div>
            </blockquote>

            <!-- 操作日志 -->
            <div class="layui-form news_list">
                <table class="layui-table">
                    <colgroup>
                        <col width="9%">
                        <col width="20%">
                        <col width="15%">
                        <col width="9%">
                        <col width="9%">
                        <col width="9%">
                        <col width="30%">
                        <col width="20%">
                    </colgroup>
                    <thead>
                    <tr>
                        <th>店铺ID</th>
                        <th style="text-align:left;">店铺名称</th>
                        <th>店主</th>
                        <th>审核状态</th>

                        <th>是否营业</th>
                        <th>注册时间</th>
                        <th>店铺操作操作</th>
                    </tr>
                    </thead>
                    <tbody class="news_content">
                    <tr>
                        <td>001</td>
                        <td align="left">css3用transition实现边框动画效果</td>
                        <td>请叫我马哥</td>
                        <td>审核通过</td>

                        <td><input name="show" lay-skin="switch" lay-text="是|否" lay-filter="isShow" type="checkbox">
                            <div class="layui-unselect layui-form-switch" lay-skin="_switch"><em>否</em><i></i></div>
                        </td>
                        <td>2017-04-14</td>
                        <td>
                            <a class="layui-btn layui-btn-mini news_edit"><i class="iconfont icon-edit"></i> 编辑</a>
                            <a class="layui-btn layui-btn-normal layui-btn-mini news_collect"><i class="layui-icon"></i> 商品列表</a>
                            <a class="layui-btn layui-btn-danger layui-btn-mini news_del" data-id="1"><i class="layui-icon"></i> 删除</a>
                        </td>
                    </tr>
                    <tr>
                        <td>002</td>
                        <td align="left">自定义的模块名称可以包含/吗</td>
                        <td>请叫我马哥</td>
                        <td style="color:#f00">待审核</td>

                        <td><input name="show" lay-skin="switch" lay-text="是|否" lay-filter="isShow" checked="" type="checkbox">
                            <div class="layui-unselect layui-form-switch layui-form-onswitch" lay-skin="_switch"><em>是</em><i></i></div>
                        </td>
                        <td>2017-04-14</td>
                        <td>
                            <a class="layui-btn layui-btn-mini news_edit"><i class="iconfont icon-edit"></i> 编辑</a>
                            <a class="layui-btn layui-btn-normal layui-btn-mini news_collect"><i class="layui-icon"></i> 商品列表</a>
                            <a class="layui-btn layui-btn-danger layui-btn-mini news_del" data-id="2"><i class="layui-icon"></i> 删除</a>
                        </td>
                    </tr>

                    </tbody>
                </table>
                <div class="larry-table-page clearfix">
                    <a href="javascript:;" class="layui-btn layui-btn-small"><i class="iconfont icon-shanchu1"></i>删除</a>
                    <div id="page" class="page"></div>
                </div>
            </div>
            <!-- 登录日志 -->
            <div class="layui-tab-item layui-field-box">
                <table class="layui-table table-hover" lay-even="" lay-skin="nob">
                    <thead>
                    <tr>
                        <th><input type="checkbox" id="selected-all"></th>
                        <th>ID</th>
                        <th>管理员账号</th>
                        <th>状态</th>
                        <th>最后登录时间</th>
                        <th>上次登录IP</th>
                        <th>登录IP</th>
                        <th>IP所在位置</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>110</td>
                        <td>admin</td>
                        <td>后台登录成功</td>
                        <td>2016-12-19 14:26:03</td>
                        <td>127.0.0.1</td>
                        <td>127.0.0.1</td>
                        <td>Unknown</td>
                    </tr>
                    </tbody>
                </table>
                <div class="larry-table-page clearfix">
                    <a href="javascript:;" class="layui-btn layui-btn-small"><i class="iconfont icon-shanchu1"></i>删除</a>
                    <div id="page2" class="page"></div>
                </div>
            </div>
        </div>
    </div>

</section>
<script type="text/javascript" src="common/layui/layui.js"></script>
<script type="text/javascript" src="js/newslist.js"></script>
<script type="text/javascript">
    layui.use(['jquery','layer','element','laypage'],function(){
        window.jQuery = window.$ = layui.jquery;
        window.layer = layui.layer;
        var element = layui.element(),
            laypage = layui.laypage;


        laypage({
            cont: 'page',
            pages: 10 //总页数
            ,
            groups: 5 //连续显示分页数
            ,
            jump: function(obj, first) {
                //得到了当前页，用于向服务端请求对应数据
                var curr = obj.curr;
                if(!first) {
                    //layer.msg('第 '+ obj.curr +' 页');
                }
            }
        });

        laypage({
            cont: 'page2',
            pages: 10 //总页数
            ,
            groups: 5 //连续显示分页数
            ,
            jump: function(obj, first) {
                //得到了当前页，用于向服务端请求对应数据
                var curr = obj.curr;
                if(!first) {
                    //layer.msg('第 '+ obj.curr +' 页');
                }
            }
        });
    });
</script>
</body>
</html>
