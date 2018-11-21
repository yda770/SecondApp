package com.example.yehuda_da.secondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);

        TextView helloUser = findViewById(R.id.txtHello);

        helloUser.setText(getIntent().getStringExtra("USER"));
        final Button btnToList = findViewById(R.id.getlist);
        btnToList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(second_activity.this, ListExsample.class);

                startActivity(i);
            }
        });

    }
}