package Patterns;

public class Pattern2 {

    public static void main(String[] args) {

        int number = 5;

        for (int i = number; i >= 1; i--) {

            for (int j = 1; j <= number-i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i) - 1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
