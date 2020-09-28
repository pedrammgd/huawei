package com.example.huawei1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView textView,textView3,textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//         pedram
//        aaaaaa
//         bbbbb

        textView = findViewById(R.id.textView);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);


        Bundle bundle = getIntent().getExtras();

        if (bundle == null) {


            return;
        } else {
            String firstname = bundle.getString(MainActivity.NAME);
            String lastname = bundle.getString(MainActivity.Last);

            String email = bundle.getString("email");


            textView4.setText(email);
            textView.setText(firstname);
            textView3.setText(lastname);
        }
    }
    public void btnBack(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);
    }
}
