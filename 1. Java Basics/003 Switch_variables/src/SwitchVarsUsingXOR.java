import java.util.Scanner;

public class SwitchVarsUsingXOR
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integer : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd integer : ");
        int b = sc.nextInt();

        System.out.println("Before swapping : a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping : a = " + a + ", b = " + b);

        sc.close();
    }
}
