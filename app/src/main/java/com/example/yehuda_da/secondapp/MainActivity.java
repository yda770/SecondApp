package com.example.yehuda_da.secondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnYehuda = findViewById(R.id.btnYehuda);
        btnYehuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "חחחחח", Toast.LENGTH_SHORT).show();
                TextView userName = findViewById(R.id.txtUserName);
                TextView password = findViewById(R.id.txtPassword);
                Intent i = new Intent(MainActivity.this, second_activity.class);

                i.putExtra("USER", userName.getText().toString() ); // Parameters to next activiti
                i.putExtra("PASS", password.getText().toString() );
                startActivity(i);

                //Log.d(          )
            }
        });
    }
}
