<%--
  Created by IntelliJ IDEA.
  User: yukai
  Date: 2022/3/23
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
</head>
<body>
<h1>书籍展示</h1>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <input type="hidden" name="bookID" value="${books.bookID}">
        <div class="form-group">
            <label for="bkname">书籍名称</label>
            <input type="text" class="form-control" id="bkname" name="bookName" required value="${books.bookName}">
        </div>

        <div class="form-group">
            <label for="bkcount">书籍数量</label>
            <input type="text" class="form-control" id="bkcount" name="bookCounts" required value="${books.bookCounts}">
        </div>

        <div class="form-group">
            <label for="bkdetail">书籍描述</label>
            <input type="text" class="form-control" id="bkdetail" name="detail" required value="${books.detail}">
        </div>

        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>
    </form>

</div>
</body>
</html>
