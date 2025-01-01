//That syntax is called the enhanced for loop, or for-each loop, in Java. It's designed to iterate over elements
// in a collection, such as arrays, without the need to manually manage the index.
//for (dataType variable : collection) {
//    // Code to process each element
//}

public class for_each_Loop
{
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40};

    // Using enhanced for loop to print all elements
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
