<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="/common/global.jsp" %>
    <%@include file="/common/meta.jsp" %>
    <%@include file="/common/res.jsp" %>
    <title>首页</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12 border">
            <h2>Index Page</h2>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6 border">
            <h4>Learn</h4>
        </div>
        <div class="col-md-6 border">
            <a class="btn btn-primary" href="paths">路径</a>
            <a class="btn btn-danger" href="users">用户</a>
            <a class="btn btn-info" href="springMvc">Spring MVC</a>
            <a class="btn btn-warning" href="foo">foo</a>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6 border">
            <h4>Plugins</h4>
        </div>
        <div class="col-md-6 border">
            <a class="btn btn-primary" href="plugin/jqueryui">JQUERY UI</a>
        </div>
    </div>
</div>
</body>
</html>
