package com.example.android.studycase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    private Button btnMin, btnPlus;
    private TextView detail, Judul, indikatorLbl;
    private ImageView logo, indikatorPic;
    private int level = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        btnPlus = findViewById(R.id.buttonPlus); //ikon untuk  menambah
        btnMin = findViewById(R.id.buttonMinus); //ikon untuk mengurangi
        logo = findViewById(R.id.detailLogo); //gambar logo di bagian atas
        indikatorPic = findViewById(R.id.tandaBotol); //gambar indikator
        detail = findViewById(R.id.detailLengkap); //lipsum
        Judul = findViewById(R.id.judulDetail); //judul
        indikatorLbl = findViewById(R.id.NomorIndikator); //angka boto
    }

}
