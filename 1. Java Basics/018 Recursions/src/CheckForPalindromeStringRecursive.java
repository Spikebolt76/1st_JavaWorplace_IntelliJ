import java.util.Scanner;

public class CheckForPalindromeStringRecursive
{
    public static boolean isPalindrome(String str, int start, int end)
    {
        if (start >= end)
        {
            return true;
        }
        if (str.charAt(start) != str.charAt(end))
        {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();

        if (isPalindrome(str, 0, str.length() - 1))
        {
            System.out.println("The string \"" + str + "\" is a palindrome.");
        }
        else {
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }

        sc.close();
    }
}
