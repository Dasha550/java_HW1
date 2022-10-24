//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package com.company;

public class Task_1{
    public static void main (String[] args){
        int num=0;
        int n_num = 4;
            for (int i = 0; i <= n_num; i++)
                num=i+num;
        System.out.print(num);
    }
}