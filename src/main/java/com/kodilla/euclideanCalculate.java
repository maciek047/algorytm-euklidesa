package com.kodilla;


public class euclideanCalculate {

    public int caculateGCD(int a, int b){
        int modulo = a % b;
        while(modulo!=0){
            a = b;
            b = modulo;
            modulo = a % b;
        }
        return b;
    }
}