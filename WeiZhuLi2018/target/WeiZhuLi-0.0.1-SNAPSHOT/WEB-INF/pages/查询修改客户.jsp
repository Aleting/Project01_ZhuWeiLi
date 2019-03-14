<%--
    分页页面
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>分页</title>
    <%
        pageContext.setAttribute("PATH", request.getContextPath());
    %>
    <script type="text/javascript"
            src="${PATH}/static/js/jquery.min.js"></script>
    <link
            href="${PATH }/static/css/bootstrap.min.css"
            rel="stylesheet">
    <script
            src="${PATH }/static/js/bootstrap.min.js"></script>
</head>
<body>
<!-- 分页主页面 -->
<div class="container">
    <!-- 按钮 -->
    <div class="row">
        <div class="col-md-4">
            <button class="btn btn-primary">查询</button>
            <button class="btn btn-primary">添加</button>
        </div>
        <div class="col-md-8"></div>
    </div>
    <!-- 显示表格数据 -->
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover">
                <tr>
                    <th>#顾客id</th>
                    <th>顾客登录姓名</th>
                    <th>顾客真实姓名</th>
                    <th>顾客邮箱</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${pageInfo.list }" var="customer">
                    <tr>
                        <th>${customer.customerId}</th>
                        <th>${customer.customerLoginName}</th>
                        <th>${customer.customerRealName}</th>
                        <th>${customer.customerEmail}</th>
                        <th>
                            <button class="btn btn-primary btn-sm">
                                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                编辑
                            </button>
                            <button class="btn btn-danger btn-sm">
                                <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                                删除
                            </button>
                        </th>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>

    <div class="row">
        <div class="col-md-6">当前 ${pageInfo.pageNum}页,总${pageInfo.pages }
            页,总 ${pageInfo.total } 条记录</div>
        <div class="col-md-6">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <li><a href="${PATH }/customers?pn=1">首页</a></li>
                    <c:if test="${pageInfo.hasPreviousPage }">
                        <li><a href="${PATH }/customers?pn=${pageInfo.pageNum-1}"
                               aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
                        </a></li>
                    </c:if>
                    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
                        <c:if test="${page_Num == pageInfo.pageNum }">
                            <li class="active"><a href="#">${page_Num }</a></li>
                        </c:if>
                        <c:if test="${page_Num != pageInfo.pageNum }">
                            <li><a href="${PATH }/customers?pn=${page_Num }">${page_Num }</a></li>
                        </c:if>
                    </c:forEach>
                    <c:if test="${pageInfo.hasNextPage }">
                        <li><a href="${PATH }/customers?pn=${pageInfo.pageNum+1 }"
                               aria-label="Next"> <span aria-hidden="true">&raquo;</span>
                        </a></li>
                    </c:if>
                    <li><a href="${PATH }/customers?pn=${pageInfo.pages}">末页</a></li>
                </ul>
            </nav>
        </div>
    </div>

</div>
</body>
</html>