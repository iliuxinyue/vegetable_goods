package com.example.yuanann.vegetable_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2019/10/30 0030.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DB_NAME="vegetable";//定义数据库名
    private static final String TABLE_NAME="tb_flower";//定义表名
    private static final String CREATE_TABLE="create table "+TABLE_NAME+"( _id integer primary key autoincrement,fname text,type text,info text)";//创建表
    private static final String TABLE_NAME2="myorder";//定义表名
    private static final String CREATE_TABLE2="create table "+TABLE_NAME2+"(_id integer primary key autoincrement,g_id,g_photo,g_name,g_type,g_price,g_num,g_check)";//创建表
    private static final String TABLE_NAME3="mygoods";//定义表名
    private static final String CREATE_TABLE3="create table "+TABLE_NAME3+"(_id integer primary key autoincrement,g_photo,g_name,g_type,g_price)";//创建表

    //创建SQLiteDatabase实例
    private SQLiteDatabase db;
    //构造方法
    public DatabaseHelper(Context context){
        super(context,DB_NAME,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //实例化SQLiteDatabase
        db=sqLiteDatabase;
        //创建表
        db.execSQL(CREATE_TABLE);
        db.execSQL(CREATE_TABLE2);
        db.execSQL(CREATE_TABLE3);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        db=sqLiteDatabase;
        //创建表
        db.execSQL("DROP TABLE IF EXISTS tb_flower");
        db.execSQL("DROP TABLE IF EXISTS myorder");
        db.execSQL("DROP TABLE IF EXISTS mygoods");;
        onCreate(db);

    }
    //添加数据
    public void insert(ContentValues values){
        //将数据库设置为可读写的
        db=getWritableDatabase();
        db.insert(TABLE_NAME,null,values);
        db.close();
    }
    //添加订单数据
    public void insertVege(ContentValues values){
        //将数据库设置为可读写的
        db=getWritableDatabase();
        db.insert(TABLE_NAME2,null,values);
        db.close();
    }
    //添加数据
    public void insertAll(ContentValues values){
        //将数据库设置为可读写的
        db=getWritableDatabase();
        db.insert(TABLE_NAME3,null,values);
        db.close();
    }
    //修改数据
//    public void update(Data data){
//        db=getWritableDatabase();
//        //获得对象的属性
//        ContentValues values=new ContentValues();
//        values.put("type",data.getContent());
//        db.update(TABLE_NAME,values,"_id=?",new String[]{data.getId()+""});
//        db.close();
//    }
    //删除数据
    public void del(int id){
        db=getWritableDatabase();
        db.delete(TABLE_NAME,"_id=?",new String[]{String.valueOf(id)});
        db.close();
    }
    //查询数据
    public Cursor query(){
        db=getWritableDatabase();
        Cursor cursor=db.query(TABLE_NAME,null,null,null,null,null,"_id desc");
        //db.close();
        return cursor;
    }

    //根据id查询数据
    public Cursor queryid(String mykey){
        db=getWritableDatabase();
        Cursor cursor=db.query(TABLE_NAME3,null,"g_name like ?", new String[] { "%"+mykey+"%" },null,null,"_id desc");
        //db.close();
        return cursor;
    }

    //查询订单的数据
    public Cursor queryorder(){
        db=getWritableDatabase();
        Cursor cursor=db.query(TABLE_NAME2,null,null,null,null,null,"_id desc");
        //db.close();
        return cursor;
    }

    public long allCaseNum( ){
        db=getWritableDatabase();
        Cursor cursor = db.rawQuery("select count(_id) from mygoods",null);
        cursor.moveToFirst();
        int count = cursor.getInt(0);
        cursor.close();
        return count;
    }


}

