import java.util.Scanner;

public class SubsequenceDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sc.nextLine();

        int i, j, count = 0, ln = str.length();


        for (i = 0; i <  ln; i++)
        {
            for (j = 0; j <= i; j++) {

                    System.out.println("" + str.charAt(j) + str.charAt(i));


            }
        }
    }
}
