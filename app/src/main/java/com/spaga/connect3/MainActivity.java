package com.spaga.connect3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // 0 = yellow, 1 = red
    int activePlayer = 0;
    // 2 = unplayed
    int[] gameStae = {2, 2, 2, 2, 2, 2, 2, 2, 2};

    public void dropIn(View view) {
        ImageView counter = (ImageView) view;
        System.out.println(counter.getTag().toString());

        counter.setTranslationY(-1500f);

        if (activePlayer == 0) {
            counter.setImageResource(R.drawable.yellow_token);
            activePlayer = 1;
        }
        else {
            counter.setImageResource(R.drawable.red_token);
            activePlayer = 0;
        }

        counter.animate().translationYBy(1500f).setDuration(300);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
