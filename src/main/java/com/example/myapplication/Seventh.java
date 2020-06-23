package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.SearchManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.os.Bundle;
import android.os.strictmode.SqliteObjectLeakedViolation;
import android.provider.ContactsContract;
import android.util.Log;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static android.transition.Fade.IN;
import static com.example.myapplication.Databasehelper.TABLE_NAME;
import static com.example.myapplication.Databasehelper.col_3;

public class Seventh extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        Databasehelper db = new Databasehelper(getApplicationContext());
        SQLiteDatabase sq = db.getReadableDatabase();

        Intent i = getIntent();
        String d = i.getStringExtra("datetosearch");



        String query1 = "Select * from expense_Table where Date = '" + d + "'";
        Cursor csr3 = (Cursor) sq.rawQuery(query1, null);
        if (csr3.getCount() == 0) {
          showmethod("Error","nothing is being found");
            //Toast.makeText(Seventh.this, "Nothing is being found", Toast.LENGTH_SHORT).show();
        }
        else {
            StringBuffer buffer = new StringBuffer();
            while (csr3.moveToNext()) {
                buffer.append("Expend on " + csr3.getString(0) + "\n");
                buffer.append("Amount spend is " + csr3.getString(1) + "\n");
                buffer.append("Date:" + csr3.getString(2) + "\n");
            }

        showmethod("Data",buffer.toString());}

    }

    public void showmethod(String title, String Message) {
        androidx.appcompat.app.AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}


