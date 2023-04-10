package com.example.loginform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class dataODCActivity extends AppCompatActivity {
    DatabaseHelper db;
    Button tambahData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_odc);
        db = new DatabaseHelper(this);
        tambahData = (Button) findViewById(R.id.button2);
        tambahData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addData = new Intent(dataODCActivity.this, BuatData.class);
                startActivity(addData);
            }
        });

    }

}
