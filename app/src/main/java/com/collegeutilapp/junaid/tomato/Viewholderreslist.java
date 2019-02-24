package com.collegeutilapp.junaid.tomato;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.LruCache;
import com.squareup.picasso.Picasso;

public class Viewholderreslist extends RecyclerView.ViewHolder {

    View mView;

    public Viewholderreslist(@NonNull View itemView) {
        super(itemView);

        mView=itemView;

    }

    public void setDetails(MainActivity context,String resname,String resrating,String reslocal,String reslogo){

        TextView tvresname=mView.findViewById(R.id.res_name);
        TextView tvresrating=mView.findViewById(R.id.res_rating);
        TextView tvreslocal=mView.findViewById(R.id.res_local);
        ImageView ivreslogo=mView.findViewById(R.id.image_loadin);

        tvresname.setText(resname);
        tvreslocal.setText(reslocal);
        tvresrating.setText(resrating);
        Picasso p=new Picasso.Builder(context).memoryCache(new LruCache(240000)).build();
        p.load(reslogo).resize(1080,1080).centerInside().placeholder(R.drawable.progress_animation).error(R.drawable.errorsign).into(ivreslogo);
    }



}
