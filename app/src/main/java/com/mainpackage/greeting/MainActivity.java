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

            // Displaying toast
            Toast.makeText(MainActivity.this, "Hello " + name, Toast.LENGTH_LONG).show();
        });


    }
}
