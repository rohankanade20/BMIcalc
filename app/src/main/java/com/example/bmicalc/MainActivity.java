
package com.example.bmicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtresult;
        EditText edtheightFT,edtheightIn,edtweight;
        Button btncalc;
        LinearLayout llmain;

        edtheightIn = findViewById(R.id.edtheightIn);
        edtheightFT = findViewById(R.id.edtheightFT);
        edtweight = findViewById(R.id.edtweight);
        btncalc = findViewById(R.id.btncalc);
        txtresult = findViewById(R.id.txtresult);
        llmain = findViewById(R.id.llmain);

        btncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              int wt = Integer.parseInt(edtweight.getText().toString());
              int ft = Integer.parseInt(edtheightFT.getText().toString());
              int in = Integer.parseInt(edtheightIn.getText().toString());


              int totalIn = ft*12 + in;
              double totalCm = totalIn*2.53;
              double totalM = totalCm/100;
              double bmi = wt/(totalM*totalM);
              if(bmi>25){
              txtresult.setText("You are Overweight...!!!");
                  llmain.setBackgroundColor(getResources().getColor(R.color.colorOW));
              } else if (bmi<18) {
                  txtresult.setText("You are underWeight...!!!");
                  llmain.setBackgroundColor(getResources().getColor(R.color.colorUW));
              }else{
                  txtresult.setText("You are Healthy...!!!");
                  llmain.setBackgroundColor(getResources().getColor(R.color.colorH));
              }

              }
            });
    }
}