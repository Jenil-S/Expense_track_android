package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

public class Fourth extends AppCompatActivity {
    Databasehelper mydb;
    double i1;
    double g;
    double i;
    double d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        mydb = new Databasehelper(this);
       Cursor res = mydb.getAlldata();
       if(res.getCount() == 0)
       {
//           showmethod("Error","nothing is being found");
           Toast.makeText(Fourth.this, "Nothing is being found", Toast.LENGTH_SHORT).show();
       }
       StringBuffer buffer=new StringBuffer();
       while(res.moveToNext()){

           buffer.append("Expend on "+res.getString(0)+"\n");
           buffer.append("Amount spend is "+res.getString(1)+"\n");
           buffer.append("Date:"+res.getString(2)+"\n");
       }
       showmethod("Data",buffer.toString());
        g=getTotalincome();
       // Toast.makeText(this, "i"+g, Toast.LENGTH_SHORT).show();
        d = getTotalOfAmount();
        remaining_income();

    }
    public void showmethod(String title,String Message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }


    private double getTotalincome() {
        Databasehelper db = new Databasehelper(getApplicationContext());
        SQLiteDatabase sq =db.getReadableDatabase();
        Cursor c = sq.rawQuery("SELECT SUM(income) FROM income_Table", null);
        c.moveToFirst();
        i1 = c.getDouble(0);
        c.close();
        Toast.makeText(this, "Total income is"+i1, Toast.LENGTH_SHORT).show();
        return i1;
    }

    private double getTotalOfAmount() {
        Databasehelper db = new Databasehelper(getApplicationContext());
        SQLiteDatabase sq =db.getReadableDatabase();
        Cursor c = sq.rawQuery("SELECT SUM(amount) FROM expense_Table", null);
        c.moveToFirst();
        i = c.getDouble(0);
        c.close();
        Toast.makeText(this, "Total Expense is"+i, Toast.LENGTH_SHORT).show();
        return i;
    }

    public void remaining_income()
    {
        double remaining;
       // Toast.makeText(this, "dd", Toast.LENGTH_SHORT).show();
        if(d<=g)
        {
            remaining=g-d;
            Toast.makeText(this, "Remaining Income"+remaining, Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this, "Expense is more than your income", Toast.LENGTH_SHORT).show();

    }
}
