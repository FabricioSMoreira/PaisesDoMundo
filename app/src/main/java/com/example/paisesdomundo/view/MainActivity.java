package com.example.paisesdomundo.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.paisesdomundo.R;
import com.example.paisesdomundo.adapter.RegionAdapter;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvRegionsOfWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvRegionsOfWorld = findViewById(R.id.lv_regions_of_word);

        List<String> listOfRegions = Arrays.asList("África", "Américas", "Ásia", "Europa", "Oceania" );

        setListOfRegions(listOfRegions);


    }

    public ListView setListOfRegions(List<String> listOfRegions){

        RegionAdapter adapter= new RegionAdapter(this, listOfRegions);
        lvRegionsOfWorld.setAdapter(adapter);


        lvRegionsOfWorld.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Intent mIntent = new Intent(MainActivity.this);
                //Passa o objeto para outra activity
                //mIntent.putExtra("clinic", listClinics.get(position));
                // chama a nova tela
                //startActivity(mIntent);
            }
        });


        return lvRegionsOfWorld;
    }
}
