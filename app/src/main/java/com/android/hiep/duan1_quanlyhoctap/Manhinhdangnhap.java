package com.android.hiep.duan1_quanlyhoctap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Manhinhdangnhap extends AppCompatActivity {
    Button b1,b2;
    EditText ed1,ed2;

    TextView tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinhdangnhap);
        b1=(Button)findViewById(R.id.button);
        ed1=(EditText)findViewById(R.id.editText);
        ed2=(EditText)findViewById(R.id.editText2);
        b2=(Button)findViewById(R.id.button2);
        tx1=(TextView)findViewById(R.id.textView3);
        tx1.setVisibility(View.GONE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(ed1.getText().toString().equals("hiepnq0412") &&
//
//                        ed2.getText().toString().equals("123456")) {
//                    Toast.makeText(getApplicationContext(), "Đăng Nhập Thành Công",Toast.LENGTH_SHORT).show();

                            Intent intent = new Intent(Manhinhdangnhap.this,MainActivity.class);
                            startActivity(intent);


//
//                }
////                else{
//                    Toast.makeText(getApplicationContext(), "Đăng Nhập Thất Bại",Toast.LENGTH_SHORT).show();
//
//
//
//                    if (counter == 0) {
//                        b1.setEnabled(false);
//                    }
//                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    public void Registration(View view) {
        Intent dangnhap = new Intent(Manhinhdangnhap.this,dangky.class);
        startActivity(dangnhap);
    }
}

