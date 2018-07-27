package com.example.android.dicodingacademy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCategory;
    private ArrayList<Academy>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = (RecyclerView)findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(AcademyData.getListData());
        showRecyclerCardView();
    }

    private void showSelectedAcademy(Academy academy){

        Intent kirimData = new Intent(this, Details.class);
        kirimData.putExtra("Nama", academy.getName());
        kirimData.putExtra("IMG", academy.getPhoto());
        kirimData.putExtra("DET", academy.getRemarks());

        kirimData.putExtra("DET2", academy.getDetail());
        kirimData.putExtra("SIS", academy.getSiswa());
        kirimData.putExtra("BON", academy.getBonus());
        kirimData.putExtra("LVL", academy.getLevel());
        kirimData.putExtra("PLAT", academy.getPlatform());
        kirimData.putExtra("IMG2", academy.getImgpenyusun());
        kirimData.putExtra("SUSUN", academy.getPenyusun());
        kirimData.putExtra("LINK", academy.getLink());

        this.startActivity(kirimData);
    }
    private void showRecyclerGrid(){
        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
        GridAcademyAdapter gridPresidentAdapter = new GridAcademyAdapter(this);
        gridPresidentAdapter.setListAcademy(list);
        rvCategory.setAdapter(gridPresidentAdapter);
        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedAcademy(list.get(position));
            }
        });
    }
    private void showRecyclerCardView(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewAcademyAdapter cardViewPresidentAdapter = new CardViewAcademyAdapter(this);
        cardViewPresidentAdapter.setListAcademy(list);
        rvCategory.setAdapter(cardViewPresidentAdapter);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }


//    public void about(View view) {
//        Intent intent = new Intent(MainActivity.this, about.class);
//        startActivity(intent);
//    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_list:
                showRecyclerCardView();
                break;

            case R.id.action_grid:
                showRecyclerGrid();
                break;

//            case R.id.about:
//                about();
//                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
