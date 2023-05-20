package com.example.studentinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    CardView fahmida, rameem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fahmida = findViewById(R.id.fahmida);
        rameem = findViewById(R.id.rameem);

        fahmida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(home.this, fahmida.class);
                startActivity(f);
            }
        });

        rameem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(home.this, rameem.class);
                startActivity(r);
            }
        });
    }
}