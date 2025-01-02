import java.util.ArrayList;
import java.util.Scanner;

public class Linear_Search_demo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int max;

        System.out.println("Enter size of the array: ");
        max = scanner.nextInt();

        int[] searchList = new int[max];
        System.out.println("Enter elements of the array: ");

        for (int i = 0; i < searchList.length; i++)
        {
            searchList[i] = scanner.nextInt();
        }

        System.out.println("Enter a number to search: ");
        int searchElm = scanner.nextInt();
        scanner.close();

        boolean flag = false;
        for (int i = 0; i < max; i++)
        {
            if (searchElm == searchList[i])
            {
                System.out.println("Element "+ searchElm +" found at index = "+ i);
                flag = true;
                break;
            }
        }
        if (!flag)
        {
            System.out.println("Element "+ searchElm +" Not found in the search-list !");
        }
    }
}
