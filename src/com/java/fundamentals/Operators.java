package com.java.fundamentals;

public class Operators {
    public static void main (String[] args) {
        /*
        Assessment operators
         */
        byte no1 = 100;
        byte no2;
        no2 = no1;
        System.out.println(no2);
        int res = 10 + 20 -30 * 40 / 50 %60;
        System.out.println(res);

      /*  //logical
        num1 = 20;
        num2 = 30;
        System.out.println(--num1<10 && ++num2>35);
        System.out.println(num1);
        System.out.println(num2);

        num1 = 10;
        num2 = 20;
        System.out.println(--num1<20 || num2<30);
        System.out.println(num1);
        System.out.println(num2);*/
        /*
        byte num1 = 100;
        byte num2 = 123;
        res = (byte) (num1+num2);
        System.out.println(res);*/

        int numb1 = 93456789;
        int numb2 = 987456689;
        res  = (int) (numb1+numb2);
        System.out.println(res);

        byte number1 = 10;
        byte number2 = 20;
        res = (byte)(number1*number2);
        System.out.println(res);

       /* int num1 = 10;
        int num2 = 20;
         int result = --num1 + ++num1 - num1-- + num1++ - --num2 + ++num2;
        System.out.println(result);
        System.out.println(num1);
        System.out.println(num2);

        int num1 = 10;
        int num2 = 20;
        boolean result = --num1 > 10 && --num2 < 20;
        System.out.println(result); */
        int a = 25;
        int b = 35;
        boolean result = a++ > 10 || --b < 20;
        System.out.println(result);




        









    }
}
