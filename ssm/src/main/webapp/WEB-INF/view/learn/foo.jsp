<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <%@include file="/common/global.jsp" %>
    <%@include file="/common/meta.jsp" %>
    <%@include file="/common/res.jsp" %>
    <title>HomePage</title>
    <link href="${ctx}/static/css/main.css" type="text/css" rel="stylesheet"/>
    <!-- 插件脚本 -->
    <script src="${ctx}/static/js/model/learn/foo.js" type="text/javascript"></script>
</head>

<body>
<div class="container">
    <div class="row">
        <div class="col-md-4 border">
            <h3></h3>
        </div>
        <div class="col-md-4 border">
            <h3>form表单提交</h3>
        </div>
        <div class="col-md-4 border">
            <h3></h3>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 border">
            <a id="override-no-arg" class="btn btn-primary" href="#">无参数</a>
            <a id="override-one-arg" class="btn btn-primary" href="#">一个参数</a>
        </div>
        <div class="col-md-4 border">
            <button class="btn btn-success" type="button" data-toggle="modal" data-target="#modal-form">表单提交1</button>

        </div>
    </div>
    <%--务必为 .modal 添加 role="dialog" 和 aria-labelledby="..." 属性，用于指向模态框的标题栏；--%>
    <%--为 .modal-dialog 添加 aria-hidden="true" 属性。--%>
    <%--另外，你还应该通过 aria-describedby 属性为模态框 .modal 添加描述性信息。--%>
    <div id="modal-form" class="modal fade" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h3>表单提交</h3>
                </div>
                <div class="modal-body">
                    <form id="foo-form" method="post">
                        <input title="input" type="text" name="normal-inp" value="textbbb">
                        <input title="input" type="hidden" name="hide-inp" value="textaaa">
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button title="submit" id="sub" class="btn btn-primary" type="button">提交</button>
                </div>
            </div>
        </div>
    </div>
</div>
</body>

</html>