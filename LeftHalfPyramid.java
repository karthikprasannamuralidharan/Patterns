package Patterns;

public class LeftHalfPyramid {

    public static void main(String[] args) {
        int i, j;
        int row = 4;

        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
    }

}
