package com.train.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Associate the elements from the xml file to the Java code
        TextView textResult = findViewById(R.id.text_result);
        Button button1 = findViewById(R.id.button_1);
        Button button2 = findViewById(R.id.button_2);
        Button button3 = findViewById(R.id.button_3);

        // Let's add an action to the button, by concatenating the number to the text if it is diffrent from 0
        button1.setOnClickListener(v -> {
            if (textResult.getText().toString().equals("0")) {
                textResult.setText("1");
            } else {
                textResult.setText(textResult.getText() + "1");
            }
        });

        button2.setOnClickListener(v -> {
            if (textResult.getText().toString().equals("0")) {
                textResult.setText("2");
            } else {
                textResult.setText(textResult.getText() + "2");
            }
        });

        button3.setOnClickListener(v -> {
            if (textResult.getText().toString().equals("0")) {
                textResult.setText("3");
            } else {
                textResult.setText(textResult.getText() + "3");
            }
        });

        //Iplement the logic for the backspace button
        Button buttonBackspace = findViewById(R.id.button_backspace);
        buttonBackspace.setOnClickListener(v -> {
            String currentText = textResult.getText().toString();
            if (currentText.length() > 1) {
                textResult.setText(currentText.substring(0, currentText.length() - 1));
            } else {
                textResult.setText("0");
            }
        });
    }

}