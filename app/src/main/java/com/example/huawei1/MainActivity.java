package com.example.huawei1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public static final String MYLOG = "Mylog";
    public static final String NAME = "name";
    public static final String Last = "lastN";



    TextView textView,textView2;
    Button button,button2;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//         pedram
//        fdgdfgdfgdf
//         1221222121



        editText = findViewById(R.id.editText);

        button = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        textView = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);



        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra(NAME,"pedram");
                intent.putExtra(Last,"mojarad");


                startActivity(intent);
            }
        });


        button2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                textView2.setText(textView.getText());
                return false;
            }
        });







        Log.e(MYLOG,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(MYLOG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(MYLOG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(MYLOG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(MYLOG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(MYLOG,"onDestroy");
    }

    public void btn1(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        String email = editText.getText().toString();
        intent.putExtra("email",email);
        startActivity(intent);
    }

    public void google(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("h"));
        startActivity(intent);
    }
}
