package com.hmcoding.paindromeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewStatus;
    private EditText editTextInputWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewStatus = findViewById(R.id.textViewStatus);
        editTextInputWord = findViewById(R.id.editTextTextInputWord);
    }

    public void buttonCheckPalindrome(View view){

        char[] charInput = editTextInputWord.getText().toString().toCharArray();
        int intLength = charInput.length;

        boolean isPalindrome = true;

        for (int i=0; i<intLength/2; i++){
            if (charInput[i] !=charInput[intLength-1-i]){
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome){
            textViewStatus.setText("Palindrome");
        }
        else {
            textViewStatus.setText("NOT Palindrome");
        }


    }

}