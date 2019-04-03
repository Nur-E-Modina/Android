package com.tj.textdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private Button button;
    private TextView nameTextView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameTextView=(TextView) findViewById(R.id.nameTextViewId);
        button=(Button)findViewById(R.id.btn1);
nameTextView.setText("Discuss About AI");
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity.this,Tempreture.class);
        intent.putExtra("tag","Please click a button for details");

        startActivity(intent);

    }
});
    }


}
