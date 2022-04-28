package com.example.tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        TextView welcome = findViewById(R.id.Welcome);
        welcome.setText("Welcome to My Pets");
        TextView login = findViewById(R.id.log_in);
        login.setText("Please Log in here");
        EditText email = findViewById(R.id.editTextTextEmailAddress);
        EditText password = findViewById(R.id.editTextTextPassword);
        button.setText("Log in");
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                button.setVisibility(View.INVISIBLE);

            }
        });
    }

}