
import java.util.Scanner;

public class CharCounter {

    public static void main(String[] args) {

        String input;
        Scanner in = new Scanner(System.in);
        System.out.println(" enter the phrase : ");
        input = in.nextLine();
        int X_Letters = 0;
        int Y_Spaces = 0;
        int Z_Figures = 0;
        int O_others = 0;


        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                X_Letters++;
            } else if (Character.isDigit(input.charAt(i))) {
                Z_Figures++;
            } else if (Character.isWhitespace(input.charAt(i))) {
                Y_Spaces++;
            } else O_others++;
        }

        System.out.println("Lettres: " + X_Letters);
        System.out.println("Spaces: " + Y_Spaces);
        System.out.println("Numbers: " + Z_Figures);
        System.out.println("Others: " + O_others);

    }
}

