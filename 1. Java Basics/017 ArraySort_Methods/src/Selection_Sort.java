
public class Selection_Sort
{
    static void selectionSort(int[] arr)
    {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++)
        {
            int least = i;
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] < arr[least])
                {
                    least = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[least];
            arr[least] = temp;
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
       int n = arr.length;

        System.out.println("Original Array : ");
        printArray(arr);

        selectionSort(arr);

        System.out.println();
        System.out.println();
        System.out.print("Sorted array: ");
        printArray(arr);

    }
}
