package com.offer.addition;

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class addition {
    public int Add(int num1,int num2) {
        while(num2 !=0){            //若num2=0，则无进位，计算结束
            int temp=num1^num2;     //无进位相加
            num2=(num1&num2)<<1;    //计算进位
            num1=temp;
        }
        return num1;
    }
}
