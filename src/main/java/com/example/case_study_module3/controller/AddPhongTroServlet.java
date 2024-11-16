package com.example.case_study_module3.controller;

import com.example.case_study_module3.model.PhongTro;
import com.example.case_study_module3.repository.PhongTroRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet("/addPhongTro")
public class AddPhongTroServlet extends HttpServlet {
    private PhongTroRepository phongTroDAO = new PhongTroRepository();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy dữ liệu từ form
        String tenNguoiThue = request.getParameter("tenNguoiThue");
        String soDienThoai = request.getParameter("soDienThoai");
        String ngayBatDau = request.getParameter("ngayBatDau");
        String hinhThucThanhToan = request.getParameter("hinhThucThanhToan");
        String ghiChu = request.getParameter("ghiChu");

        // Tạo đối tượng PhongTro và gán dữ liệu
        PhongTro phongTro = new PhongTro();
        phongTro.setTenNguoiThue(tenNguoiThue);
        phongTro.setSoDienThoai(soDienThoai);
        phongTro.setNgayBatDau(ngayBatDau);
        phongTro.setHinhThucThanhToan(hinhThucThanhToan);
        phongTro.setGhiChu(ghiChu);


        phongTroDAO.addPhongTro(phongTro);


        response.sendRedirect("phongtro");
    }
}
