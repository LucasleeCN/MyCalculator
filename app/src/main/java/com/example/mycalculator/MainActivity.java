package com.example.mycalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button_0;
    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_7;
    Button button_8;
    Button button_9;
    Button button_left_barcket;
    Button button_right_barcket;
    Button button_point;
    Button button_plus;
    Button button_reduce;
    Button button_multiply;
    Button button_devide;
    Button button_equal;
    Button button_percent;
    Button button_clear;
    Button button_delete;
    Button button_square;
    Button button_cubic;

    Button button_PI;
    Button button_xnSquare;
    Button button_sqrt;
    Button button_factorial;
    Button button_xthreesqrt;
    Button button_E;
    Button button_ln;
    Button button_log;
    Button button_sin;
    Button button_cos;
    Button button_tan;

    StringBuffer strbuf=new StringBuffer();
    TextView textView_input;
    TextView textView_output;

    public  void initView(){
        button_0 =findViewById(R.id.button_0);
        button_1 =findViewById(R.id.button_1);
        button_2=findViewById(R.id.button_2);
        button_3=findViewById(R.id.button_3);
        button_4=findViewById(R.id.button_4);
        button_5=findViewById(R.id.button_5);
        button_6 =findViewById(R.id.button_6);
        button_7=findViewById(R.id.button_7);
        button_8=findViewById(R.id.button_8);
        button_9=findViewById(R.id.button_9);
        button_left_barcket =findViewById(R.id.button_left_barcket);
        button_right_barcket=findViewById(R.id.button_right_barcket);
        button_point=findViewById(R.id.button_point);
        button_plus= findViewById(R.id.button_plus);
        button_reduce= findViewById(R.id.button_reduce);
        button_multiply= findViewById(R.id.button_multiply);
        button_devide = findViewById(R.id.button_devide);
        button_equal = findViewById(R.id.button_equal);
        button_percent = findViewById(R.id.button_percent);
        button_clear= findViewById(R.id.button_Clear);
        button_delete= findViewById(R.id.button_delete);
        button_square=findViewById(R.id.button_square);
        button_cubic=findViewById(R.id.button_cubic);

        textView_input=findViewById(R.id.textview_1);
        textView_output=findViewById(R.id.textview_2);

        button_PI=findViewById(R.id.button_PI);
        button_xnSquare=findViewById(R.id.button_n_suqare);
        button_sqrt=findViewById(R.id.button_x_extract);
        button_factorial=findViewById(R.id.button_x_factorial);
        button_xthreesqrt=findViewById(R.id.button_x_three_extract);
        button_E=findViewById(R.id.button_e);
        button_ln=findViewById(R.id.button_ln);
        button_log=findViewById(R.id.button_log);
        button_sin=findViewById(R.id.button_sin);
        button_cos=findViewById(R.id.button_cos);
        button_tan=findViewById(R.id.button_tan);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        button_0.setOnClickListener(this);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_point.setOnClickListener(this);
        button_plus.setOnClickListener(this);
        button_reduce.setOnClickListener(this);
        button_multiply.setOnClickListener(this);
        button_devide.setOnClickListener(this);
        button_left_barcket.setOnClickListener(this);
        button_right_barcket.setOnClickListener(this);
        button_equal.setOnClickListener(this);
        button_square.setOnClickListener(this);
        button_cubic.setOnClickListener(this);
        button_percent.setOnClickListener(this);
        button_clear.setOnClickListener(this);
        button_delete.setOnClickListener(this);

        button_PI.setOnClickListener(this);
        button_xnSquare.setOnClickListener(this);
        button_sqrt.setOnClickListener(this);
        button_factorial.setOnClickListener(this);
        button_xthreesqrt.setOnClickListener(this);
        button_E.setOnClickListener(this);
        button_ln.setOnClickListener(this);
        button_log.setOnClickListener(this);
        button_sin.setOnClickListener(this);
        button_cos.setOnClickListener(this);
        button_tan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int start=0;
        int end=0;
        if(strbuf.length()!=0){
            end=strbuf.codePointAt(strbuf.length()-1);
        }
        switch (view.getId()){
            case R.id.button_0:
                if(strbuf.length()!=0&&strbuf.toString().charAt(strbuf.length()-1)=='/') {

                    Toast toast = Toast.makeText(getApplicationContext(), "除号后面不可以输入0！", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
                else{
                    strbuf = strbuf.append("0");
                    textView_input.setText(strbuf);
                }
                break;
            case R.id.button_1:
                strbuf=strbuf.append("1");
                textView_input.setText(strbuf);
                break;
            case R.id.button_2:
                strbuf=strbuf.append("2");
                textView_input.setText(strbuf);
                break;
            case R.id.button_3:
                strbuf=strbuf.append("3");
                textView_input.setText(strbuf);
                break;
            case R.id.button_4:
                strbuf=strbuf.append("4");
                textView_input.setText(strbuf);
                break;
            case R.id.button_5:
                strbuf=strbuf.append("5");
                textView_input.setText(strbuf);
                break;
            case R.id.button_6:
                strbuf=strbuf.append("6");
                textView_input.setText(strbuf);
                break;
            case R.id.button_7:
                strbuf=strbuf.append("7");
                textView_input.setText(strbuf);
                break;
            case R.id.button_8:
                strbuf=strbuf.append("8");
                textView_input.setText(strbuf);
                break;
            case R.id.button_9:
                strbuf=strbuf.append("9");
                textView_input.setText(strbuf);
                break;
            case R.id.button_point:
                if(strbuf.length()>0&&findXIsNumber(strbuf,strbuf.length()-1)) {
                    strbuf = strbuf.append(".");
                    textView_input.setText(strbuf);
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "请在点前面输入数字！", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
//                    textView_output.setText("Systax error! ");
                }
                break;
            case R.id.button_plus:
                    strbuf = strbuf.append("+");
                    textView_input.setText(strbuf);
                break;
            case R.id.button_reduce:
                strbuf=strbuf.append("-");
                textView_input.setText(strbuf);
                break;
            case R.id.button_multiply:
                strbuf=strbuf.append("*");
                textView_input.setText(strbuf);
                break;
            case R.id.button_devide:
                strbuf=strbuf.append("/");
                textView_input.setText(strbuf);
                break;
            case R.id.button_left_barcket:
                if(strbuf.length()==0||!findXIsNumber(strbuf,strbuf.length()-1)) {
                    strbuf = strbuf.append("(");
                    textView_input.setText(strbuf);
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "请输入正确的式子！", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                break;
            case R.id.button_right_barcket:
                if(strbuf.length()>=2|findXIsNumber(strbuf,strbuf.length()-1)&&!barcketCount(strbuf)) {
                    strbuf = strbuf.append(")");
                    textView_input.setText(strbuf);
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "请输入正确的式子！", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                break;
            case R.id.button_equal:

                if(strbuf.length() > 1) {
                    PostfixConversion res = new PostfixConversion();
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer = res.toPostfixString(strbuf.toString());
                    Double result = res.toValue(stringBuffer);
                    textView_output.setText("" + result);
                    strbuf.delete(0, strbuf.length());
                    strbuf = new StringBuffer();
                    strbuf.append("" + result);

                }

                break;
            case R.id.button_Clear:
                strbuf.delete(0,strbuf.length());
                strbuf=new StringBuffer();
                textView_input.setText(strbuf);
                textView_output.setText("");
                break;
            case R.id.button_delete:
                if(strbuf.length()!=0) {
                    strbuf.delete(strbuf.length() - 1, strbuf.length());
                    textView_input.setText(strbuf);
                }
                break;
            case R.id.button_percent:
                if(strbuf.length()>0&&findXIsNumber(strbuf,strbuf.length()-1)) {
                    function function_percent = new function();
                    double num=function_percent.percentDeal(findNumberFromLastSymbol(strbuf));
                    strbuf.delete(findlocationFromLastSymbol(strbuf),strbuf.length());          //删除百分号之前对应的数字
                    strbuf.append(num);
                   textView_input.setText(strbuf);

                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "请在百分号前面输入数字！", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
                break;
            case R.id.button_square:
                if(strbuf.length()>0&&findXIsNumber(strbuf,strbuf.length()-1)){
                    function function_square = new function();
                    double num=function_square.xSquare(findNumberFromLastSymbol(strbuf));
                    strbuf.delete(findlocationFromLastSymbol(strbuf),strbuf.length());          //删除平方前面的数字
                    strbuf.append(num);
                    textView_input.setText(strbuf);

                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), "请在平方前面输入数字！", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
                break;
            case R.id.button_cubic:
                if(strbuf.length()>0&&findXIsNumber(strbuf,strbuf.length()-1)){
                    function function_xThreesquare = new function();
                    double num=function_xThreesquare.xThreeSquare(findNumberFromLastSymbol(strbuf));
                    strbuf.delete(findlocationFromLastSymbol(strbuf),strbuf.length());          //删除立方前面的数字
                    strbuf.append(num);
                    textView_input.setText(strbuf);
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), "请在三次方前面输入数字！", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
                break;
            case R.id.button_PI:
                function function_PI = new function();
                double PI=function_PI.PIDeal();
                textView_output.setText(""+PI);
                strbuf.append(PI);
                textView_input.setText(strbuf);
                break;
            case R.id.button_e:
                function function_E = new function();
                double E = function_E.eDeal();
                textView_output.setText(""+E);
                strbuf.append(E);
                textView_input.setText(strbuf);
                break;
            case R.id.button_n_suqare:
                if(strbuf.length()>0&&findXIsNumber(strbuf,strbuf.length()-1)){
                    function function_tenNSquare= new function();
                    double num= function_tenNSquare.tenNSquare(findNumberFromLastSymbol(strbuf));
                    strbuf.delete(findlocationFromLastSymbol(strbuf),strbuf.length());          //删除10n前面的数字
                    strbuf.append(num);
                    textView_input.setText(strbuf);
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), "请在10ⁿ前面输入数字！", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
                break;
            case R.id.button_sin:
                if(strbuf.length()>0&&findXIsNumber(strbuf,strbuf.length()-1)){
                    function function_sin= new function();
                    double num=function_sin.sinDeal(findNumberFromLastSymbol(strbuf));
                    strbuf.delete(findlocationFromLastSymbol(strbuf),strbuf.length());          //删除sin前面的数字
                    strbuf.append(num);
                    textView_input.setText(strbuf);
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), "请在sin前面输入数字！", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
                break;
            case R.id.button_cos:
                if(strbuf.length()>0&&findXIsNumber(strbuf,strbuf.length()-1)){
                function function_cos= new function();
                double num=function_cos.cosDeal(findNumberFromLastSymbol(strbuf));
                strbuf.delete(findlocationFromLastSymbol(strbuf),strbuf.length());          //删除sin前面的数字
                strbuf.append(num);
                textView_input.setText(strbuf);
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), "请在cos前面输入数字！", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
                break;
            case R.id.button_tan:
                if(strbuf.length()>0&&findXIsNumber(strbuf,strbuf.length()-1)&&findlocationFromLastSymbol(strbuf)!=0.0){
                    function function_tan= new function();
                    double num=function_tan.tanDeal(findNumberFromLastSymbol(strbuf));
                    strbuf.delete(findlocationFromLastSymbol(strbuf),strbuf.length());          //删除sin前面的数字
                    strbuf.append(num);
                    textView_input.setText(strbuf);
                }
                else if(findlocationFromLastSymbol(strbuf)!=0.0){
                    Toast toast = Toast.makeText(getApplicationContext(), "请在tan前面输入不为0的数字！", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), "请在tan前面输入数字！", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
                break;
            case R.id.button_ln:
                if(strbuf.length()>0&&findXIsNumber(strbuf,strbuf.length()-1)){
                    function function_ln= new function();
                    double num=function_ln.lnDeal(findNumberFromLastSymbol(strbuf));
                    strbuf.delete(findlocationFromLastSymbol(strbuf),strbuf.length());          //删除sin前面的数字
                    strbuf.append(num);
                    textView_input.setText(strbuf);
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), "请在ln前面输入数字！", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
                break;
            case R.id.button_log:
                if(strbuf.length()>0&&findXIsNumber(strbuf,strbuf.length()-1)){
                function function_log= new function();
                double num=function_log.logDeal(findNumberFromLastSymbol(strbuf));
                strbuf.delete(findlocationFromLastSymbol(strbuf),strbuf.length());          //删除sin前面的数字
                strbuf.append(num);
                textView_input.setText(strbuf);
            }
                else{
                Toast toast = Toast.makeText(getApplicationContext(), "请在log前面输入数字！", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();
            }
                break;
            case R.id.button_x_extract:
                if(strbuf.length()>0&&findXIsNumber(strbuf,strbuf.length()-1)){
                    function function_sqrt= new function();
                    double num=function_sqrt.xSqrt(findNumberFromLastSymbol(strbuf));
                    strbuf.delete(findlocationFromLastSymbol(strbuf),strbuf.length());          //删除sin前面的数字
                    strbuf.append(num);
                    textView_input.setText(strbuf);
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), "请在√￣前面输入数字！", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
                break;
            case R.id.button_x_three_extract:
                if(strbuf.length()>0&&findXIsNumber(strbuf,strbuf.length()-1)){
                    function function_x_three_sqrt= new function();
                    double num=function_x_three_sqrt.xSqrt(findNumberFromLastSymbol(strbuf));
                    strbuf.delete(findlocationFromLastSymbol(strbuf),strbuf.length());          //删除sin前面的数字
                    strbuf.append(num);
                    textView_input.setText(strbuf);
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), "请在√￣前面输入数字！", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
                break;
            case R.id.button_x_factorial:


                if(strbuf.length()>0) {

                        if (Math.round(findNumberFromLastSymbol(strbuf))==findNumberFromLastSymbol(strbuf)) {
                            function function_x_factorial = new function();
                            long num = function_x_factorial.xfactorial(Math.round(findNumberFromLastSymbol(strbuf)));//寻找最后一个符号的前一个整数
                            strbuf.delete(findlocationFromLastSymbol(strbuf), strbuf.length());          //删除!前面的数字
                            strbuf.append(num);
                            textView_input.setText(strbuf);
                        } else {
                            Toast toast = Toast.makeText(getApplicationContext(), "请在 ！前面输入整数！", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER, 0, 0);
                            toast.show();
                        }
                    }

                else{
                    Toast toast = Toast.makeText(getApplicationContext(), "请在 ！前面输入一个数！", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
                break;


        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.unit_conversion:
                Intent intent_1 = new Intent(MainActivity.this,unit_conversion.class);
                startActivity(intent_1);
                break;
            case R.id.binary_conversion://进制转换
                Intent intent_2= new Intent(MainActivity.this,binary_conversion.class);
                startActivity(intent_2);
                break;
            case R.id.help:
                Toast toast = Toast.makeText(getApplicationContext(), "Copyright@Lucas_lee！", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();
                break;
        }

        return  true;
    }






    //用于处理计算机器输入合理性检验的函数
    public static boolean findXIsNumber(StringBuffer strbuf, int  i){//判断字符串流x位置是否为数字
        String symbol="+-*/()";
        for (int k =0;k<symbol.length();k++){
            if(strbuf.toString().charAt(i)==symbol.charAt(k)){
                return false;
            }
        }
        return true;

    }

    public static double findNumberFromLastSymbol(StringBuffer strbuf){//寻找字符串流最后一个符号之后的浮点数数
        double num=0.0; int k=0;
        for(int i =strbuf.length()-1;i>0;i--){
            if(findXIsNumber(strbuf,i)){
                continue;

            }
            else {
                k = i+1;
                break;
            }
        }
        if(k>=0&&k<strbuf.length()) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = k; i < strbuf.length(); i++) {
                stringBuffer.append(strbuf.charAt(i));
            }
            num=Double.parseDouble(stringBuffer.toString());
        }
        return num;
    }

    public static boolean findXIsIntegerNumber(StringBuffer strbuf, int  i){//判断字符串流x位置是否为整数
        String symbol="+-*/().";
        for (int k =0;k<symbol.length();k++){
            if(strbuf.toString().charAt(i)==symbol.charAt(k)){
                return false;
            }
        }
        return true;

    }
    public static Long findIntegerNumberFromLastSymbol(StringBuffer strbuf){//寻找字符串流最后一个符号之后的整数
        long num=0; int k=0;
        for(int i =strbuf.length()-1;i>0;i--){
            if(findXIsIntegerNumber(strbuf,i)){
                continue;

            }
            else {
                k = i+1;
                break;
            }
        }
        if(k>=0&&k<strbuf.length()) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = k; i < strbuf.length(); i++) {
                stringBuffer.append(strbuf.charAt(i));
            }
            num=Long.parseLong(stringBuffer.toString());
        }
        return num;
    }


    public  static int findlocationFromLastSymbol(StringBuffer strbuf){//寻找最后一个字符的位置；
        double num=0.0; int k=0;
        for(int i =strbuf.length()-1;i>0;i--){
            if(findXIsNumber(strbuf,i)){
                continue;
            }
            else {
                k = i+1;
                break;
            }
        }
        if(k>=0&&k<strbuf.length()) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = k; i < strbuf.length(); i++) {
                stringBuffer.append(strbuf.charAt(i));
            }
            num=Double.parseDouble(stringBuffer.toString());
        }
        return k;
    }

    public static boolean barcketCount(StringBuffer strbuf){//判断字符串中左括号和右括号的数目是否相等;
        int lc=0;int rc=0;
        for(int i = 0;i<strbuf.length();i++){
            if(strbuf.charAt(i)=='('){
                lc++;
            }
            if(strbuf.charAt(i)==')'){
                rc++;
            }
        }
        if(rc==lc){
            return true;
        }
        else
        return false;
    }
    public static String[] cutString(String[] str){
        String[] strings = new String[str.length];
        return strings;
    }
}
