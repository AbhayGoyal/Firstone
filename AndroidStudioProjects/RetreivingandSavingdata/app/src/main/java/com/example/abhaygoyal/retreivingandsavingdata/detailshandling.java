package com.example.abhaygoyal.retreivingandsavingdata;

/**
 * Created by Abhay Goyal on 30-Mar-16.
 */

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;
import android.util.Log;


public class detailshandling extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION= 1;
    public static final String DATABASE_NAME="namerecord.db";
    public static final String TABLE_NAME="names";
    public static final String COLUMN_ID="_id";
    public static final String COLUMN_NAME="Name";
    public static final String COLUMN_AGE="Age";
    public static final String COLUMN_COLLEGE="College";

    public detailshandling(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query="CREATE TABLE "+ TABLE_NAME +"("+
                    COLUMN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
                    COLUMN_NAME+" TEXT, "+
                    COLUMN_AGE+" INTEGER, "+
                    COLUMN_COLLEGE+" TEXT "+
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
        values.put(COLUMN_AGE,detail.get_age());
        values.put(COLUMN_COLLEGE,detail.get_college());

        SQLiteDatabase db=getWritableDatabase();
        db.insert(TABLE_NAME, null, values);
        db.close();

    }

    public String databasetoString(){

        String dbString=new String();
        SQLiteDatabase db=getWritableDatabase();
        String query="SELECT * FROM "+TABLE_NAME+";";
        Cursor c=db.rawQuery(query,null);
        c.moveToFirst();
        while(!c.isAfterLast()){
            if(c.getString(c.getColumnIndex(COLUMN_NAME))!= null){
                dbString +=c.getString(c.getColumnIndex(COLUMN_NAME));
                dbString +="\n";
                c.moveToNext();
            }
        }
        db.close();
        return dbString;
    }
}
















