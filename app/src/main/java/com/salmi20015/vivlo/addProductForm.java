package com.salmi20015.vivlo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class addProductForm extends AppCompatActivity {
    private EditText productName ,productDescription,productPrice,productquantity,productBrand;
    private Button BackButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_product_form);
        productName= findViewById(R.id.product_name);
        productDescription= findViewById(R.id.product_description);
        productPrice= findViewById(R.id.product_price);
        productquantity=findViewById(R.id.product_quantity);
        productBrand= findViewById(R.id.product_brand);

    }
}