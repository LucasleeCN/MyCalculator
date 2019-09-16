package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class binary_conversion extends AppCompatActivity implements View.OnClickListener {
    Button button_conversion;
    Button button_allClear;
    EditText editText_1 ;
    EditText editText_2;
    EditText editText_3;
    EditText editText_4;

    public  void initview(){
        button_conversion=findViewById(R.id.conversion);
        button_allClear=findViewById(R.id.AllClear);
        editText_1 = findViewById(R.id.editText_1);
        editText_2 = findViewById(R.id.editText_2);
        editText_3 = findViewById(R.id.editText_3);
        editText_4 = findViewById(R.id.editText_4);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_conversion);
        initview();
        button_conversion.setOnClickListener(this);
        button_allClear.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.conversion:
                 Log.d("extre_here", "onClick: 1");
                if(editText_1.length()>0/*此处用editText.length(),若使用editText.toString().length()会得到最大长度*/){
                    String input= editText_1.getText().toString();
                    String str=Long.toBinaryString(Long.parseLong(input));
                    Log.d("extre_here",""+str);
                    Log.d("extre_here",""+editText_1.getText().toString());

                    String temp_str=wantonlyConversion(input,2);//思路:先将任意进制字符串转换为十进制，在分别转换为相应的进制，并置入text中
                    if(isBinaryInteger(input)){//输入合理性判断

                        editText_2.setText(Integer.toOctalString(Integer.parseInt(temp_str)));
                        editText_3.setText(Integer.toString(Integer.parseInt(temp_str)));
                        editText_4.setText(Integer.toHexString(Integer.parseInt(temp_str)));
                    }
                    else {
                        Toast toast = Toast.makeText(getApplicationContext(), "请在对应位置输入整数！", Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                    }
                }
                else if(editText_2.length()>0){
                    String input= editText_2.getText().toString();
                    Log.d("extre_here", "onClick: 3");
                    String str=Long.toBinaryString(Long.parseLong(input));
                    Log.d("extre_here",""+str);
                    Log.d("extre_here",""+editText_2.getText());
                    Log.d("extre_here",""+editText_2.getText().toString());

                    String temp_str=wantonlyConversion(input,8);
                    if(isOctalInteger(input)){
                        editText_1.setText(Long.toBinaryString(Integer.parseInt(temp_str)));
                        editText_3.setText(Long.toString(Integer.parseInt(temp_str)));
                        editText_4.setText(Long.toHexString(Integer.parseInt(temp_str)));
                    }
                    else {
                        Toast toast = Toast.makeText(getApplicationContext(), "请在对应位置输入整数！", Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                    }
                }
                else if (editText_3.length()>0){
                    String input= editText_3.getText().toString();
                    Log.d("extre_here", "onClick: 4");
                    String str=Long.toBinaryString(Long.parseLong(input));
                    Log.d("extre_here",""+str);
                    Log.d("extre_here",""+editText_3.getText());
                    Log.d("extre_here",""+editText_3.getText().toString());

                    if(isInteger(input)){
                        editText_1.setText(Long.toBinaryString(Integer.parseInt(input)));
                        editText_2.setText(Long.toOctalString(Integer.parseInt(input)));
                        editText_4.setText(Long.toHexString(Integer.parseInt(input)));
                    }
                    else {
                        Toast toast = Toast.makeText(getApplicationContext(), "请在对应位置输入整数！", Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                    }
                }
                else if(editText_4.length()>0){
                    String input= editText_4.getText().toString();
                    Log.d("extre_here", "onClick: 5");
//                    String str=Long.toBinaryString(Long.parseLong(input));
//                    Log.d("extre_here",""+str);
                    Log.d("extre_here",""+editText_4.getText());
                    Log.d("extre_here",""+editText_4.getText().toString());

                    String temp_str=wantonlyConversion(input,16);
                    if(isHexNumber(input)){
                        editText_1.setText(Long.toBinaryString(Integer.parseInt(temp_str)));
                        editText_2.setText(Long.toOctalString(Integer.parseInt(temp_str)));
                        editText_3.setText(temp_str);//此处不需要抓换为整数了
                    }
                    else {
                        Toast toast = Toast.makeText(getApplicationContext(), "请在对应位置输入整数！", Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                    }
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
    public static boolean isInteger(String input){//是否为十进制整数;
        for(int i =0;i<input.length();i++){
            if(input.charAt(i)<'0'||input.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }
    public static boolean isBinaryInteger(String input){//是否为二进制数
        for(int i =0;i<input.length();i++){
            if(input.charAt(i)<'0'||input.charAt(i)>'1'){
                return false;
            }
        }
        return true;
    }
    public static boolean isOctalInteger(String input){//是否为八进制数
        for(int i =0;i<input.length();i++){
            if(input.charAt(i)<'0'||input.charAt(i)>'7'){
                return false;
            }
        }
        return true;
    }
    private static boolean isHexNumber(String str){//判断是否为十六进制数
        boolean flag = false;
        for(int i=0;i<str.length();i++){
            char cc = str.charAt(i);
            if(cc=='0'||cc=='1'||cc=='2'||cc=='3'||cc=='4'||cc=='5'||cc=='6'||cc=='7'||cc=='8'||cc=='9'||cc=='A'||cc=='B'||cc=='C'||
                    cc=='D'||cc=='E'||cc=='F'||cc=='a'||cc=='b'||cc=='c'||cc=='d'||cc=='e'||cc=='f'){
                flag = true;
            }
        }
        return flag;
    }
   public static String wantonlyConversion(String a, int b) {//任意进制转换为十进制
		int r = 0;
		for (int i = 0; i < a.length(); i++) {
		r = (int) (r + formatting(a.substring(i, i + 1))
		* Math.pow(b, a.length() - i - 1));
		}
		return String.valueOf(r);
		}
	public static int formatting(String a) {
		int i = 0;
		for (int u = 0; u < 10; u++) {
		if (a.equals(String.valueOf(u))) {
		i = u;
		}
		}
		if (a.equals("a")) {
		i = 10;
		}
		if (a.equals("b")) {
		i = 11;
		}
		if (a.equals("c")) {
		i = 12;
		}
		if (a.equals("d")) {
		i = 13;
		}
		if (a.equals("e")) {
		i = 14;
		}
		if (a.equals("f")) {
		i = 15;
		}
		return i;
		}

}
