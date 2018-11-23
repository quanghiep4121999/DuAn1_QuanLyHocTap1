package com.android.hiep.duan1_quanlyhoctap.model;

import android.content.Context;

public class QuanLyLopModel {

     String Malop,Tenlop;

    public QuanLyLopModel( String malop, String tenlop) {
        Malop = malop;
        Tenlop = tenlop;
    }

    public QuanLyLopModel(Context context) {
    }



    public String getMalop() {
        return Malop;
    }

    public void setMalop(String malop) {
        Malop = malop;
    }

    public String getTenlop() {
        return Tenlop;
    }

    public void setTenlop(String tenlop) {
        Tenlop = tenlop;
    }

    @Override
    public String toString() {
        return "QuanLyLopModel{" +
                "Malop='" + Malop + '\'' +
                ", Tenlop='" + Tenlop + '\'' +
                '}';
    }
}
