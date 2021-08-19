package com.crumlabs.adelhngi8;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    TextView textOut;
    EditText fieldIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textOut = (TextView) findViewById(R.id.textOut);
        fieldIn = (EditText) findViewById(R.id.fieldIn);


    }



    public void talk(View view){
        String words = fieldIn.getText().toString();
        textOut.setText(words);
        Toast.makeText(this, words, Toast.LENGTH_LONG).show();
    }


}