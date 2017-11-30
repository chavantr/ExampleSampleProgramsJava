package com.example.tchavan.examplesampleprogramsjava;

import android.support.annotation.NonNull;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ReverseString extends AppCompatActivity {

    //region Filed Declaration

    private EditText txtReverseString;
    private TextView lblResult;
    private String reverse = "";

    //endregion Filed Declaration

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_string);
        findViewById(R.id.btnReverse).setOnClickListener(reverseString());
        txtReverseString = (TextInputEditText) findViewById(R.id.txtInput);
        lblResult = (TextView) findViewById(R.id.lblResult);
    }

    @NonNull
    private View.OnClickListener reverseString() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblResult.setText(reverseString(txtReverseString.getText().toString()));
            }
        };
    }

    private String reverseString(String inputString) {

        if (inputString.length() == 1) {
            return inputString;
        } else {
            reverse += inputString.charAt(inputString.length() - 1)
                    + reverseString(inputString.substring(0, inputString.length() - 1));
            return reverse;
        }
    }


}
