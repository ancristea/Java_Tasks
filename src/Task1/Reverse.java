package Task1;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        String input ;
        String output = " " ;
        Scanner in = new Scanner(System.in);
        System.out.println(" enter the phrase : ");
        input = in.nextLine();

        for(int i = input.length() - 1; i >= 0; i--)
                    output = output + input.charAt(i);


        System.out.println("Reversed string is:" + '\n'+ output);

    }
}
