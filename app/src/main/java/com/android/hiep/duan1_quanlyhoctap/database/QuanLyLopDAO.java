package com.android.hiep.duan1_quanlyhoctap.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class QuanLyLopDAO {

    private SQLiteDatabase db;
    private DatabaseSql dbHeper;
    public static final String TABLE_NAME = "DSlop";
    public static final String SQL_Ql_LOP = "CREATE TABLE DSCauThu(MaLop text primary key," +
            " TenLop text)";
    public static final String TAG = "QuanLyLopDAO";

    public QuanLyLopDAO(Context context) {
        dbHeper = new DatabaseSql(context);
        db = dbHeper.getWritableDatabase();
    }

//
//    public int insertDanhSachLop(QuanLyLopDAO ds) {
//        ContentValues values = new ContentValues();
//
////        values.put("Malop", ds.getAVA_Lop());
////        values.put("TenCTDS", ds.getTenCTNB());
////        values.put("ViTri", ds.getVitriCTNB());
//
//        try {
//            if (db.insert(TABLE_NAME, null, values) == -1) {
//                return -1;
//            }
//        } catch (Exception e) {
//            Log.e(TAG, e.toString());
//        }
//        return 1;
//    }

////
////    public List<QuanLyLopDAO> getALLCauThuNB() {
////        List<QuanLyLopDAO> dsLop = new ArrayList<>();
////        Cursor c = db.query(TABLE_NAME, null, null, null, null, null, null);
////        c.moveToFirst();
////        while (c.isAfterLast() == false) {
////            QuanLyLopModel qll = new QuanLyLopModel();
////            qll.setMalop(c.getString(0));
////            qll.setTenlop(c.getString(1));
////
////            dsLop.add(null);
////            Log.d("//====", qll.toString());
////            c.moveToNext();
////        }
////        c.close();
////        return dsLop;
//    }

    public int deleteDanhsachCTNT(String mact) {
        int result = db.delete(TABLE_NAME, "MaLop=?", new String[]{mact});
        if (result == 0)
            return -1;
        return 1;
    }
}
