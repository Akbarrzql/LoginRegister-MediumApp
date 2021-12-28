package com.example.androidpertama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login_screen extends AppCompatActivity {

    Button btn_Login;
    View email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        email = findViewById(R.id.TextEmailAddress);
        btn_Login = findViewById(R.id.button_continue);

        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login_screen.this, "Login Berhasil", Toast.LENGTH_LONG).show();


//                if (email.equals("akbarrizqullah228@gmail.com")) {
//                    Toast.makeText(Login_screen.this, "Login Berhasil", Toast.LENGTH_LONG).show();
//                }else {
//                    Toast.makeText(Login_screen.this,"Login Gagal",Toast.LENGTH_LONG).show();
//                }
            }
        });

    }
}