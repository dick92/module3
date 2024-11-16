package com.example.case_study_module3.model;
public class HinhThucThanhToan {
    private int maHinhThuc;
    private String tenHinhThuc;

    public HinhThucThanhToan(int maHinhThuc) {
        this.maHinhThuc = maHinhThuc;
    }

    public int getMaHinhThuc() {
        return maHinhThuc;
    }

    public void setMaHinhThuc(int maHinhThuc) {
        this.maHinhThuc = maHinhThuc;
    }

    public String getTenHinhThuc() {
        return tenHinhThuc;
    }

    public void setTenHinhThuc(String tenHinhThuc) {
        this.tenHinhThuc = tenHinhThuc;
    }
}