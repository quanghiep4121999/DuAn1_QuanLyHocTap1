package com.android.hiep.duan1_quanlyhoctap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class ManHinhChao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chao);
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Intent chao = new Intent(ManHinhChao.this,Manhinhdangnhap.class);
                    startActivity(chao);
                }
            }
        });
        thread.start();
    }
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
