package com.tugcenurdaglar.bayrakuygulamasi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Veritabani extends SQLiteOpenHelper {
    public Veritabani(@Nullable Context context) {
        super(context, "bayrakquiz.sqlite", null, 1);
        //super(context, name, factory, version); name bize veritabanımızın ismini soruyor
        //factory e null dedik version a 1 dedik
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS \"bayraklar\" (\n" +
                "\t`bayrak_id`\tINTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "\t`bayrak_ad`\tTEXT,\n" +
                "\t`bayrak_resim`\tTEXT\n" +
                ")");

        //eğer dışardan hazır bir tab lo kullanıyorsam bunu kopyaladığımda
        // IF NOT EXISTS yazmalıyız anlamı: yoksa bunu oluştur demek

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS bayraklar"); // bi sıkıntı olursa tabloyu sil demek bu satır.
        onCreate(db);

    }
   /*zip dosyasından veritabanının bulunduğu klasörü dışarı çıkarmıştık
   * dışarı çıkardığımız klasörün içindeki DatabaseCopyHelper ı kopyaladık ve
   * com.tugcenurdaglar.bayrakuygulamasi paketimizin içine yapıştırdık
   * sonra app -> new -> folder -> assets folder dedik ve finish dedik,
   * assets oluşmuş oldu, bu assets e, dışarı çıkardığımız klasör içindeki
   * bayrakquiz i yapıştırdık (db name inin aynı olmasına dikkat et)*/
}
