package com.mainpackage.greeting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etText = findViewById(R.id.etText);
        Button btnHello = findViewById(R.id.btnHello);

        btnHello.setOnClickListener(view -> {
            String name = etText.getText().toString();

            // Displaying the entered name
            Toast.makeText(MainActivity.this, "Hello " + name, Toast.LENGTH_LONG).show();
        });


    }
}


//                2- make the greetings app
//                3- The Counter App
//                4- make a new section with a presentation for the progress    (Progress Presentation)
//                Unit Converter App