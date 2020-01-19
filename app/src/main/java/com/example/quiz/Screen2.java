package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        Intent intentScore = new Intent();

        String scc = intentScore.getStringExtra("SCORE");

        Button retake = findViewById(R.id.btnRetake);
        TextView score = findViewById(R.id.tvScore);

        score.setText("Score="+scc);

        retake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Screen2.this,com.example.quiz.MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
