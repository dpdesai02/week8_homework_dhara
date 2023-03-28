/*
Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * *

 */

import java.util.Scanner;

public class Programme_15LeftAngleTriangle {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);//scanner

        System.out.println("Enter the number of rows: ");
        int n = scanner.nextInt();
        scanner.close();
        int rows = 5;

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}




