package com.example.case_study_module3.service;

import com.example.case_study_module3.model.PhongTro;
import com.example.case_study_module3.repository.PhongTroRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/phongtro")
public class PhongTroServlet extends HttpServlet {
    private PhongTroRepository phongTroRepository = new PhongTroRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<PhongTro> list = phongTroRepository.getAllPhongTro();
        request.setAttribute("phongTroList", list);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}