package Patterns;

public class Pattern1 {

    public static void main(String[] args) {

        int number = 5;

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }

            for (int k = number; k >= 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
