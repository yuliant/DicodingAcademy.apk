package com.example.android.dicodingacademy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Details extends AppCompatActivity {
    ImageView GambarJudul;
    TextView txtdetail;
    TextView remaks;

    TextView des;
    TextView sis;
    TextView bon;
    TextView lev;
    TextView plat;
    ImageView imgSusun;
    TextView susun;
    Button link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        // berfungsi untuk menampilkan icon back (kembali) di pojok kiri atas
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        // pemanggilan ID dari layout activity_detail.xml
        txtdetail = (TextView) findViewById(R.id.txtdetail);
        String name = getIntent().getStringExtra("Nama");
        txtdetail.setText(name);

        GambarJudul = (ImageView) findViewById(R.id.GambarJudul);
        String img = getIntent().getStringExtra("IMG");
        Glide.with(Details.this)
                // LOAD URL DARI INTERNET
                .load(img)
                .into(GambarJudul);

        remaks = (TextView) findViewById(R.id.remaks);
        String rem = getIntent().getStringExtra("DET");
        remaks.setText(rem);

        des = (TextView) findViewById(R.id.deskripsi);
        String deskrip = getIntent().getStringExtra("DET2");
        des.setText(deskrip);

        sis = (TextView) findViewById(R.id.siswa);
        String siswa = getIntent().getStringExtra("SIS");
        sis.setText(siswa);

        bon = (TextView) findViewById(R.id.bonus);
        String bonus = getIntent().getStringExtra("BON");
        bon.setText(bonus);

        lev = (TextView) findViewById(R.id.level);
        String level = getIntent().getStringExtra("LVL");
        lev.setText(level);

        plat = (TextView) findViewById(R.id.platform);
        String platform = getIntent().getStringExtra("PLAT");
        plat.setText(platform);

        imgSusun = (ImageView) findViewById(R.id.imgpenyusun);
        String imgSun = getIntent().getStringExtra("IMG2");
        Glide.with(Details.this)
                // LOAD URL DARI INTERNET
                .load(imgSun)
                .into(imgSusun);

        susun = (TextView) findViewById(R.id.penyusun);
        String penyusun = getIntent().getStringExtra("SUSUN");
        susun.setText(penyusun);

        link = (Button) findViewById(R.id.link);
        final String inilink = getIntent().getStringExtra("LINK");
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(inilink));
                startActivity(intent);
            }
        });

    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}
