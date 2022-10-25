package com.vyx.withjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onBtnClick(View view){

        EditText edtTxtFirstName = findViewById(R.id.edtTxt_FirstName);
        EditText edtTxtLastName = findViewById(R.id.edtTxt_LastName);
        EditText edtTxtEmail = findViewById(R.id.edtTxt_Email);

        TextView tv_FirstName = findViewById(R.id.tv_OutputFirstName);
        TextView tv_LastName = findViewById(R.id.tv_OutputLastName);
        TextView tv_Email = findViewById(R.id.tv_OutputEmail);

        tv_FirstName.setText("First Name: "+ edtTxtFirstName.getText().toString());
        tv_LastName.setText("Last Name: "+edtTxtLastName.getText().toString());
        tv_Email.setText("Email: "+edtTxtEmail.getText().toString());


    }
}