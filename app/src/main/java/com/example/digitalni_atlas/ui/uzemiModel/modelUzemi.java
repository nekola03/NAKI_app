package com.example.digitalni_atlas.ui.uzemiModel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.digitalni_atlas.R;

import java.util.Objects;

public class modelUzemi extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_uzemi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.head)));
        getSupportActionBar().setTitle("Modelová území");
        listView = findViewById(R.id.listview);

        String[] values = new String[]{
                "Boletice","Česká Kanada","Jáchymovsko","Kačina","Kladensko","Krkonoše","Kutnohorsko","Mostecko","Podbořansko","Příměstská krajina Prahy","Rosicko-Oslavansko","Střední Povltaví"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    Intent intent = new Intent(view.getContext(), com.example.digitalni_atlas.ui.uzemiModel.boletice.bolActivity.class);
                    startActivity(intent);
                }
                if(i == 1){
                    Intent intent = new Intent(view.getContext(), com.example.digitalni_atlas.ui.uzemiModel.cerna_v_posumavi.cvpActivity.class);
                    startActivity(intent);
                }
                if(i == 2){
                    Intent intent = new Intent(view.getContext(), com.example.digitalni_atlas.ui.uzemiModel.jachymovsko.jachActivity.class);
                    startActivity(intent);
                }
                if(i == 3){
                    Intent intent = new Intent(view.getContext(), com.example.digitalni_atlas.ui.uzemiModel.kacina.kachActivity.class);
                    startActivity(intent);
                }
                if(i == 4){
                    Intent intent = new Intent(view.getContext(), com.example.digitalni_atlas.ui.uzemiModel.kladensko.kladActivity.class);
                    startActivity(intent);
                }
                if(i == 5){
                    Intent intent = new Intent(view.getContext(), com.example.digitalni_atlas.ui.uzemiModel.krkonose.krkActivity.class);
                    startActivity(intent);
                }
                if(i == 6){
                    Intent intent = new Intent(view.getContext(), com.example.digitalni_atlas.ui.uzemiModel.kutnohorsko.kutActivity.class);
                    startActivity(intent);
                }
                if(i == 7){
                    Intent intent = new Intent(view.getContext(), com.example.digitalni_atlas.ui.uzemiModel.mostecko.mostActivity.class);
                    startActivity(intent);
                }
                if(i == 8){
                    Intent intent = new Intent(view.getContext(), com.example.digitalni_atlas.ui.uzemiModel.podboransko.podActivity.class);
                    startActivity(intent);
                }
                if(i == 9){
                    Intent intent = new Intent(view.getContext(), com.example.digitalni_atlas.ui.uzemiModel.primestska_krajina_prahy.pkpActivity.class);
                    startActivity(intent);
                }
                if(i == 10){
                    Intent intent = new Intent(view.getContext(), com.example.digitalni_atlas.ui.uzemiModel.rosicko_oslavansko.roActivity.class);
                    startActivity(intent);
                }
                if(i == 11){
                    Intent intent = new Intent(view.getContext(), com.example.digitalni_atlas.ui.uzemiModel.stredni_povltavi.spActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}