
/*
Write a program in Java to display the pattern like a diamond.
 While loop
 *
 ***
 *****
 *******
 *********
***********
*************
***********
 *********
 *******
 *****
 ***
 *
 */

import java.util.Scanner;

public class Programme_14DiamondPattern {
    public static void main(String[] args) {
        // take input
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter N value: ");
        n = scanner.nextInt();
        printDiamond(n);
    }

    private static void printDiamond(int n) {
        if(n <= 0)
            System.out.println("Enter Positive Number");

        // for increasing portion
        for(int i=1; i<=n; i++) {
            // print space
            for(int j = i; j<=n; j++) {
                System.out.print(" ");
            }
            // print star
            for(int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            // new line
            System.out.println();
        }

        // for decrement portion
        for(int i=n-1; i >=1; i--) {
            // print space
            for(int j=n; j >= i; j--) {
                System.out.print(" ");
            }
            // print star
            for(int k=1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            // new line
            System.out.println();//
        }
    }

}
