package Patterns;

public class PascalTriangle {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;

        }
        return result;

    }

    public static void main(String[] args) {
        int row = 5;

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= row - i; j++) {
                System.out.print(" ");

            }

            for (int j = 0; j <= i; j++) {

                System.out.print(factorial(i) / (factorial(i - j) * factorial(j)) + " ");

            }

            System.out.println("");
        }
    }

}
