package Task1;

import java.util.Scanner;

public class ChekIfPalindrome {


    public static void main(String[] args) {
        String input;
        //String output = " " ;
        Scanner in = new Scanner(System.in);
        System.out.println(" enter the phrase : ");
        input = in.nextLine();
        int y = input.length();
        int x = 0;
//            for( int i<= y  i >= 0; i--){
//                if input.charAt(i) ==
//                        output = output + input.charAt(i);
//            }

         if (input.indexOf(y - 1) == input.indexOf(x)) {
                y--;
                x++;
            } else System.out.println("it is not a palindrome ((");
             System.out.println("this phrase is palindrome");
        }

        //System.out.println("Reversed string is:" + '\n'+ output);


    }



