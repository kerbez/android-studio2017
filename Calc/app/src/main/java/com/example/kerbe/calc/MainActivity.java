package com.example.kerbe.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1, b0, b2, b3, b4, b5, b6, b7, b8, b9, bc, bce, bmin, bplus, bpower, bdiv, bco, beq, broot, bmul;
    TextView et;
    int k = 0;
    float num1 = 0, num2 = 0;
    String s1 = "", s2 = "", ch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = (Button)findViewById(R.id.b0);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        b6 = (Button)findViewById(R.id.b6);
        b7 = (Button)findViewById(R.id.b7);
        b8 = (Button)findViewById(R.id.b8);
        b9 = (Button)findViewById(R.id.b9);
        bc = (Button)findViewById(R.id.bc);
        bce = (Button)findViewById(R.id.bce);
        bmin = (Button)findViewById(R.id.bmin);
        bplus = (Button)findViewById(R.id.bplus);
        bpower = (Button)findViewById(R.id.bpower);
        bdiv = (Button)findViewById(R.id.bdiv);
        bco = (Button)findViewById(R.id.bco);
        beq = (Button)findViewById(R.id.beq);
        broot = (Button)findViewById(R.id.broot);
        bmul = (Button)findViewById(R.id.bmul);
        et = (TextView) findViewById(R.id.et);
    }

    public void on7(View view) {
        et.setText(et.getText() + "7");
        if(k ==0){
            s1 += "7";
        }
        else s2 += "7";
    }

    public void on8(View view) {
         et.setText(et.getText() + "8");
        if(k ==0){
            s1 += "8";
        }
        else s2 += "8";
    }

    public void on9(View view) {
        et.setText(et.getText() + "9");
        if(k ==0){
            s1 += "9";
        }
        else s2 += "9";
    }

    public void onplus(View view) {
        ch = "+";
        if(k == 0){
            et.setText(et.getText() + "+");
            k = 1;
        }
        else{
            //ch = "+"
            if(ch == "+")
                s1 = String.valueOf(Float.valueOf(s1) + Float.valueOf(s2));
            else if(ch == "-")
                s1 = String.valueOf(Float.valueOf(s1) - Float.valueOf(s2));
            else if(ch == "*")
                s1 = String.valueOf(Float.valueOf(s1) * Float.valueOf(s2));
            else if(ch == "/")
                s1 = String.valueOf(Float.valueOf(s1) / Float.valueOf(s2));
            s2 = "";
            et.setText(s1 + "+");
        }
    }

    public void onCE(View view) {
        s1 = "";
        s2 = "";
        k = 0;
        et.setText("");
    }

    public void on4(View view) {
        et.setText(et.getText() + "4");
        if(k ==0){
            s1 += "4";
        }
        else s2 += "4";
    }

    public void on5(View view) {
        et.setText(et.getText() + "5");
        if(k ==0){
            s1 += "5";
        }
        else s2 += "5";
    }

    public void on6(View view) {
        et.setText(et.getText() + "6");
        if(k ==0){
            s1 += "6";
        }
        else s2 += "6";
    }

    public void onmin(View view) {
        if(k == 0){
            et.setText(et.getText() + "-");
            ch = "-";
            k = 1;
        }
        else{
            //ch = "+"
            if(ch == "+")
                s1 = String.valueOf(Float.valueOf(s1) + Float.valueOf(s2));
            else if(ch == "-")
                s1 = String.valueOf(Float.valueOf(s1) - Float.valueOf(s2));
            else if(ch == "*")
                s1 = String.valueOf(Float.valueOf(s1) * Float.valueOf(s2));
            else if(ch == "/")
                s1 = String.valueOf(Float.valueOf(s1) / Float.valueOf(s2));
            s2 = "";
            ch = "-";
            et.setText(s1 + "-");
        }
    }

    public void onroot(View view) {
        if (k == 0){
            s1 = String.valueOf(Math.sqrt(Float.valueOf(s1)));
            et.setText(s1);
        }
        else{
            s2 = String.valueOf(Math.sqrt(Float.valueOf(s2)));
            et.setText(s1 + ch + s2);
        }
    }

    public void on1(View view) {
        et.setText(et.getText() + "1");
        if(k ==0){
            s1 += "1";
        }
        else s2 += "1";
    }

    public void on2(View view) {
        et.setText(et.getText() + "2");
        if(k ==0){
            s1 += "2";
        }
        else s2 += "2";
    }

    public void on3(View view) {
        et.setText(et.getText() + "3");
        if(k ==0){
            s1 += "3";
        }
        else s2 += "3";
    }

    public void onmul(View view) {
        if(k == 0){
            et.setText(et.getText() + "*");
            ch = "*";
            k = 1;
        }
        else{
            //ch = "+"
            if(ch == "+")
                s1 = String.valueOf(Float.valueOf(s1) + Float.valueOf(s2));
            else if(ch == "-")
                s1 = String.valueOf(Float.valueOf(s1) - Float.valueOf(s2));
            else if(ch == "*")
                s1 = String.valueOf(Float.valueOf(s1) * Float.valueOf(s2));
            else if(ch == "/")
                s1 = String.valueOf(Float.valueOf(s1) / Float.valueOf(s2));
            s2 = "";
            ch = "*";
            et.setText(s1 + "*");
        }
    }

    public void onpower(View view) {
        if(k == 0){
            s1 = String.valueOf(Float.valueOf(s1)*Float.valueOf(s1));
            et.setText(s1);
        }
        else {
            s2 = String.valueOf(Float.valueOf(s2) * Float.valueOf(s2));
            et.setText(s1 + ch + s2);
        }
    }

    public void onC(View view) {
        k = 0;
        s1 = "";
        s2 = "";
        et.setText("");
    }

    public void on0(View view) {
        et.setText(et.getText() + "0");
        if(k ==0){
            s1 += "0";
        }
        else s2 += "0";
    }

    public void onco(View view) {
        et.setText(et.getText() + ".");
        if(k == 0) s1 += ".";
        else s2 += ".";
    }

    public void ondiv(View view) {
        if(k == 0){
            ch = "/";
            et.setText(et.getText() + "/");
            k = 1;
        }
        else{
            //ch = "+"
            if(ch == "+")
                s1 = String.valueOf(Float.valueOf(s1) + Float.valueOf(s2));
            else if(ch == "-")
                s1 = String.valueOf(Float.valueOf(s1) - Float.valueOf(s2));
            else if(ch == "*")
                s1 = String.valueOf(Float.valueOf(s1) * Float.valueOf(s2));
            else if(ch == "/")
                s1 = String.valueOf(Float.valueOf(s1) / Float.valueOf(s2));
            s2 = "";
            ch = "/";
            et.setText(s1 + "/");
        }
    }

    public void oneq(View view) {
            //ch = "+"
            //System.out.println(s1 + " "  + ch +  " " + s2);
            if(ch == "+"){
               // et.setText(s1 + " ||"  + ch +  " ||" + s2);
                s1 = String.valueOf(Float.valueOf(s1) + Float.valueOf(s2));}
            else if(ch == "-"){
                s1 = String.valueOf(Float.valueOf(s1) - Float.valueOf(s2));}
            else if(ch == "*")
                s1 = String.valueOf(Float.valueOf(s1) * Float.valueOf(s2));
            else if(ch == "/")
                s1 = String.valueOf(Float.valueOf(s1) / Float.valueOf(s2));
            s2 = "";
            ch = "";
            k = 0;
            et.setText(s1);
        }
}

