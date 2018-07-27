package com.example.android.dicodingacademy;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewAcademyAdapter extends RecyclerView.Adapter<CardViewAcademyAdapter.CardViewViewHolder> {
    //sebuah kelas adapter yang akan memformat bagaimana tiap elemen dari koleksi data yang kita punya ditampilkan
    // dalam bentuk card view
    private ArrayList<Academy> listAcademy;
    private Context context;

    public CardViewAcademyAdapter(Context context) {
        this.context = context;
    }
    public ArrayList<Academy> getListAcademy() {
        return listAcademy;
    }
    public void setListAcademy(ArrayList<Academy> listAcademy) {
        this.listAcademy = listAcademy;
    }
    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_academy, parent, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position) {

        Academy p = getListAcademy().get(position);

        Glide.with(context)
                .load(p.getPhoto())
                .override(350, 350)
                .into(holder.imgPhoto);

        holder.tvName.setText(p.getName());
        holder.tvRemarks.setText(p.getPlatform());

        holder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {

            @Override
            public void onItemClicked(View view, int position) {
                // saya rasa bagian ini yang harus di otak atik bila menampilkan details
//                Toast.makeText(context, "Details "+getListAcademy().get(position).getName(), Toast.LENGTH_SHORT).show();
                Intent kirimData = new Intent(context, Details.class);
                kirimData.putExtra("Nama", getListAcademy().get(position).getName());
                kirimData.putExtra("IMG", getListAcademy().get(position).getPhoto());
                kirimData.putExtra("DET", getListAcademy().get(position).getRemarks());

                kirimData.putExtra("DET2", getListAcademy().get(position).getDetail());
                kirimData.putExtra("SIS", getListAcademy().get(position).getSiswa());
                kirimData.putExtra("BON", getListAcademy().get(position).getBonus());
                kirimData.putExtra("LVL", getListAcademy().get(position).getLevel());
                kirimData.putExtra("PLAT", getListAcademy().get(position).getPlatform());
                kirimData.putExtra("IMG2", getListAcademy().get(position).getImgpenyusun());
                kirimData.putExtra("SUSUN", getListAcademy().get(position).getPenyusun());
                kirimData.putExtra("LINK", getListAcademy().get(position).getLink());

                context.startActivity(kirimData);
            }
        }));

        holder.btnShare.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {

            @Override
            public void onItemClicked(View view, int position) {
                // saya rasa bagian ini yang harus di otak atik bila menampilkan details
//                Toast.makeText(context, "Share " + getListAcademy().get(position).getName(), Toast.LENGTH_SHORT).show();
                String shareBody="Ayo teman-teman ikuti "+getListAcademy().get(position).getName()+" di "+getListAcademy().get(position).getLink();
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My App");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                context.startActivity(Intent.createChooser(shareIntent,"Share via"));
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListAcademy().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnFavorite, btnShare;
        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvRemarks = (TextView)itemView.findViewById(R.id.tv_item_remarks);
            btnFavorite = (Button)itemView.findViewById(R.id.btn_set_favorite);
            btnShare = (Button)itemView.findViewById(R.id.btn_set_share);
        }
    }
}
