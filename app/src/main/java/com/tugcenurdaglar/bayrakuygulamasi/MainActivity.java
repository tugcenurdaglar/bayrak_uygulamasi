package com.tugcenurdaglar.bayrakuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private Button buttonBasla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonBasla = findViewById(R.id.buttonBasla);

        veritabaniKopyala();

        buttonBasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, QuizActivity.class));

            }
        });
    }
    public void veritabaniKopyala(){ //bu metod uygulama ilk açıldığında veri tabanımızı kopyalayacak
        DatabaseCopyHelper helper = new DatabaseCopyHelper(this);

        //helper.createDataBase(); bu bizi try catch yapmaya zorluyor,
        //ampule tıklayıp sağlayalım
        try {
            helper.createDataBase();
        } catch (IOException e) {
            e.printStackTrace();
        }

        helper.openDataBase();

    }
}