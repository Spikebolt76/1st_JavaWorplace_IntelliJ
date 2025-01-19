// Write a program to find that given number is palindrome or not.

import java.util.Scanner;

public class CheckForPalindrome
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int num = input.nextInt();
        int temp = num;
        int reverseNum = 0, remain = 0;

        while (temp % 10 != 0)
        {
            remain = temp % 10;
            reverseNum = reverseNum * 10 + remain;
            temp /= 10;
        }

        if (num == reverseNum)
        {
            System.out.println("The number IS Palindrome.");
        }
        else
        {
            System.out.println("The number is NOT Palindrome.");
        }

        input.close();
    }
}
