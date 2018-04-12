package br.com.fiap.trabalho.rm77786;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Fernando Meyer
 */

public class BD extends SQLiteOpenHelper {

    public static final String NOME_DO_BANCO = "pizzaBD";
    public static final Integer VERSAO = 1;
    public static final String TB_LOG = "log";

    public BD(Context context) {
        super(context, NOME_DO_BANCO, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //CRIANDO  TABELA DE LOG
        String sql = "CREATE TABLE " + TB_LOG + " (" +
                "`id`	INTEGER PRIMARY KEY AUTOINCREMENT," +
                "`descricao` TEXT," +
                "`data` INTEGER" +
                ");";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS TB_LOG");
        onCreate(db);
    }

    public void gravarLog(Log log){
        SQLiteDatabase db = getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put("descricao", log.getDescricao());
        cv.put("data", log.getData());

        db.insert(TB_LOG, null, cv);

    }
}

