<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/13/2024
  Time: 9:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <title>Quản lý thuê phòng trọ</title>
</head>
<body>
<div class="container">
    <h2>Danh sách thuê phòng trọ</h2>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Mã phòng</th>
            <th>Tên người thuê</th>
            <th>Số điện thoại</th>
            <th>Ngày thuê</th>
            <th>Hình thức thanh toán</th>
            <th>Ghi chú</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="phongTro" items="${phongTroList}">
            <tr>
                <td>${phongTro.id}</td>
                <td>${phongTro.ten}</td>
                <td>${phongTro.sdt}</td>
                <td>${phongTro.ngayThue}</td>
                <td>${phongTro.hinhThuc}</td>
                <td>${phongTro.ghiChu}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="/addPhongTro.jsp" class="btn btn-primary">Thêm mới</a>
</div>
</body>
</html>