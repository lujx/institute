<%--
  Created by IntelliJ IDEA.
  User: boolo
  Date: 2018/7/22
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="/common/global.jsp" %>
    <%@include file="/common/meta.jsp" %>
    <%@include file="/common/res.jsp" %>
    <title>Show Path</title>
    <script src="${ctx}/static/js/model/learn/springMvc.js"></script>
</head>
<body>
<div class="container">
    <h2><a href="${ctx}/springMvc">Spring MVC</a></h2>
    <%--面包屑--%>
    <ol class="breadcrumb">
        <li><a href="${ctx}/">Index</a></li>
        <li class="active">Spring MVC</li>
    </ol>
    <table class="springmvc-tab table table-striped table-hover">
        <thead>
        <tr>
            <th class="col-md-4">
                TYPE
            </th>
            <th class="col-md-4">
                VALUE
            </th>
            <th class="col-md-4">
                REMARK
            </th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>
                <a class="btn btn-info" href="${ctx}/springMvc/return-mav">show value</a>
            </td>
            <td>
                ${mavVal}
            </td>
            <td>
                <p>ModelandView返回方式</p>
            </td>
        </tr>
        <tr>
            <td>
                <a class="btn btn-info" href="${ctx}/springMvc/return-void-request">show value</a>
            </td>
            <td>
                ${voidVal}
            </td>
            <td>
                <p>Void的返回方式:
                    1.可以使用request跳转页面，并通过setAttribute方式返回参数<br/>
                    2.也可以通过response实现页面重定向<br/>
                </p>
            </td>
        </tr>
        <tr>
            <td>
                <a class="btn btn-info" href="${ctx}/springMvc/return-void-response">show value</a>
            </td>
            <td>
                ${voidVal}
            </td>
            <td>
                <p>Void的返回方式:
                    1.可以使用request跳转页面，并通过setAttribute方式返回参数<br/>
                    2.也可以通过response实现页面重定向<br/>
                </p>
            </td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
