package com.example.mycalculator;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostfixConversion {
    public static StringBuffer toPostfixString(String infix){
        Stack<String> stack = new SeqStack<String>(infix.length());
        StringBuffer postfix=new StringBuffer(infix.length());
        String[] newstr = stringToStringArrays(infix);
        int i=0;
        while(i<newstr.length){
            String ch = newstr[i];
            switch (ch){
                case "+": case"-":
                    while(!stack.isEmpty()&&!stack.peek().equals("("))
                        postfix.append(stack.pop());
                    ((SeqStack) stack).pushStack(ch+"");
                    i++;
                    break;
                case "*": case"/":
                    while(!stack.isEmpty()&&(stack.peek().equals("*")||stack.peek().equals("/")))
                        postfix.append(stack.pop());
                    ((SeqStack) stack).pushStack(ch+"");
                    i++;
                    break;
                case "(":
                    ((SeqStack) stack).pushStack(ch+"");
                    i++;
                    break;
                case ")":
                    String out = stack.pop();
                    while(out!=null && !out.equals("(")){
                        postfix.append(out);
                        out=stack.pop();
                    }

                    i++;
                    break;
                case "none":
                    i++;
                    break;
                default:
                    while(i<infix.length()&&isNumberic(ch)){
                        postfix.append(ch);
                        i++;
                        if(i<infix.length()){
                            ch=newstr[i];
                        }
                        postfix.append(" ");
                    }

            }

        }
        while(!stack.isEmpty())
            postfix.append(stack.pop());
        return postfix;
    }
    public static Double toValue(StringBuffer postfix){
        Stack<Double> stack=new SeqStack<Double>(postfix.length());
        String[] strArr= new String[postfix.length()];
        strArr=stringToStringArrays(postfix.toString());
//    	for (int i = 0; i < strArr.length; i++) {
//			System.out.print(strArr[i]);
//		}
        Double value=0.00;
        for(int i=0;i<postfix.length();i++){
            String ch = strArr[i];
            if(isNumberic((ch))){
                value=0.00;
                value=Double.parseDouble(ch);
//        			value=value*10+ch - '0';
                i++;
                ch=strArr[i];

                ((SeqStack<String>) stack).pushStack(value);
            }
            else
            if(ch!= " "&&ch!="none"){
                double y = stack.pop();
                double x = stack.pop();
                switch(ch){
                    case"+":value=x+y;break;
                    case"-":value=x-y;break;
                    case"*":value=x*y;break;
                    case"/":value=x/y;break;
                }
//        			System.out.print(x+(ch+"")+y+"="+value+",");
                ((SeqStack<String>) stack).pushStack(value);
            }
        }
        return stack.pop();

    }
    public static  String[] stringToStringArrays(String str){//字符串转化
        String[] newStr = new String[str.length()];
        int j=0;
        StringBuffer strbuf = new StringBuffer();
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'||str.charAt(i)=='.'){
                strbuf.append(str.charAt(i));
            }
            else {//if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||str.charAt(i)=='('||str.charAt(i)==')'){
                //newStr[i]=Character.toString(str.charAt(i));
                if(strbuf.length()!=0){
                    newStr[j]=strbuf.toString();
                    strbuf=new StringBuffer();
                    j++;
                }
                newStr[j]=str.charAt(i)+"";
                j++;
            }
            if(i==str.length()-1){
                if(strbuf.length()!=0){
                    newStr[j]=strbuf.toString();
                    strbuf=new StringBuffer();
                    j++;
                }
            }
            for(int s = 0;s<newStr.length;s++){
                if(newStr[s]==null){
                    newStr[s]="none";
                }
            }

        }

////    	int[] locn = new int[str.length()*2];
////    	locn[0]=0;
//    	int loca=-1,locb=-1;
//    	for(int i=0;i<str.length();i++){
//    		if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||str.charAt(i)=='('||str.charAt(i)==')')
//    			locb=i;
//    		if(loca<locb){
//    			StringBuffer strbuf=new StringBuffer();
//	    		for(int k = loca;k<locb;k++){
//	    			if(k>=0)
//	    			strbuf.append(str.charAt(k));
//	    		}
//	    		newStr[i]=strbuf.toString();
//	    		System.out.println(str.charAt(i));
//	    		newStr[i+1]=Character.toString(str.charAt(i));
//	    		loca=locb+1;
//    		}
////    		else if(loca>locb){
////    			newStr[i+1]=Character.toString(str.charAt(i));
////    		}
//    		newStr[str.length()]=Character.toString(str.charAt(str.length()-1));
//
//    	}
//

        return newStr;

    }
    //    public static boolean isNumberic(String str){//判断是否为数字；单数有局限性，难以判断小数和负数
//    	if(str!=null){
//    	for (int i = 0; i < str.length(); i++) {
//    		 if (str.charAt(i)<'0'||str.charAt(i)>'9'||str.charAt(i)!='.'){
//    			           return false;
//    		 }
//    	}
//		return true;
//    }
//    	else
//    		return false;
//    }
    public static boolean isNumberic(String str) {//
        //Pattern pattern = Pattern.compile("-?[0-9]+.?[0-9]+");//这个有问题，一位的整数不能通过
        if(str!=null){
            Pattern pattern = Pattern.compile("^(\\-|\\+)?\\d+(\\.\\d+)?$");//这个是对的
            Matcher isNum = pattern.matcher(str);
            if (!isNum.matches()) {
                return false;
            }
            else
                return true;
        }

        else
            return false;
    }


    public static void main(String[] args){
        String str = "(5.62*3.5+4.3)/8";
//        验证 stringToStringArrays()函数
//        String[] str1 = new String[str.length()];
//
//        str1 = stringToStringArrays(str);
//        for (int i = 0; i < str1.length; i++) {
//        	 System.out.print(str1[i]+" ");
//		}
//
//       验证函数isNumberic();
//        for(int i = 0;i<str1.length;i++){
//        	if(isNumberic(str1[i])){
//        System.out.print(str1[i]+" ");
//
//        	}
//     }

//        System.out.println(  toValue(newStr));

//        System.out.println(newStr);
        StringBuffer newStr=toPostfixString(str);
        System.out.println("infix="+str+"\npostfix="+newStr+"\nvalue="+toValue(newStr));
    }

}
