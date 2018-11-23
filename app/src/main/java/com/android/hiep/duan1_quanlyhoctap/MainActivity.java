package com.android.hiep.duan1_quanlyhoctap;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;

import android.os.Bundle;
import android.support.annotation.NonNull;


import android.view.Menu;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.MenuItem;



public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
//    private FloatingActionButton fab;
    private Dialog dialog;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        Actionbar();
        navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);
//        QuanLyFragment(new TabFragment());
//        fab= fab.findViewById(R.id.fabQuanLyLop);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                showDialog();
//
//            }
//        });



    }
    public void showDialog() {
        dialog = new Dialog(MainActivity.this);
        dialog.setTitle("them lop");
        dialog.setContentView(R.layout.dialog_themlop);
        dialog.show();
    }


    private void Actionbar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.menu);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {



            case R.id.nav_dangxuat:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Bạn có chắc chắn muốn thoát không?");
                builder.setIcon(R.drawable.dangxuat);
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                builder.show();

                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return false;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
//        showDialog();
        return super.onCreateOptionsMenu(menu);
    }

//
//    public void QuanLyFragment(TabFragment fragment) {
//        if (fragment != null) {
//            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//            fragmentTransaction.replace(R.id.fragment, fragment);
//            fragmentTransaction.commit();
//        }
//        drawerLayout.closeDrawer(GravityCompat.START);
//    }
}

