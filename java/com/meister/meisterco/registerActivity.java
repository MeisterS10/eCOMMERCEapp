package com.meister.meisterco;

import android.app.ProgressDialog;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registerActivity extends AppCompatActivity {
    private Button CreateAccountBtn;
    private EditText Inputusername,Inputphone,Inputpassword;
    private ProgressDialog loadingbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        CreateAccountBtn=(Button)findViewById(R.id.register_btn);
        Inputusername=(EditText) findViewById(R.id.usernameInput);
       Inputphone=(EditText)findViewById(R.id.registerPhoneNumberInput);
       Inputpassword=(EditText)findViewById(R.id.register_passcode);
        loadingbar=new ProgressDialog(this);
        CreateAccountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateAccount();
            }
        });


    }

    private void CreateAccount() {
        String name=Inputusername.getText().toString();
        String phone=Inputphone.getText().toString();
        String password=Inputpassword.getText().toString();


        if (TextUtils.isEmpty(name))
        {
            Toast.makeText(this, "Please provide your name", Toast.LENGTH_SHORT).show();
        }
       else if (TextUtils.isEmpty(phone))
        {
            Toast.makeText(this, "Please provide your phone number", Toast.LENGTH_SHORT).show();
        }
       else if (TextUtils.isEmpty(password))
        {
            Toast.makeText(this, "Please provide your password", Toast.LENGTH_SHORT).show();
        }
       else {
           loadingbar.setTitle("Create Account");
            loadingbar.setMessage("Please wait while we are checking your credentials");
            loadingbar.setCanceledOnTouchOutside(false);
            loadingbar.show();



        }



    }
}
