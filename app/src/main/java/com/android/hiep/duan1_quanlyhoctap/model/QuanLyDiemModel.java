package com.android.hiep.duan1_quanlyhoctap.model;

public class QuanLyDiemModel {
    private String AVA_Diem;
    private double diem;

    public QuanLyDiemModel(String AVA_Diem, double diem) {
        this.AVA_Diem = AVA_Diem;
        this.diem = diem;
    }

    public String getAVA_Diem() {
        return AVA_Diem;
    }

    public void setAVA_Diem(String AVA_Diem) {
        this.AVA_Diem = AVA_Diem;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "QuanLyDiemModel{" +
                "AVA_Diem='" + AVA_Diem + '\'' +
                ", diem=" + diem +
                '}';
    }
}
