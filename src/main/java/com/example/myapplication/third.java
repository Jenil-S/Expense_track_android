package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class third extends AppCompatActivity {

    Databasehelper databasehelper;
    private Spinner spinner;
    EditText income;
    Button save;
    int total;
    double i;
    double d;
    String txt;
    double result;

//    TextView Inco;
//    Databasehelper db = new Databasehelper(getApplicationContext());
//    SQLiteDatabase sqLiteDatabase = db.getWritableDatabase();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
       // dbhelper =new dbhelper(this);
        databasehelper =new Databasehelper(this);
        ArrayList<String> drop = new ArrayList<>();
        drop.add("list");
        drop.add("Business");
        drop.add("Job");
        drop.add("Others");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, drop);
        spinner = (Spinner) findViewById(R.id.spinner1);
        spinner.setAdapter(adapter);
        income = (EditText) findViewById(R.id.Btntext);
        save = (Button) findViewById(R.id.btnsave);

        addData();

    }

    public void Store_input(View view) {
         txt=income.getText().toString();
         result = Double.parseDouble(txt);
        Toast.makeText(this, "Data saved succesfully" + txt, Toast.LENGTH_SHORT).show();

    }


    public void addData() {
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean isinsert = databasehelper.Insertdata(income.getText().toString());

                if (isinsert = true) {
                    Toast.makeText(third.this, "Data inserted succesfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(third.this, "Data inserted improperly", Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(third.this,After_login.class);
                startActivity(intent);
            }
        });
    }
}
