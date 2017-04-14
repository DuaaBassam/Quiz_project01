package net.androidbootcamp.quiz_project01;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by مركز الخبراء on 04/14/2017.
 */

public class Database extends SQLiteOpenHelper {

    public static final String DATABASE ="Student.db";
    public static final String TABLE_Stu ="Student_table";
    public static final String col_1 ="ID";
    public static final String col2 ="NAME";





    public Database(Context context) {
        super(context, DATABASE, null, 2);
        SQLiteDatabase  sqLiteDatabase = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table"+TABLE_Stu+"ID INTEGER PRIMARY KEY AUTOINCERMENT,NAME TEXT,SUBNAME TEXT ,MARKS INTEGER");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS"+TABLE_Stu);
        onCreate(sqLiteDatabase);

    }
}
