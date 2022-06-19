package com.nakul.loginpage;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText textUserName,textPassword;
    Button loginBtn,registerBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textUserName=findViewById(R.id.textUserName);
        textPassword=findViewById(R.id.textPassword);
        loginBtn=findViewById(R.id.loginBtn);
        registerBtn=findViewById(R.id.registerBtn);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                View registerView=getLayoutInflater().inflate(R.layout.register,null);
                EditText registerName=registerView.findViewById(R.id.textRegisterName);
                EditText registerPassword=registerView.findViewById(R.id.textRegisterPassword);
                EditText registerEmailId=registerView.findViewById(R.id.textRegisterEmailId);
                EditText registerPhoneNumber=registerView.findViewById(R.id.textRegisterPhoneNumber);
                Button registerSave=registerView.findViewById(R.id.registerSaveBtn);
                Button registerCancel=registerView.findViewById(R.id.registerCancelBtn);

                builder.setView(registerView);
                AlertDialog dialog=builder.create();
                dialog.show();
            }
        });

    }
}