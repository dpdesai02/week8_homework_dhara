/*
Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value
 */

import java.util.Scanner;

public class Programme_11EvenDigitSum {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);//scanner

            System.out.print("Enter a number: ");

            long n = scanner.nextLong();

            Evendigits(n);//calling method in to main method
            scanner.close();//closing scanner

        }

        static void Evendigits ( long n)
        {
            System.out.println("Even digits are: ");

            for (long i = 0; i <= n; i += 2) {
                System.out.print(i + "  ");

            }


        }


    }
