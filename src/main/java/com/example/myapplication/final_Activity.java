package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;

import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;

import java.util.Calendar;
import java.util.Date;

import static com.example.myapplication.R.id.Dateset;
import static com.example.myapplication.R.id.myDate;
import static java.lang.Integer.parseInt;

public class final_Activity extends AppCompatActivity {
    Databasehelper mydb;

    EditText Expense, Amount;
    TextView mydate;
    Button Save;
    ImageButton dateset;
    Calendar calendar;
    int year,month,day;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_);
        mydb = new Databasehelper(this);
        Save = (Button) findViewById(R.id.btnsave);
        Expense = (EditText) findViewById(R.id.Btnexpense);
        Amount = (EditText) findViewById(R.id.Btntext);
        dateset = (ImageButton) findViewById(Dateset);
        mydate=(TextView)findViewById(R.id.myDate);
        calendar = Calendar.getInstance();
        final int year=calendar.get(Calendar.YEAR);
        final int month=calendar.get(Calendar.MONTH);
        final int day=calendar.get(Calendar.DAY_OF_MONTH);

        dateset.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {


                DatePickerDialog datePickerDialog = new DatePickerDialog(final_Activity.this,R.style.Theme_AppCompat, new DatePickerDialog.OnDateSetListener()
                {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth)
                    {
                        String date;
                        if (dayOfMonth==1 || dayOfMonth==2 || dayOfMonth==3 || dayOfMonth==4 || dayOfMonth==5 || dayOfMonth==6 || dayOfMonth==7 || dayOfMonth==8 || dayOfMonth==9) {
//                            date=(month+1)+"/0"+ dayOfMonth+"/"+year;
                            date=year+"-"+(month+1)+"-0"+ dayOfMonth;
                        } else {
//                            date=(month+1)+"/"+ dayOfMonth+"/"+year;
                            date=year+"-"+(month+1)+"-0"+ dayOfMonth;
                        }
                        mydate.setText(date);
                    }
                }, year, month, day);
                datePickerDialog.show();
                datePickerDialog.getButton(DatePickerDialog.BUTTON_NEGATIVE).setTextColor(Color.GREEN);
                datePickerDialog.getButton(DatePickerDialog.BUTTON_POSITIVE).setTextColor(Color.GREEN);

            }


        });

        AddData();


    }

    public void AddData() {
        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean isInsert =  mydb.insertdata(Expense.getText().toString(), Amount.getText().toString(), mydate.getText().toString());

                if (isInsert = true) {
                    Toast.makeText(final_Activity.this, "Data inserted succesfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(final_Activity.this, "Data inserted improperly", Toast.LENGTH_SHORT).show();
                }


                Intent intent = new Intent(final_Activity.this,After_login.class);
                startActivity(intent);
            }
        });
    }
}

