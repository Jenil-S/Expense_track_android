package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.strictmode.SqliteObjectLeakedViolation;
import android.widget.TextView;

public class Databasehelper extends SQLiteOpenHelper {

    public static final String Database_Name="Daily_Expenses.db";
    public static final String TABLE_NAME="expense_Table";
    public static final String table_name="income_table";
    public static final String col_1="expend";
    public static final String col_2="amount";
    public static final String col_3="Date";
    public static final String col_4="income";

    public Databasehelper(Context context) {
        super(context, Database_Name, null,1);
        //SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+" (expend TEXT,amount TEXT,Date DATE) ");
        db.execSQL("create table "+table_name+" (income TEXT) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+table_name);
        onCreate(db);

    }
    public boolean insertdata(String expend,String amount,String Date){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(col_1,expend);
        contentValues.put(col_2,amount);
        contentValues.put(col_3,Date);
        long result = db.insert(TABLE_NAME,null,contentValues);
        if(result == -1) {
            return false;
        }
        else
            return true;

    }

    public boolean Insertdata(String income)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(col_4,income);
        long result = db.insert(table_name,null,contentValues);
        if(result == -1) {
            return false;
        }
        else
            return true;

    }
    public Cursor getAlldata()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from "+TABLE_NAME ,null);
        return res;
    }


}

