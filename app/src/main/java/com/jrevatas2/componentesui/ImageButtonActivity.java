package com.jrevatas2.componentesui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ImageButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);
    }

    public void limpieza(View view){
        Toast.makeText(this, "Limpieza de grupo WE", Toast.LENGTH_SHORT).show();
    }
}
