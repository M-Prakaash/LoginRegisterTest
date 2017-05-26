package com.example.preethi.logintest;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.ProgressDialog;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText uname,pass;
    Button log,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname = (EditText)findViewById(R.id.editText);
        pass = (EditText)findViewById(R.id.editText2);
        log = (Button)findViewById(R.id.button);
        signup = (Button)findViewById(R.id.button3);

       }

       public void OnLogin(View view){

        String username = uname.getText().toString();
        String passwrd= pass.getText().toString();
        String type = "login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, username, passwrd);
               }
    public void GoReg(View view){
        startActivity(new Intent(this,Register.class));
    }
}
