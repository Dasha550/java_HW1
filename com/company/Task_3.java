package com.company;
import java.util.Scanner;

public class Task_3 {
    public static class Calculator {
        public static void main(String[] args) {
           double num1;
           double num2;
           double res;
           char operation;
           try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Введите два числа через пробел:");
               num1 = reader.nextDouble();
               num2 = reader.nextDouble();
               System.out.print("Введите желаемую операцию: (+, -, *, /): ");
               operation = reader.next().charAt(0);
        }
           switch(operation) {
              case '+': res = num1 + num2;
                 break;
              case '-': res = num1 - num2;
                 break;
              case '*': res = num1 * num2;
                 break;
              case '/': res = num1 / num2;
                 break;
              default:  System.out.printf("Вы ввели операцию не входящую в перечень возможных");
                 return;
           }
           System.out.print("Результат:");
           System.out.print(res);
        }
     }
}