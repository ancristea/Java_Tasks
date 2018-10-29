package Task1;

public class Division {

    public static void main(String[] args) {

        int i;

        System.out.println("Division by 5: ");
        for(i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Division by 3: ");
        for(i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Division by 3 and 5 simultaneously: ");
        for(i = 0; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
