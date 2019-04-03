package com.tj.textdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tempreture extends AppCompatActivity {
private TextView textView;
private float c,f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempreture);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null) {

            String value = bundle.getString("tag");
            textView.setText(value);
        }

    }
}
