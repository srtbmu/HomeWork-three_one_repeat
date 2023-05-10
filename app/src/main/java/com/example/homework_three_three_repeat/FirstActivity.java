package com.example.homework_three_three_repeat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
String FirstName,FirstSurname,FirstAge;
TextView TextName,TextSurname,TextAge;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        FirstName = getIntent().getStringExtra("EditName");
        FirstSurname = getIntent().getStringExtra("EditSurName");
        FirstAge = getIntent().getStringExtra("EditAge");
        findViewsFirst();
        TextName.setText(FirstName);
        TextSurname.setText(FirstSurname);
        TextAge.setText(FirstAge);}

    private void findViewsFirst() {
        TextName = findViewById(R.id.nameTextView);
        TextSurname = findViewById(R.id.surnameTextView);
        TextAge = findViewById(R.id.ageTextView);}}