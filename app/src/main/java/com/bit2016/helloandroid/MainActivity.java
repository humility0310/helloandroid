package com.bit2016.helloandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("clicked1!!!");
                Log.d("MainActivity","clicked2!!");
                Log.e("MainActivity","clicked3!!");

                Toast.makeText(MainActivity.this, "준현아, 상욱아\n정신차리자.", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, NewActivity.class);

                startActivity(intent);

            }
        });
    }
}
