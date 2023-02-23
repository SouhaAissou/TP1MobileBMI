package com.example.myapplicationno1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText width = findViewById(R.id.width);
        EditText height = findViewById(R.id.height);
        Button btn = findViewById(R.id.button);
        ImageView image = findViewById(R.id.image);
        TextView text = findViewById(R.id.text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int w = Integer.parseInt(width.getText().toString());
                int h = Integer.parseInt(height.getText().toString());
                double result = w / h*h;
                if (result < 18.5) {
                    text.setText("Maigreur");
                    image.setImageResource(R.drawable.maigreur);
                } else if (result >= 18.5 && result < 25) {
                    text.setText("Normal");
                    image.setImageResource(R.drawable.normal);
                } else if (result >= 25 && result < 30) {
                    text.setText("Surpoids");
                    image.setImageResource(R.drawable.surpoids);
                } else if (result >= 30 && result < 35) {
                    text.setText("Obésité");
                    image.setImageResource(R.drawable.obesite);
                } else if (result >=35){
                    text.setText("Obésité sévère");
                    image.setImageResource(R.drawable.obesitesevere);
                }

            }
        });
    }
}
