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
    private PhongTroRepository phongTroRepository = new PhongTroRepository();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ten = request.getParameter("ten");
        String sdt = request.getParameter("sdt");
        Date ngayThue = Date.valueOf(request.getParameter("ngayThue"));
        int idHinhThuc = Integer.parseInt(request.getParameter("idHinhThuc"));
        String ghiChu = request.getParameter("ghiChu");

        PhongTro phongTro = new PhongTro();
        phongTro.setTen(ten);
        phongTro.setSdt(sdt);
        phongTro.setNgayThue(ngayThue);
        phongTro.setHinhThuc(String.valueOf(idHinhThuc));
        phongTro.setGhiChu(ghiChu);

        phongTroRepository.addPhongTro(phongTro);
        response.sendRedirect("phongtro");
    }
}
