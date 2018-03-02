package com.jrevatas2.componentesui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AndroidButtonActivity extends AppCompatActivity {

    public static final String TAG = AndroidButtonActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_button);
    }

    public void callButton1(View view){
        Log.d(TAG,"Boton 1 we");
        Toast.makeText(this, "Entró al boton 1 we", Toast.LENGTH_SHORT).show();
    }
    public void callButton2(View view){
        Log.d(TAG,"Boton 2 we");
        Toast.makeText(this, "Entró al boton 2 we", Toast.LENGTH_SHORT).show();
    }
    public void callButton3(View view){
        Log.d(TAG,"Boton 3 we");
        Toast.makeText(this, "Entró al boton 3 we", Toast.LENGTH_SHORT).show();
    }
    public void callButton4(View view){
        Log.d(TAG,"Boton 4 we");
        Toast.makeText(this, "Entró al boton 4 we", Toast.LENGTH_SHORT).show();
    }
}
