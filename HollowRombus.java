
package Patterns;

public class HollowRombus {
    public static void main(String[] args) {
        int row=5;
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <= row; j++) {
                if (i==1 || i==row || j==row || j==1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
            
        }
    }
    
}
