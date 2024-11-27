package com.salmi20015.vivlo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class home extends AppCompatActivity {
    private Button addProduct ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        addProduct=findViewById(R.id.add_Product_home);
       addProduct.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                      goAddproduct();

                   }

               }
             );
    }

        protected void goAddproduct(){
        Intent i =new Intent(home.this,addProductActivity.class);
        startActivity(i);
    }


}