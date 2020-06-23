package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=new Intent(this,Home.class);
        startActivity(intent);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view)
    {
        EditText edittext=findViewById(R.id.edittext);
        String message =edittext.getText().toString();

        Intent intent=new Intent(this,MessageActivity.class);
        intent.putExtra("EXTRA_MESSAGE", message);
        startActivity(intent);
    }
}
