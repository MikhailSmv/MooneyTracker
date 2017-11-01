package com.loftscool.mooneytracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText titleEdit = findViewById(R.id.name);
        final ImageButton addButton = findViewById(R.id.add);
        final EditText priceEdit = findViewById(R.id.price);
        final CharSequence[] str1 = new CharSequence[20];
        final CharSequence[] str2 = new CharSequence[20];
        titleEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               str1[0] = charSequence;
               if ((str1.length != 0)&(str2.length !=0)) addButton.setClickable(true);
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        priceEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                str2[0] = charSequence;
                if ((str1.length != 0)&(str2.length !=0)) addButton.setClickable(true);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
