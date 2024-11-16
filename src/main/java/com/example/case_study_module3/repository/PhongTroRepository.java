package com.example.case_study_module3.repository;

import com.example.case_study_module3.model.PhongTro;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PhongTroRepository {
    public List<PhongTro> getAllPhongTro() {
        List<PhongTro> list = new ArrayList<>();
        String query = "SELECT p.MaPhong, p.TenNguoiThue, p.SoDienThoai, p.NgayBatDau, ht.TenHinhThuc, p.GhiChu " +
                "FROM PhongTro p " +
                "LEFT JOIN HinhThucThanhToan ht ON p.MaHinhThucThanhToan = ht.MaHinhThuc";
        BaseRepository baseRepository = new BaseRepository();
        try (Connection conn =baseRepository.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                PhongTro phongTro = new PhongTro();
                phongTro.setMaPhong(rs.getInt("MaPhong"));
                phongTro.setTenNguoiThue(rs.getString("TenNguoiThue"));
                phongTro.setSoDienThoai(rs.getString("SoDienThoai"));
                phongTro.setNgayBatDau(rs.getString("NgayBatDau"));
                phongTro.setHinhThucThanhToan(rs.getString("TenHinhThuc"));
                phongTro.setGhiChu(rs.getString("GhiChu"));
                list.add(phongTro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void addPhongTro(PhongTro phongTro) {
        String query = "INSERT INTO PhongTro (TenNguoiThue, SoDienThoai, NgayBatDau, MaHinhThucThanhToan, GhiChu) " +
                "VALUES (?, ?, ?, ?, ?)";
        DatabaseMetaData DatabaseConnection = null;
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, phongTro.getTenNguoiThue());
            stmt.setString(2, phongTro.getSoDienThoai());
            stmt.setString(3, phongTro.getNgayBatDau());
            stmt.setInt(4, Integer.parseInt(phongTro.getHinhThucThanhToan())); // Chuyển từ ID
            stmt.setString(5, phongTro.getGhiChu());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
