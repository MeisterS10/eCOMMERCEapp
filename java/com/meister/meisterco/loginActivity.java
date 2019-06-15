package com.meister.meisterco;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
    private EditText InputNumber,InputPassword;
    private Button LoginButton;
    private ProgressDialog loadingbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       LoginButton=(Button)findViewById(R.id.login_btn);

        InputPassword=(EditText)findViewById(R.id.login_passcode);
       InputNumber=(EditText)findViewById(R.id.loginPhoneNumberInput);
        loadingbar=new ProgressDialog(this);


        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });



    }

    private void loginUser() {

        String phone=InputNumber.getText().toString();
        String password=InputPassword.getText().toString();

       if (TextUtils.isEmpty(phone))
        {
            Toast.makeText(this, "Please provide your phone number", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(password))
        {
            Toast.makeText(this, "Please provide your password", Toast.LENGTH_SHORT).show();
        }
        else
       {
           loadingbar.setTitle("Login Account");
           loadingbar.setMessage("Please wait while we are checking your credentials");
           loadingbar.setCanceledOnTouchOutside(false);
           loadingbar.show();
       }
    }
}
