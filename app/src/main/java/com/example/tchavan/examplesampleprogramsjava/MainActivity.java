package com.example.tchavan.examplesampleprogramsjava;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            findViewById(R.id.btnReverseString).setOnClickListener(reverseStringListener());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @NonNull
    private View.OnClickListener reverseStringListener() throws Exception {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ReverseString.class);
                startActivity(intent);

            }
        };
    }
}
