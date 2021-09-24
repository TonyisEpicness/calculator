package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public void add(View view) {
        EditText number1 = (EditText) findViewById(R.id.firstNumber);
        EditText number2 = (EditText) findViewById(R.id.secondNumber);
        int value1 = Integer.parseInt(number1.getText().toString());
        int value2 = Integer.parseInt(number2.getText().toString());
        goToActivity2(value1+value2);
    }
    public void subtract(View view) {
        EditText number1 = (EditText) findViewById(R.id.firstNumber);
        EditText number2 = (EditText) findViewById(R.id.secondNumber);
        int value1 = Integer.parseInt(number1.getText().toString());
        int value2 = Integer.parseInt(number2.getText().toString());
        goToActivity2(value1-value2);
    }
    public void multiply(View view) {
        EditText number1 = (EditText) findViewById(R.id.firstNumber);
        EditText number2 = (EditText) findViewById(R.id.secondNumber);
        int value1 = Integer.parseInt(number1.getText().toString());
        int value2 = Integer.parseInt(number2.getText().toString());
        goToActivity2(value1*value2);
    }
    public void divide(View view) {
        EditText number1 = (EditText) findViewById(R.id.firstNumber);
        EditText number2 = (EditText) findViewById(R.id.secondNumber);
        int value1 = Integer.parseInt(number1.getText().toString());
        int value2 = Integer.parseInt(number2.getText().toString());
        goToActivity2(value1/value2);
    }

    private void goToActivity2(int value) {
        Intent intent = new Intent(this, MainActivity2.class);
        Integer new_int = value;
        intent.putExtra("value", new_int.toString());
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}