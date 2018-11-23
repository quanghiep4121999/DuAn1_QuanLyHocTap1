package com.android.hiep.duan1_quanlyhoctap.model;

public class QuanLySVModel {
    private  String AVA_SV;
    private String Masv,Name,TenNganh,Manganh,gioitinh;

    public QuanLySVModel(String AVA_SV, String masv, String name, String tenNganh, String manganh, String gioitinh) {
        this.AVA_SV = AVA_SV;
        Masv = masv;
        Name = name;
        TenNganh = tenNganh;
        Manganh = manganh;
        this.gioitinh = gioitinh;
    }

    public String getAVA_SV() {
        return AVA_SV;
    }

    public void setAVA_SV(String AVA_SV) {
        this.AVA_SV = AVA_SV;
    }

    public String getMasv() {
        return Masv;
    }

    public void setMasv(String masv) {
        Masv = masv;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTenNganh() {
        return TenNganh;
    }

    public void setTenNganh(String tenNganh) {
        TenNganh = tenNganh;
    }

    public String getManganh() {
        return Manganh;
    }

    public void setManganh(String manganh) {
        Manganh = manganh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return "QuanLySVModel{" +
                "AVA_SV='" + AVA_SV + '\'' +
                ", Masv='" + Masv + '\'' +
                ", Name='" + Name + '\'' +
                ", TenNganh='" + TenNganh + '\'' +
                ", Manganh='" + Manganh + '\'' +
                ", gioitinh='" + gioitinh + '\'' +
                '}';
    }
}
