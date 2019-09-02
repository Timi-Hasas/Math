package com.fasttrackit;


public class App
{
    public static void main(String[] args)

    {
        MathCalc total = new MathCalc();
        System.out.println(total.Divide(20,5));
        System.out.println(total.Extract(20,5));
        System.out.println(total.Sum(20,5));
        System.out.println(total.Multiply(20,5));

        System.out.println(total.Sum(23.4,27.5));
        System.out.println(total.Extract(44.2, 22.1));
        System.out.println(total.Multiply(2.5, 2));
        System.out.println(total.Divide(24.2,2));

    }

}


