package com.android.hiep.duan1_quanlyhoctap.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.hiep.duan1_quanlyhoctap.model.QuanLyLopModel;

import java.util.List;

public class QuanLyLopAdapter extends BaseAdapter {

    List<QuanLyLopModel> arrQuanLylop;
    public LayoutInflater inflater;
    QuanLyLopModel quanLyLopModel;
    private Context context;
    private ViewHolder holder;


    public QuanLyLopAdapter(Context context, List<QuanLyLopModel> arrQuanLylop) {
        super();
        this.context = context;
        this.arrQuanLylop = arrQuanLylop;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        quanLyLopModel = new QuanLyLopModel(context);
    }

    @Override
    public int getCount() {
        return arrQuanLylop.size();
    }

    @Override
    public Object getItem(int position) {
        return arrQuanLylop.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    public static class ViewHolder {
        ImageView avatarLop, imgxoa, imgEdit;
        TextView txtMaLop,txttenlop  ;

    }

//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        if (convertView == null) {
////            convertView = inflater.inflate(R.layout.item_danh_sach_lop, null);
////            holder = new ViewHolder();
////            holder.avatarLop = (ImageView) convertView.findViewById(R.id.AVT_Lop);
////            holder.txttenlop = (TextView) convertView.findViewById(R.id.item_tenlop);
////            holder.txtMaLop = (TextView) convertView.findViewById(R.id.item_Malop);
////            convertView.setTag(holder);
//        } else {
//            holder = (ViewHolder) convertView.getTag();
//        }
//        QuanLyLopModel country = this.arrQuanLylop.get(position);
//        holder.txtMaLop.setText(country.getMalop());
//
////        int imageId = this.getMipmapResIdByName(country.getAVA_Lop());
////        holder.avatarLop.setImageResource(imageId);
//
//        return convertView;
//
//    }
////    public int getMipmapResIdByName(String resName)  {
////        String pkgName = context.getPackageName();
////        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
////        Log.i("", "Res Name: "+ resName+"==> Res ID = "+ resID);
////        return resID;





    }


