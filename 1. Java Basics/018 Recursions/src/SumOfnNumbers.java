import java.util.Scanner;

public class SumOfnNumbers
{
    public static int findSum(int num)
    {
        if (num == 0)
        {
            return 0;
        }
        else {
            return num + findSum(num - 1);
        }
    }

    public static void main(String[] ags)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println(findSum(num));
    }
}
