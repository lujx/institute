<%--
  Created by IntelliJ IDEA.
  User: boolo
  Date: 2018/7/22
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="/common/global.jsp" %>
    <%@include file="/common/meta.jsp" %>
    <%@include file="/common/res.jsp" %>
    <title>Show Path</title>
    <script src="${ctx}/static/js/model/learn/show_path.js"></script>
</head>
<body>
<div class="container">
    <h2>Show Path</h2>
    <div class="">

    </div>
    <ol class="breadcrumb">
        <li><a href="${ctx}/">Index</a></li>
        <li class="active">Path</li>
    </ol>
    <table class="table table-striped table-hover">
        <thead>
        <tr>
            <th>
                TYPE
            </th>
            <th>
                VALUE
            </th>
            <th>
                REMARK
            </th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>
                Current Path
            </td>
            <td>
                ${path.currentPath}
            </td>
            <td>
                <p>程序当前路径</p>
            </td>
        </tr>
        <tr>
            <td>
                Canonical Path
            </td>
            <td>
                ${path.canonicalPath}
            </td>
            <td>
                权威路径
            </td>
        </tr>
        <tr>
            <td>
                Absolute Path
            </td>
            <td>
                ${path.absolutePath}
            </td>
            <td>
                绝对路径
            </td>
        </tr>
        <tr>
            <td>
                File Path
            </td>
            <td>
                ${path.path}
            </td>
            <td>
                得到的是你在new File()时设定的路径
            </td>
        </tr>
        </tbody>
    </table>

</div>

</body>
</html>
