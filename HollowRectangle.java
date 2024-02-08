package Patterns;

public class HollowRectangle {

    public static void main(String[] args) {
        int i, j;
        int row = 4, col = 5;

        for (i = 1; i <= row; i++) {
            for (j = 1; j <= col; j++) {
                if (i == 1 || j == 1 || i == row || j == col) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }

            }
            System.out.println("");
        }
    }
}
