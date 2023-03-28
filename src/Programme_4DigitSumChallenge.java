/*. Digit Sum Challenge
Write a method with the name sumDigits that has one int parameter called number.
If the parameter is >= 10 then the method should process the number and return sum of all digits,
otherwise return -1 to indicate an invalid value.
The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1) should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine that it is working
correctly for valid and invalid values passed as arguments.
Hint: Use n % 10 to extract the least-significant digit.
 Use n = n / 10 to discard the least-significant digit.
 The method needs to be static
// Create a class with the name DigitSumChallenge.*/

import java.util.Scanner;

public class Programme_4DigitSumChallenge {
    public static void main(String[] args) {
        long n, res;
        SumOfDigits s = new SumOfDigits();//calling method
        Scanner scanner = new Scanner(System.in);// scanner
        System.out.println("Enter a number ");
        n = scanner.nextLong();

        System.out.println("Sum of digits of a number is " + s.sum(n));
        scanner.close();//scanner closing
    }

}

//create a method
class SumOfDigits {
    int sum = 0;//instance variable

    int sum(long num) {

        if (num != 0) {
            sum += num % 10;
            num /= 10;
            sum(num);
        }
        return sum;//return value
    }
}


