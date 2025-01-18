import java.util.Scanner;

public class ReverseTheString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("Original String : " + str);

        String revStr = "";
        int n = str.length();

        for (int i = 0; i < n; i ++)
        {
            revStr += str.charAt(n - 1 - i);
        }
        System.out.println("Reversed String = " + revStr);


//  revStr.charAt(i) = str.charAt(n - 1 - i);  Issue

//  String is immutable:

//  revStr.charAt(i) = str.charAt(n - i) is invalid because strings in Java are immutable.
//  You cannot change the characters of a string directly.

//  Fix: Use a StringBuilder instead of String for mutable strings.
    }
}
