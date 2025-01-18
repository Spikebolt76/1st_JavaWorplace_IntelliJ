import java.util.Scanner;

public class ReverseTheString_Recursive
{
    public static String Reverse(String str, int n)
    {
        if (n == 0)
        {
            return "";
        }
        return str.charAt(n - 1) + Reverse(str, n - 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        int length = str.length();

        System.out.println("Original String = " + str);

        String revStr = Reverse(str, length);

        System.out.println("Reversed String = " + revStr);
    }
}


//import java.util.Scanner;
//
//public class ReverseTheString_Recursive
//{
//    public static String Reverse(String str)
//    {
//        // Base case: If the string is empty or has a single character, return it
//        if (str.isEmpty())
//        {
//            return str;
//        }
//
//        // Recursive case: Reverse the substring (excluding the first character), and add the first character at the end
//        return Reverse(str.substring(1)) + str.charAt(0);
//    }
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a String : ");
//        String str = sc.nextLine();
//
//        System.out.println("Original String = " + str);
//
//        // Call the reverse function
//        String revStr = Reverse(str);
//
//        System.out.println("Reversed String = " + revStr);
//    }
//}
