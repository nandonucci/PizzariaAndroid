package br.com.fiap.trabalho.rm77786;

import android.content.Context;

public class GravaLog {

    public static void gravaLog(Context context){
        Log log = new Log(context.getClass().getSimpleName(), (int) System.currentTimeMillis());
        BD db = new BD(context);
        db.gravarLog(log);
    }
}
