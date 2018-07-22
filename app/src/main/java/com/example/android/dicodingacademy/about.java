package com.example.android.dicodingacademy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class about extends AppCompatActivity {
    ImageView gambarJudul;
    public static String urlGambar ="https://www.dicoding.com/images/small/academy/belajar_membuat_aplikasi_android_untuk_pemula_logo_041217105725.png";

    ImageView pemilik;
    public static String urlGambar2 ="https://scontent.fsub5-1.fna.fbcdn.net/v/t1.0-9/36283389_1628840227237757_596231109537169408_n.jpg?_nc_cat=0&oh=686a328c1ee1b91c78a70c36d2955c52&oe=5BC7AEEA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        gambarJudul = (ImageView)findViewById(R.id.GambarJudul);
        Glide.with(about.this)
                // LOAD URL DARI INTERNET
                .load(urlGambar)
                .into(gambarJudul);

        pemilik = (ImageView)findViewById(R.id.profile_image);
        Glide.with(about.this)
                // LOAD URL DARI INTERNET
                .load(urlGambar2)
                .into(pemilik);
    }
}
