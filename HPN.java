package Patterns;

public class HPN {

    public static void main(String[] args) {
        int i, k;
        int row = 5;

        for (i = 1; i <= row; i++) {

            for (k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println("");

        }
    }
}
