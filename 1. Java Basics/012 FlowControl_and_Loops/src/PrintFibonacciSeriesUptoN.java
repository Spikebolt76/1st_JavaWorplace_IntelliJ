import java.util.Scanner;

public class PrintFibonacciSeriesUptoN
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int nth, i;
        long first = 0, second = 1, next;

        System.out.println("\nEnter the number of terms in Fibonacci Series: ");
        nth = input.nextInt();

        System.out.println("\n|| FIBONACCI SERIES ||\n");

        for (i = 0; i < nth; i++)
        {
            if (i == 0)
            {
                System.out.print(first + ", ");
                continue;
            }
            if (i == 1)
            {
                System.out.print(second + ", ");
            }

            next = first + second;
            System.out.print(next);

            first = second; // update the first and second predecessors
            second = next;

            if (i < nth - 1)
            {
                System.out.print(", ");
            }
        }
    }
}
