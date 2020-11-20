<%--
  Created by IntelliJ IDEA.
  User: bright
  Date: 2017/11/28
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@ include file="/common/global.jsp" %>
    <%@ include file="/common/meta.jsp" %>
    <%@ include file="/common/res.jsp" %>
    <title>用户列表</title>

    <script type="text/javascript">
        function alterUser(name,passwd) {
            $.ajax({
                url:"/users/"+userId,
                type:"put",
                data:{name:name,passwd:passwd},
                datatype:json,
                success:function(){

                }
            })
        }
        
        function delUser(userId) {
            var url = "/users/" + userId;
            console.log(url);
            $.ajax({
                url: url,
                type: "delete",
                async: true,
                success: function () {
                    console.log("success");
                },
                error: function () {
                    console.log("error");
                }
            })
        }
    </script>
</head>
<body>
<div class="container">
    <button type="button" class="btn btn-danger btn-sm" data-toggle="modal" data-target="#addUser">Add a new user
    </button>
    <table class="table table-hover col-sm-8">
        <thead>
        <tr>
            <th class="col-sm-1">
                <span>#</span>
            </th>
            <th class="col-sm-2">
                <span>名字</span>
            </th>
            <th class="col-sm-3">
                <span>密码</span>
            </th>
            <th class="col-sm-2">
                <span>操作</span>
            </th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${users}" var="user">
        <tr>
            <td>
                <span>${user.id}</span>
            </td>
            <td>
                <span>${user.name}</span>
            </td>
            <td>
                <span>${user.passwd}</span>
            </td>
            <td>
                <button class="btn btn-primary" onclick="alterUser(${user.id})">修改</button>
                <button class="btn btn-danger" onclick="delUser(${user.id})">删除</button>
            </td>
            </c:forEach>
        </tbody>
    </table>
</div>

<div id="addUser" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="addUserLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <form class="form-horizontal" action="${ctx}/users" method="post">
                <div class="modal-body">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                            aria-hidden="true">&times;</span></button>
                    <div class="form-group">
                        <label class="col-sm-2" for="name">名字</label>
                        <input id="name" class="form-control col-sm-10" type="text" name="name"
                               placeholder="名字"/>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2" for="passwd">密码</label>
                        <input id="passwd" class="form-control col-sm-10" type="password" name="passwd"
                               placeholder="密码"/>
                    </div>
                </div>
                <div class="modal-footer">
                    <div class="form-group">
                        <div class="col-sm-10">
                            <button type="submit" class="btn btn-primary">submit</button>
                            <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
