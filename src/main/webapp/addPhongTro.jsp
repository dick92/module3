<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/13/2024
  Time: 9:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <title>Thêm mới phòng trọ</title>
</head>
<body>
<div class="container">
    <h2>Thêm mới phòng trọ</h2>
    <form action="addPhongTro" method="post">
        <div class="form-group">
            <label>Tên người thuê</label>
            <input type="text" name="ten" class="form-control" required>
        </div>
        <div class="form-group">
            <label>Số điện thoại</label>
            <input type="text" name="sdt" class="form-control" required>
        </div>
        <div class="form-group">
            <label>Ngày thuê</label>
            <input type="date" name="ngayThue" class="form-control" required>
        </div>
        <div class="form-group">
            <label>Hình thức thanh toán</label>
            <select name="idHinhThuc" class="form-control">
                <option value="1">Theo tháng</option>
                <option value="2">Theo quý</option>
                <option value="3">Theo năm</option>
            </select>
        </div>
        <div class="form-group">
            <label>Ghi chú</label>
            <textarea name="ghiChu" class="form-control"></textarea>
        </div>
        <button type="submit" class="btn btn-primary">Tạo mới</button>
    </form>
</div>
</body>
</html>