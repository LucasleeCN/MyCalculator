package com.example.mycalculator;

public class function {
    public static Double percentDeal(Double num){
        return num/100;
    }
    public static Double sinDeal(Double num){
       return  Math.sin(num);
    }
    public  static Double cosDeal(Double num){
        return Math.cos(num);
    }
    public static Double tanDeal(Double num){
        return Math.tan(num);
    }
    public  static  Double lnDeal(Double num){
        return Math.log(num);
    }
    public  static Double logDeal(Double num){
        return Math.log10(num);
    }
    public static Double eDeal(){

        return Math.E;
    }
    public static Double PIDeal(){
        return Math.PI;
    }
    public  static Double xSquare(double num){
        return Math.pow(num,2);
    }
    public  static Double xThreeSquare(double num){
        return Math.pow(num,3);
    }

    public static Long xfactorial(long num){
        long res = 1;
       for(int i =1;i<=num;i++) {
            res=res*i;
       }
       return res;
    }
    public static Double xSqrt(double num){
        return Math.sqrt(num);
    }
  public  static  double tenNSquare(double num){
        return Math.pow(10.0,num);
  }


}
