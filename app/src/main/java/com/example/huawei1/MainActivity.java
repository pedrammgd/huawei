package com.example.huawei1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String ACTIVITY = "Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(ACTIVITY,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Activity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Activity","onResume");
    }

<<<<<<< HEAD
    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Activity","onPause");
    }
=======
//         System.out.print("pedram");
>>>>>>> 53c16a8748b4cb08f1cc685c821402330f82cb51

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Activity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Activity","onDestroy");
    }
<<<<<<< HEAD

}
=======
}
>>>>>>> 53c16a8748b4cb08f1cc685c821402330f82cb51
