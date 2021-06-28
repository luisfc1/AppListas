package com.octopus.applistas;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.wear.widget.WearableRecyclerView;

import java.util.ArrayList;

public class SimpleListActivity extends WearableActivity {

    private WearableRecyclerView lista_simple;
    private Adaptador adaptadorListaSimple;
    private String valorPorDefault = "Elemento";
    private ArrayList<String> elementos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);

        rellenar_lista();

        adaptadorListaSimple = new Adaptador(valorPorDefault, elementos);
        lista_simple = (WearableRecyclerView) findViewById(R.id.simple_recyclerview);

        lista_simple.setEdgeItemsCenteringEnabled(true);
        lista_simple.setLayoutManager(new LinearLayoutManager(this));
        lista_simple.setHasFixedSize(true);
        lista_simple.setAdapter(adaptadorListaSimple);

    }
    public void rellenar_lista(){
        //crear datos dummy
        elementos = new ArrayList<String>();
        elementos.add("Lunes");
        elementos.add("Martes");
        elementos.add("Miercoles");
        elementos.add("Jueves");
        elementos.add("Viernes");
    }
}