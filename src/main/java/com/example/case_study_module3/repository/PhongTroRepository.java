package com.example.case_study_module3.repository;

import com.example.case_study_module3.model.PhongTro;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PhongTroRepository {
    public List<PhongTro> getAllPhongTro() {
        List<PhongTro> phongTroList = new ArrayList<>();
        String sql = "SELECT * FROM phong_tro INNER JOIN hinh_thuc ON phong_tro.id_hinhThuc = hinh_thuc.id_hinhThuc";

        DatabaseMetaData DatabaseConnection = null;
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                PhongTro phongTro = new PhongTro(
                        rs.getInt("id_phong"),
                        rs.getString("ten"),
                        rs.getString("sdt"),
                        rs.getDate("ngayThue"),
                        rs.getString("tenHinhThuc"),
                        rs.getString("ghiChu")
                );
                phongTroList.add(phongTro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return phongTroList;
    }

    public void addPhongTro(PhongTro phongTro) {
        String sql = "INSERT INTO phong_tro (ten, sdt, ngayThue, id_hinhThuc, ghiChu) VALUES (?, ?, ?, ?, ?)";
        DatabaseMetaData DatabaseConnection = null;
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, phongTro.getTen());
            stmt.setString(2, phongTro.getSdt());
            stmt.setDate(3, phongTro.getNgayThue());
            stmt.setInt(4, phongTro.getId());
            stmt.setString(5, phongTro.getGhiChu());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Phương thức xóa và tìm kiếm có thể được thêm vào đây
}

