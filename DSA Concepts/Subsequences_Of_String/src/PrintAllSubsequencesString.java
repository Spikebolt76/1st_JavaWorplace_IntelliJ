import java.util.Scanner;

public class PrintAllSubsequencesString
{
    public static void PrintSubsequences(String str)
    {
        int start = str.length();
        int end = 0;

        System.out.println("" + ", ");

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        PrintSubsequences(str);
    }
}
