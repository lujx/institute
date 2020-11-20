<%--
  Created by IntelliJ IDEA.
  User: boolo
  Date: 2018/8/12
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="/common/global.jsp" %>
    <%@include file="/common/meta.jsp" %>
    <%@include file="/common/res.jsp" %>
    <title>Jquery UI</title>
    <link href="${ctx}/static/include/jquery-ui-1.12.1/jquery-ui.css" type="text/css" rel="stylesheet">
    <link href="${ctx}/static/css/plugin/jqueryui.css" type="text/css" rel="stylesheet">

    <script src="${ctx}/static/include/jquery-ui-1.12.1/jquery-ui.js" type="text/javascript"></script>
    <script src="${ctx}/static/js/model/plugin/jqueryui.js" type="text/javascript"></script>

</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-4 border">
            <p>
                <label for="conscycle">建设周期：</label>
                <input type="text" id="conscycle" style="border:0; color:#f6931f; font-weight:bold;">
            </p>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 border">
            <div id="slider-range"></div>
        </div>
    </div>
</div>
</body>
</html>
