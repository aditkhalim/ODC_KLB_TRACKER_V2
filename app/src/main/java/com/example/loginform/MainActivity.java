package com.example.loginform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper db;
    Button logout, DataODC, letakODC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DatabaseHelper(this);
        DataODC = (Button) findViewById(R.id.btn_DataODC);
        DataODC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent(MainActivity.this, infoOdcActivity.class);
                startActivity(data);
                finish();
            }
        });

        db = new DatabaseHelper(this);
        letakODC = (Button) findViewById(R.id.btn_letakODC);
        letakODC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent letak = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(letak);
                finish();
            }
        });

        logout = (Button) findViewById(R.id.btn_logout);
        Boolean checkSession = db.checkSession("ada");
        if (checkSession == false) {
            Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(loginIntent);
            finish();
        }

        //logout
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean updateSession = db.upgradeSession("kosong", 1);
                if (updateSession == true) {
                    Toast.makeText(getApplicationContext(), "Berhasil keluar", Toast.LENGTH_SHORT).show();
                    Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(loginIntent);
                    finish();
                }
            }
        });

    }

}
