package com.example.abhaygoyal.mobileorder;

/**
 * Created by Abhay Goyal on 07-Jun-16.
 */

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.content.ContentValues;

public class detailsHandling  extends SQLiteOpenHelper{

    public static final int DATABASE_VERSION= 1;
    public static final String DATABASE_NAME="record.db";
    public static final String TABLE_NAME="Login";
    public static final String COLUMN_ID="_id";
    public static final String COLUMN_NAME="Name";
    public static final String COLUMN_PASS="Password";

    public detailsHandling(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query="CREATE TABLE "+ TABLE_NAME +"("+
                COLUMN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
                COLUMN_NAME+" TEXT, "+
                COLUMN_PASS+" TEXT, "+
                ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME );
        onCreate(db);
    }

    public void addDetail(details detail){
        ContentValues values=new ContentValues();
        values.put(COLUMN_NAME, detail.get_name());
        values.put(COLUMN_PASS,detail.get_password());

        SQLiteDatabase db=getWritableDatabase();
        db.insert(TABLE_NAME, null, values);
        db.close();

    }





}
