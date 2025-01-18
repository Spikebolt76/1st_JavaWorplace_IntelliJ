// A program to write the n-th fibonacci number :

// [IMO the best program to understand how * Recursions * works ]

import java.util.Scanner;

public class Nth_Num_Fibonacci
{
    public static int fibonacci(int nth)
    {
        if (nth == 0) return 0; // Base case 1
        if (nth == 1) return 1; // Base case 2
        return fibonacci(nth - 1) + fibonacci(nth - 2);

    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n-th number : ");
        int nth = input.nextInt();

        System.out.println("n-th number of the fibonacci series = " + fibonacci(nth));
    }
}
