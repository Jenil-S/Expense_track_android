package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;

import com.agrawalsuneet.dotsloader.loaders.LazyLoader;

public class Home extends AppCompatActivity {
    private Button Register,Login;
    LazyLoader lazyLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Register=(Button)findViewById(R.id.btnRegister);
        Login=(Button)findViewById(R.id.btnLogin);
        lazyLoader=findViewById(R.id.My_loader);
        LazyLoader loader=new LazyLoader(this,30,20, ContextCompat.getColor(this,R.color.loader_selected),ContextCompat.getColor(this,R.color.loader_selected),ContextCompat.getColor(this,R.color.loader_selected));
                loader.setAnimDuration(500);
        loader.setFirstDelayDuration(100);
        loader.setSecondDelayDuration(200);
        loader.setInterpolator(new LinearInterpolator());
        lazyLoader.addView(loader);
//        Handler handler=new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                startActivity(new Intent(Home.this,Home.class));
//                finish();
//            }
//        },2000);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Home.this,Register.class);
                startActivity(intent);
            }
        });
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,MY_project.class);
                startActivity(intent);
            }
        });
}
}
