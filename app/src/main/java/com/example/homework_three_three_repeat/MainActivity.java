package com.example.homework_three_three_repeat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 AppCompatButton buttonForNavigation;
 EditText EditTextName,EditTExtSurname,EditTextAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        setClick();}

    private void setClick() {
    buttonForNavigation.setOnClickListener(v -> navigateToFirst(EditTextName.getText().toString(),EditTExtSurname.getText().toString(),EditTextAge.getText().toString()));}

    private void navigateToFirst(String name ,String surname ,String age){
        Intent intent = new Intent(MainActivity.this,FirstActivity.class);
        intent.putExtra("EditName",name);
        intent.putExtra("EditSurName",surname);
        intent.putExtra("EditAge",age);
        startActivity(intent);}

    private void findView(){
        buttonForNavigation = findViewById(R.id.navigationButton);
        EditTextName = findViewById(R.id.nameEditText);
        EditTExtSurname = findViewById(R.id.surnameEditTExt);
        EditTextAge = findViewById(R.id.ageEditTExt);}}