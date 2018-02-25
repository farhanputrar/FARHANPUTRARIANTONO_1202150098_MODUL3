package com.example.android.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private String usr;
    private String pswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login (View view){
        EditText username = (EditText) findViewById(R.id.editusr);
        EditText password = (EditText) findViewById(R.id.editpswd);
        if (usr.equals("EAD")) {
            if (pswd.equals("MOBILE")) {
                Toast.makeText(this, "BERHASIL", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(this, "GAGAL, SILAHKAN CEK KEMBALI USERNAME DAN PASSWORD", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
