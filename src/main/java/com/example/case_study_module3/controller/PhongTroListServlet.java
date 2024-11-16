package com.example.case_study_module3.controller;

import com.example.case_study_module3.model.PhongTro;
import com.example.case_study_module3.repository.PhongTroRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


    @WebServlet("")
    public class PhongTroListServlet extends HttpServlet {
        private PhongTroRepository phongTroRepository = new PhongTroRepository();

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            List<PhongTro> phongTroList = phongTroRepository.getAllPhongTro();
            request.setAttribute("phongTroList", phongTroList);
            request.getRequestDispatcher("phongtro.jsp").forward(request, response);
        }
    }

