package com.brainversetechnologies.myapplication;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button btnAdd;
    TextView txAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.ed_f_num);
        num2 = findViewById(R.id.ed_s_num);
        btnAdd = findViewById(R.id.btn_add);
        txAnswer = findViewById(R.id.txt_answer);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String numOne = num1.getText().toString().trim();
                String numTwo = num2.getText().toString().trim();

                try{
                    int mNum1 = Integer.parseInt(numOne);
                    int mNum2 = Integer.parseInt(numTwo);

                    int sum = mNum1 + mNum2;
                    String answer = String.valueOf(sum);

                    txAnswer.setText(answer);

                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"sorry there was an error " +e, Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}
//  "     th e     "