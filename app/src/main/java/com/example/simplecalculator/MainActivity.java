package com.example.simplecalculator;

import static android.text.TextUtils.isEmpty;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    int num1,num2;
    String msg;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private  boolean getnumbers(){
        e1=(EditText) findViewById(R.id.num1_input);
        e2=(EditText) findViewById(R.id.num2_input);
        String s1=e1.getText().toString();
        String s2=e2.getText().toString();
        if((isEmpty(e1.getText().toString())) || (isEmpty(e1.getText().toString())) ){
            return false;
        }
        else{
            num1=Integer.parseInt(s1);
            num2=Integer.parseInt(s2);
            return true;
        }

    }

    public void add(View view){
        if(getnumbers())
        {
            int res=num1+num2;
            String a=Integer.toString(res);
            msg="";
            msg=msg+"The addition of the numbers is "+a;
            TextView result=(TextView) findViewById(R.id.result_text);
            result.setText(msg);
        }
        else{
            Toast toast=Toast.makeText(this,"Please enter the numbers", Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    public void sub(View view){
        if(getnumbers())
        {
            int res=num1-num2;
            String a=Integer.toString(res);
            msg="";
            msg=msg+"The subtraction of the numbers is "+a;
            TextView result=(TextView) findViewById(R.id.result_text);
            result.setText(msg);
        }
        else{
            Toast toast=Toast.makeText(this,"Please enter the numbers", Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    public void product(View view){
        if(getnumbers()){
            int res=num1*num2;
            String a=Integer.toString(res);
            msg="";
            msg=msg+"The multiplication of the numbers is "+a;
            TextView result=(TextView) findViewById(R.id.result_text);
            result.setText(msg);
        }
        else{
            Toast toast=Toast.makeText(this,"Please enter the numbers", Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    public void div(View view){
        if(getnumbers()){
            int res=num1/num2;
            String a=Integer.toString(res);
            msg="";
            msg=msg+"The quotient of division  of the numbers is "+a;
            TextView result=(TextView) findViewById(R.id.result_text);
            result.setText(msg);
        }

        else{
            Toast toast=Toast.makeText(this,"Please enter the numbers", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void modulo(View view){
        if(getnumbers()){
            int res=num1%num2;
            String a=Integer.toString(res);
            msg="";
            msg=msg+"The remainder of division  of the numbers is "+a;
            TextView result=(TextView) findViewById(R.id.result_text);
            result.setText(msg);
        }


        else{
            Toast toast=Toast.makeText(this,"Please enter the numbers", Toast.LENGTH_SHORT);
            toast.show();
        }
    }




    public void reset(View view){
        e1.setText(null);
        e2.setText(null);
        TextView result=(TextView) findViewById(R.id.result_text);
        result.setText("Result");
    }




}