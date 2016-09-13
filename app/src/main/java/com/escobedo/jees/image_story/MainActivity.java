package com.escobedo.jees.image_story;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {
        ImageView masterchief = (ImageView) findViewById(R.id.masterchief);
        ImageView halo2 = (ImageView) findViewById(R.id.halo2);
        Button firstButton = (Button) findViewById(R.id.firstButton);
        Button secondButton = (Button) findViewById(R.id.secondButton);

        masterchief.animate().alpha(0f).setDuration(2000);
        halo2.setVisibility(View.VISIBLE);
        halo2.animate().alpha(1f).setDuration(2000);

        firstButton.setEnabled(false);
        firstButton.setVisibility(View.INVISIBLE);

        secondButton.setEnabled(true);
        secondButton.setVisibility(View.VISIBLE);
    }

    public void movecasco(View view) {
        ImageView casco = (ImageView) findViewById(R.id.casco);
        ImageView halo2 = (ImageView) findViewById(R.id.halo2);
        Button secondButton = (Button) findViewById(R.id.secondButton);
        Button resetButton = (Button) findViewById(R.id.resetButton);

        halo2.animate().alpha(0f).setDuration(2000);
        casco.setVisibility(View.VISIBLE);
        casco.animate().translationYBy(3000f).setDuration(2000);

        secondButton.setEnabled(false);
        secondButton.setVisibility(View.INVISIBLE);

        resetButton.setEnabled(true);
        resetButton.setVisibility(View.VISIBLE);
    }

    public void resetImages(View view) {
        Button firstButton = (Button) findViewById(R.id.firstButton);
        Button resetButton = (Button) findViewById(R.id.resetButton);
        ImageView masterchief = (ImageView) findViewById(R.id.masterchief);
        ImageView halo2 = (ImageView) findViewById(R.id.halo2);
        ImageView casco = (ImageView) findViewById(R.id.casco);

        casco.setVisibility(View.INVISIBLE);
        casco.setTranslationY(-3000);
        halo2.setVisibility(View.INVISIBLE);
        masterchief.setAlpha(1f);

        resetButton.setEnabled(false);
        resetButton.setVisibility(View.INVISIBLE);

        firstButton.setEnabled(true);
        firstButton.setVisibility(View.VISIBLE);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView casco = (ImageView) findViewById(R.id.casco);
        casco.setTranslationY(-3000);
    }
}
