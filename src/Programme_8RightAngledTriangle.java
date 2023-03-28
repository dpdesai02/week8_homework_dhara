/*
. Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@


 */

import java.util.Scanner;

public class Programme_8RightAngledTriangle {
    private static Scanner scanner;


    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {           // for printing each line
            for (int j = 0; j < 5; j++) {
                System.out.print("");
            }
            for (int k = 0; k <= i; k++) {      // for printing pattern
                System.out.print("@ ");
            }
            System.out.println();
        }


    }
}
