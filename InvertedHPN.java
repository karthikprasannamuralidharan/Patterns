package Patterns;

public class InvertedHPN {

    public static void main(String[] args) {
        int row = 5;

        for (int i = row; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(row + 1 - i);

            }
            System.out.println("");

        }
    }

}
