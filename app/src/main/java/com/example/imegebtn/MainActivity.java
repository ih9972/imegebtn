package com.example.imegebtn;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton vb;
    int num;
    Random rnd =new Random();
    ImageView images;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vb = (ImageButton) findViewById(R.id.vbtn);
        images = (ImageView) findViewById(R.id.images);
        vb.setBackgroundColor(Color.WHITE);
    }

    public void photos(View view) {
        num = rnd.nextInt(3)+1;
        switch (num) {
            case 1:
                vb.setImageResource(R.drawable.one);
                images.setImageResource(R.drawable.circel);break;
            case 2:
                vb.setImageResource(R.drawable.two);
                images.setImageResource(R.drawable.triangle);break;
            case 3:
                vb.setImageResource(R.drawable.three);
                images.setImageResource(R.drawable.square);break;
                }
    }
}