package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class unit_conversion extends AppCompatActivity implements View.OnClickListener {

    Button button_length_conversion;
    Button button_area_conversion;
    Button button_volume_conversion;
    Button button_weight_conversion;
    Button button_velocity_conversion;
    public  void initView(){
        button_length_conversion=findViewById(R.id.length_conversion);
        button_area_conversion=findViewById(R.id.area_conversion);
        button_volume_conversion=findViewById(R.id.volume_conversion);
        button_weight_conversion=findViewById(R.id.weight_conversion);
        button_velocity_conversion=findViewById(R.id.velocity_conversion);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_conversion);
        initView();
        button_length_conversion.setOnClickListener(this);
        button_area_conversion.setOnClickListener(this);
        button_volume_conversion.setOnClickListener(this);
        button_weight_conversion.setOnClickListener(this);
        button_velocity_conversion.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.length_conversion:
                Intent intent_length = new Intent(unit_conversion.this,Lenth_conversion.class);//跳转至长度单位转换活动
                startActivity(intent_length);
                break;
            case R.id.area_conversion:
                Intent intent_area = new Intent(unit_conversion.this,Area_conversion.class);//跳转至面积转换页面
                startActivity(intent_area);
                break;
            case R.id.volume_conversion:
                Intent intent_volume = new Intent(unit_conversion.this,Volume_conversion.class);//跳转至体积转换页面
                startActivity(intent_volume);
                break;
            case R.id.weight_conversion:
                Intent intent_weiht= new Intent(unit_conversion.this,Weight_conversion.class);//跳转至质量转换页面
                startActivity(intent_weiht);
                break;
            case R.id.velocity_conversion:
                Intent intent_velocity = new Intent(unit_conversion.this,Velocity_conversion.class);//跳转至速度转换页面
                startActivity(intent_velocity);
                break;
        }
    }
}
