import java.util.Scanner;

// binary search algorithm does not work on normal iterations, it's done by breaking the array in half each time:

public class BINARY_SEARCH_demo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] searchList = {3, 12, 18, 25, 34, 42, 55, 63, 74, 85, 97, 104, 115, 123, 137, 150, 162, 178, 190, 205};

        int max = searchList.length - 1;
        int min = 0;

        System.out.println("Enter a number to search: ");
        int searchElm = scanner.nextInt();
        boolean flag = false;

        while (max >= min)
        {
            int mid = (max + min) / 2;
            if (searchList[mid] > searchElm) {
                max = mid - 1;
            } else if (searchList[mid] == searchElm) {
                System.out.println("Element found at index = " + mid);
                flag = true;
                break;
            } else {
                min = mid + 1;
            }
        }

        if (!flag)
        {
            System.out.println("Input element NOT FOUND in search-list !");
        }
    }
}
