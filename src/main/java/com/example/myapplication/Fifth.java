package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

//import com.google.firebase.auth.FirebaseAuth;

public class Fifth extends AppCompatActivity {
    CalendarView calendarView;
    TextView myDate;
    String d;
    private Button next;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

     calendarView=(CalendarView)findViewById(R.id.calendarView);
     myDate=(TextView)findViewById(R.id.myDate);

     calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
         @Override
         public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
             String date;
             if (i2==1 || i2==2 || i2==3 || i2==4 || i2==5 || i2==6 || i2==7 || i2==8 || i2==9) {
                 date=(i1+1)+"/0"+ i2+"/"+i;
                 d = i+"-"+(i1+1)+"-0"+i2;
             } else {
                 date=(i1+1)+"/"+ i2+"/"+i;
                 d = i+"-"+(i1+1)+"-"+i2;
             }
                 myDate.setText(date);
         }
     });

     next=(Button)findViewById(R.id.btnNext);
     next.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent=new Intent(Fifth.this,Seventh.class);
             intent.putExtra("datetosearch", d);
             startActivity(intent);
         }
     });

        //remaining_income();

    }


    public void remaining_income()
    {
        double remaining;
        third t=new third();
        if(t.i<=t.result)
        {
            remaining=t.result-t.i;
            Toast.makeText(this, "Remaining Income"+remaining, Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this, "Expense is more than your income", Toast.LENGTH_SHORT).show();

    }
}
