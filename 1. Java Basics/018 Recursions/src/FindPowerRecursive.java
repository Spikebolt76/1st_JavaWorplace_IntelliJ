import java.util.Scanner;

//the unused method will not affect performance or memory during the execution of your program.

// with time complexity of O(n) :-                     [ note : O(n) > O(log n) ]

public class FindPowerRecursive
{
    public static int FindPower(int num, int exp)
    {
        if (exp == 0)
        {
            return 1;
        }
        return num * FindPower(num, exp - 1);
    }

    // with time complexity of O(log n) :-
    //This approach significantly reduces the recursion depth.

    public static int FindPowerOptimized(int num, int exp)
    {
        if (exp == 0)
        {
            return 1;
        }

        int halfPower = FindPowerOptimized(num, exp / 2);

        if (exp % 2 == 0)
        {
            return halfPower * halfPower;
        }
        else
        {
            return halfPower * halfPower * num;
        }
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Enter the exponent [power] : ");
        int exp = sc.nextInt();

        System.out.println("Un-optimized => "+ num +" ^ "+ exp +" = " + FindPower(num, exp));
        System.out.println("Optimized => "+ num +" ^ "+ exp +" = " + FindPowerOptimized(num, exp));

        sc.close();
    }
}
