package com.example.android.dicodingacademy;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Details extends AppCompatActivity {
    ImageView GambarJudul;
    TextView txtdetail;
    TextView remaks;
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






// intent ini fungsinya adalah untuk menerima data dari RecyclerViewAdapter
//        Intent terimadata = getIntent();
//        String nm = terimadata.getStringExtra("Nama");
//        getSupportActionBar().setTitle(nm);
//        imggambar.setImageResource(terimadata.getIntExtra("IMG", 1)); //angka satu itu menandakan bahwasannya nilai dari si integer (gak harus angka 1)
//        txtdetail.setText(terimadata.getStringExtra("DET"));
//
//        tvDataReceived = (TextView)findViewById(R.id.tv_data_received);
//        String name = getIntent().getStringExtra(EXTRA_NAME);
//        int age = getIntent().getIntExtra(EXTRA_AGE, 0);
//        String text = "Name : "+name+", Your Age : "+age;
//        tvDataReceived.setText(text);
