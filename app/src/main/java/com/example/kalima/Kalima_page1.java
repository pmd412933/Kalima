package com.example.kalima;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class Kalima_page1 extends AppCompatActivity {
    ImageView imageView;
TextView textView1,textView2,textView3,textView4;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window g = getWindow();
        g.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,WindowManager.LayoutParams.TYPE_STATUS_BAR);
        setContentView(R.layout.activity_kalima_page2);

        toolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("         KALIMA TAYYABA");
        toolbar.setTitleTextColor(getResources().getColor(R.color.yello));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

     /*   imageView=findViewById(R.id.imageIcon2);
        textView1=findViewById(R.id.textviewtitelkalima1);*/
        textView2=findViewById(R.id.textviewtitelkalima2);
        textView3=findViewById(R.id.textviewtitelkalima3);
        textView4=findViewById(R.id.textviewtitelkalima4);


        /*imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Kalima_page1.this, Kalima.class);
                startActivity(intent1);
            }
        });*/

    }
}
