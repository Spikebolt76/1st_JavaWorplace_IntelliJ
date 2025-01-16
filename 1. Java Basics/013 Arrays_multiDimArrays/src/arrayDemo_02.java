import java.util.Scanner;

public class arrayDemo_02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int arr1D[] = {10,25,36,28,29,3,6,978,24,65,35,68,92,65,26};    //Inserting Elements while Initialization

        int size1D = arr1D.length;
        System.out.println("size (length method) of 1D array = number of elements = " + size1D);

        int arr2D[][] = {{45, 54, 98}, {450, 540, 980}};   //Inserting Elements while Initialization

        int size2Dr = arr2D.length;
        int size2Dc = arr2D[1].length;
        System.out.println("length of 2D array = number of rows = " + size2Dr);
        System.out.println("length of 2D array's specific row = number of columns in that row = " + size2Dc);

    }

}
