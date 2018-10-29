package Task1;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Calculations {
    public static void main(String[] args) {
        int X, Y;
        //int sum , Difference ,Product , Avg;
        Scanner in = new Scanner(System.in);
        System.out.println(" enter the number X : ");
        X = in.nextInt();
        System.out.println(" enter the number Y : ");
        Y = in.nextInt();
        System.out.println("the sum is : " + (X + Y) + '\n' +
                "the Difference is : " + (X - Y) + '\n' +
                "the Product is : " + X * Y + '\n' +
                "the Average is : " + 1.0f * (X + Y) / 2 + '\n' +
                "the Distance is : " + abs((X - Y)));
        if (X > Y) System.out.println("the maximum number is :" + X + '\n' +
                "the minimum is :" + Y);
        else System.out.println("the maximum number is :" + Y + '\n' +
                "the minimum is :" + X);


//Sum of two integers: 30
//Difference of two integers: 20
//Product of two integers: 125
//Average of two integers: 15.00
//Distance of two integers: 20
//Max integer: 25
//Min integer: 5
    }
}
