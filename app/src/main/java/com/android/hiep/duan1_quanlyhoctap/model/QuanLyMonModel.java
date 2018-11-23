package com.android.hiep.duan1_quanlyhoctap.model;

public class QuanLyMonModel {
    private String AVA_Monhoc;
    private String Tenmon,Mamon;

    public QuanLyMonModel(String AVA_Monhoc, String tenmon, String mamon) {
        this.AVA_Monhoc = AVA_Monhoc;
        Tenmon = tenmon;
        Mamon = mamon;
    }

    public String getAVA_Monhoc() {
        return AVA_Monhoc;
    }

    public void setAVA_Monhoc(String AVA_Monhoc) {
        this.AVA_Monhoc = AVA_Monhoc;
    }

    public String getTenmon() {
        return Tenmon;
    }

    public void setTenmon(String tenmon) {
        Tenmon = tenmon;
    }

    public String getMamon() {
        return Mamon;
    }

    public void setMamon(String mamon) {
        Mamon = mamon;
    }

    @Override
    public String toString() {
        return "QuanLyMonModel{" +
                "AVA_Monhoc='" + AVA_Monhoc + '\'' +
                ", Tenmon='" + Tenmon + '\'' +
                ", Mamon='" + Mamon + '\'' +
                '}';
    }
}
