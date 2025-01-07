/*
Write a program that reads an integer between 0 and 10000, add all the digits in the integer.
EX; if the integer is 932, then the sum of all digits is 14.
 */
import java.util.Scanner;

public class Summing_digits_in_Integer {
    public static <go> void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer between 1 and 10000 :");
        int num = sc.nextInt();
        if ((num >= 0 && num <= 10000))
        {
            int sum = 0;

            while (num != 0) {
                sum += (num % 10);
                num /= 10;
            }

            System.out.println("Sum of all digits of the input integer is = "+ sum);
        }
        else{
            System.out.println("Input invalid, Enter a valid integer !");
        }
    }
}
