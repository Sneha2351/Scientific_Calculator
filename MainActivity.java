package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bdot,bpi,bplus,bminus,bmult,bdiv,bmod,bsin,bcos,btan,blog,bln,bb1,bb2,bequal,bpower,bsqrt,bac,bc,bfact,binv;
    TextView tvmain, tvsec;
    Float val, val1;
    boolean Add, Sub, Mult, Div, Mod;
    Double pi = 3.14159265;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bdot = findViewById(R.id.bdot);
        bplus = findViewById(R.id.bplus);
        bminus = findViewById(R.id.bminus);
        bmult = findViewById(R.id.bmult);
        bdiv = findViewById(R.id.bdiv);
        bmod = findViewById(R.id.bmod);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        btan = findViewById(R.id.btan);
        blog = findViewById(R.id.blog);
        bln = findViewById(R.id.bln);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bequal = findViewById(R.id.bequal);
        bpower = findViewById(R.id.bpower);
        bsqrt = findViewById(R.id.bsqrt);
        bac = findViewById(R.id.bac);
        bc = findViewById(R.id.bc);
        bfact = findViewById(R.id.bfact);
        binv = findViewById(R.id.binv);
        bpi = findViewById(R.id.bpi);
        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               tvmain.setText(tvmain.getText() + "0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "9");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + ".");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(" ");
                tvsec.setText(" ");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                val = val.substring(0, val.length() - 1);
                tvmain.setText(val);
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain == null)
                    tvmain.setText(" ");
                else {
                    val = Float.parseFloat(tvmain.getText() + "");
                    Add = true;
                    tvmain.setText("+");
                }
            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain == null)
                    tvmain.setText(" ");
                else {
                    val = Float.parseFloat(tvmain.getText() + "");
                    Sub = true;
                    tvmain.setText("");
                }
            }
        });
        bmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain == null)
                    tvmain.setText(" ");
                else {
                    val = Float.parseFloat(tvmain.getText() + "");
                    Mult = true;
                    tvmain.setText("");
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain == null)
                    tvmain.setText(" ");
                else {
                    val = Float.parseFloat(tvmain.getText() + "");
                    Div = true;
                    tvmain.setText("");
                }
            }
        });
        bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain == null)
                    tvmain.setText(" ");
                else {
                    val = Float.parseFloat(tvmain.getText() + "");
                    Mod = true;
                    tvmain.setText("");
                }
            }
        });
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                tvmain.setText("√" + tvmain.getText());
                tvsec.setText(String.valueOf(r));
            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "(");
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + ")");
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(tvmain.getText().toString());
                d = d * pi;
                tvmain.setText(tvmain.getText() +"∏");
                tvsec.setText(String.valueOf(d));
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Math.sin(Double.parseDouble(tvmain.getText().toString()));
                tvmain.setText("sin(" + tvmain.getText());
                tvmain.setText(tvmain.getText());
                tvsec.setText(String.valueOf(d));
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Math.cos(Double.parseDouble(tvmain.getText().toString()));
                tvmain.setText("cos(" + tvmain.getText());
                tvmain.setText(tvmain.getText());
                tvsec.setText(String.valueOf(d));
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Math.tan(Double.parseDouble(tvmain.getText().toString()));
                tvmain.setText("tan(" + tvmain.getText());
                tvmain.setText(tvmain.getText());
                tvsec.setText(String.valueOf(d));
            }
        });
        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(tvmain.getText().toString());
                double r = 1/d;
                tvmain.setText("1/" + tvmain.getText());
                tvmain.setText(tvmain.getText());
                tvsec.setText(String.valueOf(r));
            }
        });
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int d = Integer.parseInt(tvmain.getText().toString());
                int fact = factorial(d);
                tvmain.setText(d + "!");
                tvsec.setText(String.valueOf(fact));
            }
        });
        bpower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(tvmain.getText().toString());
                tvmain.setText("(" + d + ")" + "^" + "2");
                d = d * d;
                tvmain.setText(tvmain.getText());
                tvsec.setText(String.valueOf(d));
            }
        });
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Math.log(Double.parseDouble(tvmain.getText().toString()));
                tvmain.setText("ln" + tvmain.getText());
                tvmain.setText(tvmain.getText());
                tvsec.setText(String.valueOf(d));
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Math.log10(Double.parseDouble(tvmain.getText().toString()));
                tvmain.setText("log" + tvmain.getText());
                tvmain.setText(tvmain.getText());
                tvsec.setText(String.valueOf(d));
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(tvmain.getText() + " ");
                if (Add == true){
                    tvmain.setText(val + "+" + val1);
                    tvsec.setText(val + val1 + "");
                    Add = false;
                }
                else if (Sub == true){
                    tvmain.setText(val + "-" + val1);
                    tvsec.setText(val - val1 + "");
                    Sub = false;
                }
                else if (Mult == true){
                    tvmain.setText(val + "x" + val1);
                    tvsec.setText(val * val1 + "");
                    Mult = false;
                }
                else if (Div == true){
                    tvmain.setText(val + "÷" + val1);
                    tvsec.setText(val / val1 + "");
                    Div = false;
                }
                else if (Mod == true){
                    tvmain.setText(val + "%" + val1);
                    tvsec.setText(val % val1 + "");
                    Mod = false;
                }
            }
        });
    }
    int factorial(int n) {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }

}