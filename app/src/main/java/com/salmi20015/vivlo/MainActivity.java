package com.salmi20015.vivlo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText emailEdittext , userEdittext, passworldEdittext, phoneEditText;
    private Button buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        emailEdittext= findViewById(R.id.putEmail);
        userEdittext= findViewById(R.id.putFullName);
        passworldEdittext=findViewById(R.id.putPassword);
        phoneEditText=findViewById(R.id.putPhone);
        buttonSignUp =findViewById(R.id.signUpButton);

        buttonSignUp.setOnClickListener(new View.OnClickListener(){

          @Override
           public void onClick(View view) {
            String username =userEdittext.getText().toString();
            String email = emailEdittext.getText().toString();
            String password = passworldEdittext.getText().toString();
              int phonenumber = Integer.parseInt(phoneEditText.getText().toString());
              //ne9ederou nzidou des condition 3ela email phone ...

              goHome();
              User User1= new User(username,password,email,phonenumber);
         }

        }
      );
    }
    protected void goHome(){
       Intent i =new Intent( MainActivity.this, home.class);
       startActivity(i);
    }

}

