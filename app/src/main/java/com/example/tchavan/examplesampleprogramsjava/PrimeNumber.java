package com.example.tchavan.examplesampleprogramsjava;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PrimeNumber extends AppCompatActivity {


    //region Field Declaration

    private EditText txtPrimeNumber;
    private TextView lblResult;
    private TextView lblSourceCode;


    //endregion Field Declaration


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_number);
        txtPrimeNumber = findViewById(R.id.tilInput);
        lblResult = findViewById(R.id.lblResult);
        lblSourceCode = findViewById(R.id.lblSourceCode);
        findViewById(R.id.btnPrimeNumber).setOnClickListener(onPrimeNumberListener());
    }

    @NonNull
    private View.OnClickListener onPrimeNumberListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!txtPrimeNumber.getText().toString().isEmpty()) {
                    checkPrimeNumber(Integer.parseInt(txtPrimeNumber.getText().toString()));
                }
            }
        };
    }

    private void checkPrimeNumber(int inputNumber) {
        int i; //Iterate start purpose
        int m; // Iterate end purpose
        int flag = 0;
        m = inputNumber / 2;
        if (inputNumber != 0 || inputNumber != 1) {
            for (i = 2; i <= m; i++) {
                if (inputNumber % i == 0) flag = 1;
                break;
            }
        }
        if (flag == 0) lblResult.setText("Output : " + inputNumber + " is prime number");
    }
}
