package com.example.jerseypoint;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity
{
        private Button createaccountbtn;
        private EditText nameinput,phoneinput,passinput;
        
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        createaccountbtn = findViewById(R.id.register_btn);
        nameinput = findViewById(R.id.register_name_input);
        phoneinput = findViewById(R.id.register_phone_number_input);
        passinput = findViewById(R.id.register_password_input);

        createaccountbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                    CreateAccount();
            }
        });
    }

    private void CreateAccount()
    {
        String name = nameinput.getText().toString();
        String phone = phoneinput.getText().toString();
        String password = passinput.getText().toString();

        if(TextUtils.isEmpty(name))
        {
            Toast.makeText(this,"Please enter the name",Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(phone))
        {
            Toast.makeText(this,"Please enter the phone number",Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(password))
        {
        Toast.makeText(this,"Please enter the password",Toast.LENGTH_LONG).show();
        }
        else
            {
                validatephonenumber(name , phone, password);
            }

    }

    private void validatephonenumber(String name, String phone, String password) {
    }
}
