package com.android.hiep.duan1_quanlyhoctap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class dangky extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangky);
    }



    public void cancel(View view) {
        finish();
    }

    public void dk(View view) {
        Toast.makeText(this, "đăng ký thành công", Toast.LENGTH_SHORT).show();

    }
}
