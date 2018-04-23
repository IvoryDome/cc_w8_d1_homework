package com.android.ryan.w8d1homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText enterTextEditText;
    private TextView displayWordCountTextView;
    private Button countWordsButton;
    private WordCount wordsToBeCounted;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterTextEditText = findViewById( R.id.enterTextEditText );
        countWordsButton = findViewById(R.id.countWordsButton);
        displayWordCountTextView = findViewById(R.id.displayWordCountTextView);

        displayWordCountTextView.setText("Word count will be displayed here :D");
    }

    public void onPressingButton(View button){
        int countWords = WordCount.countWords( enterTextEditText.getText().toString() );
        displayWordCountTextView.setText( countWords + " words");
    }






}
