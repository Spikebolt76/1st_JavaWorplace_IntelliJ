// Insertion sort = after comparing elements to the left,
//				shift elements to the right to make room to insert a value

//				Quadratic time O(n^2)
//				small data set = decent
//				large data set = BAD

//				Less steps than Bubble sort
//				Best case is O(n) compared to Selection sort O(n^2)

public class Insertion_Sort
{
    static void InsertionSort(int[] arr)
    {
        for (int i = 1; i < arr.length; i ++)
        {
            int temp = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > temp)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    static void printArray(int[] arr)
    {
        for (int val : arr)
        {
            System.out.print(val + ", ");
        }
    }

    public static void main(String[] args)
    {
        int arr[] =  {56, 34, 243, 45, 1, 82, 10, 743, 21, -34, -19, 38, 32, 55, 29, 46, -45, 90, 3, 6, 2};

        System.out.println("Original Array : ");
        printArray(arr);

        InsertionSort(arr);

        System.out.println();
        System.out.println();
        System.out.print("Sorted array: ");
        printArray(arr);
    }
}
