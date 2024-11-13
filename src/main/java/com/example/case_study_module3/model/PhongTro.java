package com.example.case_study_module3.model;

import java.sql.Date;

public class PhongTro {
    private int id;
    private String ten;
    private String sdt;

    public PhongTro() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Date getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(Date ngayThue) {
        this.ngayThue = ngayThue;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }

    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public PhongTro(int id, String ten, String sdt, Date ngayThue, String hinhThuc, String ghiChu) {
        this.id = id;
        this.ten = ten;
        this.sdt = sdt;
        this.ngayThue = ngayThue;
        this.hinhThuc = hinhThuc;
        this.ghiChu = ghiChu;
    }

    private Date ngayThue;
    private String hinhThuc;
    private String ghiChu;

    // Constructor, getters và setters
}
