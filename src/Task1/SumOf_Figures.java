package Task1;

import java.util.Scanner;

public class SumOf_Figures {
    public static void main(String[] args) {

        int Sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println(" enter the number ");
        int number = in.nextInt();

        while ( number % 10 != 0 )

        {
            Sum += number % 10;
            number = number / 10;
        }

        System.out.println("Sum is : " + Sum);
    }
}

