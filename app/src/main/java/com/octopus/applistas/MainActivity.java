package com.octopus.applistas;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    private TextView mTextView;
    private Button btnSimple;
    private Button btnAvanzado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text);
        btnSimple = (Button) findViewById(R.id.btnSimple);
        btnAvanzado = (Button) findViewById(R.id.btnAvanzado);

        // Enables Always-on
        setAmbientEnabled();
    }
    public void btnSimpleClick(View View){
        Intent intent = new Intent(this, SimpleListActivity.class);
        startActivity(intent);
    }
}
