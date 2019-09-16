package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lenth_conversion extends AppCompatActivity implements View.OnClickListener {
    Button button_conversion;
    Button button_allclear;
    EditText editText_1;
    EditText editText_2;
    EditText editText_3;
    EditText editText_4;

    public  void initview(){
        button_conversion=findViewById(R.id.conversion);
        button_allclear =findViewById(R.id.AllClear);
        editText_1=findViewById(R.id.editText_1);
        editText_2=findViewById(R.id.editText_2);
        editText_3=findViewById(R.id.editText_3);
        editText_4=findViewById(R.id.editText_4);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lenth_conversion);
        initview();
        button_conversion.setOnClickListener(this);
        button_allclear.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.conversion:
                if(editText_1.length()>0&&editText_2.length()<=0&&editText_3.length()<=0&&editText_4.length()<=0) {

                        String input = editText_1.getText().toString();
                        Log.d("extre_here", "1");
                        editText_2.setText("" + Double.parseDouble(input) * 1000.0);
                        editText_3.setText("" + Double.parseDouble(input) / 1.852);
                        editText_4.setText("" + Double.parseDouble(input) / 1.60934);

                }

                    if(editText_1.length()<=0&&editText_2.length()>0&&editText_3.length()<=0&&editText_4.length()<=0) {
                            Log.d("extre_here", "2");
                            String input = editText_2.getText().toString();
                            editText_1.setText("" + Double.parseDouble(input) / 1000.0);
                            editText_3.setText("" + Double.parseDouble(input) / (1000.0 * 1.852));
                            editText_4.setText("" + Double.parseDouble(input) / (1000.0 * 1.60934));

                    }

                if(editText_1.length()<=0&&editText_2.length()<=0&&editText_3.length()>0&&editText_4.length()<=0){

                        Log.d("extre_here","3");
                        String input = editText_3.getText().toString();
                        editText_1.setText(""+Double.parseDouble(input)*1.852);
                        editText_2.setText(""+Double.parseDouble(input)*(1000.0*1.852));
                        editText_4.setText(""+Double.parseDouble(input)*1.60934);

                }

                if(editText_1.length()<=0&&editText_2.length()<=0&&editText_3.length()<=0&&editText_4.length()>0) {

                        Log.d("extre_here", "4");
                        String input = editText_4.getText().toString();
                        editText_1.setText("" + Double.parseDouble(input) * 1.60934);
                        editText_2.setText("" + Double.parseDouble(input) * (1000.0 * 1.60934));
                        editText_3.setText("" + Double.parseDouble(input) * 1.60934 / 1.852);

                }

                break;
            case R.id.AllClear:
                editText_1.setText("");
                editText_2.setText("");
                editText_3.setText("");
                editText_4.setText("");
                break;
        }
    }
   
}
