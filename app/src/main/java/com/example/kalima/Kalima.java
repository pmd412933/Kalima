 package com.example.kalima;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

 public class Kalima extends AppCompatActivity {
    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window g = getWindow();
        g.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,WindowManager.LayoutParams.TYPE_STATUS_BAR);
        setContentView(R.layout.activity_kalima);

        imageView1=findViewById(R.id.imageIcon);
        imageView2=findViewById(R.id.imagekalima1);
        imageView3=findViewById(R.id.imagekalima2);
        imageView4=findViewById(R.id.imagekalima3);
        imageView5=findViewById(R.id.imagekalima4);
        imageView6=findViewById(R.id.imagekalima5);

        textView=findViewById(R.id.textviewtitelkalima);


        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Kalima.this, Kalima_page5.class);
                startActivity(intent1);

            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Kalima.this, Kalima_page4.class);
                startActivity(intent1);

            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Kalima.this, Kalima_page3.class);
                startActivity(intent1);

            }
        });





        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Kalima.this, Kalima_page1.class);
                startActivity(intent1);

            }
        });

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Kalima.this, MainActivity.class);
                startActivity(intent1);

            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Kalima.this,Kalima_page2.class);
                startActivity(intent);
            }
        });

    }
}
