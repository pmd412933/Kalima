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

public class Kalima_page4 extends AppCompatActivity {
    ImageView imageView;
    TextView textView1,textView2,textView3,textView4;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window g = getWindow();
        g.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,WindowManager.LayoutParams.TYPE_STATUS_BAR);
        setContentView(R.layout.activity_kalima_page5);

        toolbar = findViewById(R.id.toolbar4);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("         Kalima TOUHEED");
        toolbar.setTitleTextColor(getResources().getColor(R.color.yello));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


       /* imageView=findViewById(R.id.imageIcon5);
        textView1=findViewById(R.id.textviewtitelkalima13);*/
        textView2=findViewById(R.id.textviewtitelkalima14);
        textView3=findViewById(R.id.textviewtitelkalima15);
        textView4=findViewById(R.id.textviewtitelkalima16);


        /*imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Kalima_page4.this, Kalima.class);
                startActivity(intent1);
            }
        });*/

    }
}
