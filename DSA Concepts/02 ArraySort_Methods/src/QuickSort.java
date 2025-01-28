import java.util.Random;

public class QuickSort
{
    public static void quickSort(int[] arr, int low, int high)
    {
        int pivot = high;   //index of pivot element
        int lp = low;       //left pointer index
        int rp = high - 1;  //right pointer index

        while (lp < rp)
        {
            while (arr[lp] > arr[pivot] && lp < rp)
            {
                lp ++;
            }

            while (arr[rp] < arr[pivot] && lp < rp)
            {
                rp--;
            }


        }

    }

    public static void printArray(int[] arr)
    {
        for (int num : arr)
        {
            System.out.print(num + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Random rd = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rd.nextInt(100);
        }

        System.out.println("Original array (Unsorted) : ");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array (QuickSort) : ");
        printArray(arr);

    }
}