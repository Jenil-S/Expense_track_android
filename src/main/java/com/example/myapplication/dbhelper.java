package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class dbhelper extends SQLiteOpenHelper {
    public static final String Database_Name="Daily_Expenses.db";
    public static final String table_name="income_table";
    public static final String col_1="income";

    public dbhelper(Context context) {
        super(context, Database_Name, null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("create table "+table_name+" (income TEXT) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+table_name);
        onCreate(sqLiteDatabase);

    }

//    public boolean Insertdata(String income)
//    {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues contentValues= new ContentValues();
//        contentValues.put(col_4,income);
//        long result = db.insert(table_name,null,contentValues);
//        if(result == -1) {
//            return false;
//        }
//        else
//            return true;
//
//    }


}