package com.example.android.dicodingacademy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class GridAcademyAdapter extends RecyclerView.Adapter<GridAcademyAdapter.GridViewHolder>{
    //sebuah kelas adapter yang akan memformat bagaimana tiap elemen dari koleksi data yang kita punya ditampilkan
    // dalam bentuk Grid
    private Context context;
    private ArrayList<Academy> listAcademy;

    public ArrayList<Academy> getListAcademy() {

        return listAcademy;
    }

    public void setListAcademy(ArrayList<Academy> listAcademy) {
        this.listAcademy = listAcademy;
    }

    public GridAcademyAdapter(Context context) {

        this.context = context;
    }

    @Override
    public GridViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_academy, parent, false);
        GridViewHolder gridViewHolder = new GridViewHolder(view);
        return gridViewHolder;
    }
    @Override
    public void onBindViewHolder(GridViewHolder holder, int position) {
        Glide.with(context)
                .load(getListAcademy().get(position).getPhoto())
                .override(350, 350)
                .into(holder.imgPhoto);
    }
    @Override
    public int getItemCount() {
        return getListAcademy().size();
    }
    public class GridViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        public GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
        }
    }
}
