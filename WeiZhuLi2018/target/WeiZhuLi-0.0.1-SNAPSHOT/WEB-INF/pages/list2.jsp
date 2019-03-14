<%--
  Created by IntelliJ IDEA.
  User: Lanxiaoquan
  Date: 2018/10/15
  Time: 19:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    session.setAttribute("PATH",request.getContextPath());
%>
<html>
<head>
    <title>顾客列表</title>
    <link href="${PATH}/static/css/bootstrap.min.css" rel="stylesheet">
    <script src="${PATH}/static/js/jquery.min.js"></script>
    <script src="${PATH}/static/js/bootstrap.min.js"></script>

</head>
<body>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <h1>分页</h1>
                </div>
            </div>
            <div class="row">
                <div class="col-md-offset-8 col-md-4">
                    <button>添加</button>
                    <button>删除</button>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <table class="table">
                        <tr>
                            <th>ID</th>
                            <th>登录名称</th>
                            <th>真实姓名</th>
                            <th>操作</th>
                        </tr>
                        <c:forEach items="${pageInfo.list}" var="customers">
                            <tr>
                                <th>${customers.sellerId}</th>
                                <th>${customers.customerRealName}</th>
                                <th>${customers.customerLoginName}</th>
                                <th>
                                    <button>编辑</button>
                                    <button>删除</button>
                                </th>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    当前第${pageInfo.pageNum}页  总共${pageInfo.pages}页
                </div>
                <div class="col-md-6">
                    <nav aria-label="Page navigation">
                        <ul class="pagination">
                            <li><a href="#">首页</a></li>
                            <li>
                                <a href="#" aria-label="Previous">
                                    <span aria-hidden="true">&laquo;</span>
                                </a>
                            </li>
                            <c:forEach items="${pageInfo.navigatepageNums}" var="page_Num">
                                <c:if test="${page_Num == pageInfo.pageNum}">
                                    <li class="active"><a href="#">${page_Num}</a></li>
                                </c:if>
                                <c:if test="${page_Num != pageInfo.pageNum}">
                                    <li><a href="${PATH}/customers?pn=${page_Num}">${page_Num}</a></li>
                                </c:if>
                            </c:forEach>
                            <li>
                                <a href="#" aria-label="Next">
                                    <span aria-hidden="true">&raquo;</span>
                                </a>
                            </li>
                            <li><a href="#">末页</a></li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>
</body>
</html>
