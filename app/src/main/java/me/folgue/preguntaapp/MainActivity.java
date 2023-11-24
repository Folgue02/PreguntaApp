package me.folgue.preguntaapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView playPlayButton = findViewById(R.id.playButton);
        CardView helpPlayButton = findViewById(R.id.helpButton);

        helpPlayButton.setOnClickListener(l -> {
            Intent i = new Intent(this, HelpActivity.class);
            this.startActivity(i);
        });

        playPlayButton.setOnClickListener(l -> {
            Intent i = new Intent(this, PlayActivity.class);
            this.startActivity(i);
        });
    }
}