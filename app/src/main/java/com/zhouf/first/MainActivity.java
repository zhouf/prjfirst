package com.zhouf.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static String TAG = "Main";

    TextView out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        out = findViewById(R.id.btn);
        out.setText("Hello kkkkk");
        Log.i(TAG, "onCreate: ");

        EditText inp = findViewById(R.id.inp);
        String str = inp.getText().toString();
        inp.setText("12345");

        Button btn = findViewById(R.id.btn);
        //btn.setOnClickListener(this);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG, "onClick: Click22222");
//                Log.w(TAG, "onClick: WWWWWW");
//                out.setText("AAAAAAAA");
//            }
//        });

    }

    @Override
    public void onClick(View v) {
        Log.i(TAG, "onClick: .............");
        out.setText("Clicked2");
    }

    public void abc(View b){
        Log.i(TAG, "abc: kkkkkkkkk");
        out.setText("Clicked33333");
    }
}
