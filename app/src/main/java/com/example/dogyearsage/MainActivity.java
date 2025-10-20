package com.example.dogyearsage;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.dogyearsage.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding _binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        _binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(_binding.getRoot());

        _binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (_binding.editTextNumber.getText().toString().isEmpty()) {
                    _binding.textView2.setText("Please enter your dog's age");
                    return;
                } else {
                    int dogAge = Integer.parseInt(_binding.editTextNumber.getText().toString());

                    int humanAge = dogAge * 7;
                    String age = humanAge + " years old";
                    _binding.textView2.setText(age);
                }

            }
        });


    }
}