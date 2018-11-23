package com.android.hiep.duan1_quanlyhoctap.tab;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class QuanLyTab extends FragmentStatePagerAdapter {
    private Fragment fragment_lichhoc;
    private Fragment fragment_lichnghi;


    public QuanLyTab(FragmentManager fm) {
        super(fm);
        fragment_lichhoc = new Fragment();
        fragment_lichnghi = new Fragment();
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return fragment_lichhoc;
        } else if (position == 1) {
            return fragment_lichnghi;
        } else {
            //TODO nothing
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Điểm";
            case 1:
                return "Thông tin";
                default:
                    return null;
        }
    }
}
