import java.util.ArrayList;
import java.util.Scanner;

public class arrayList_forEachLoop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Double>> matrix = new ArrayList<>();
        int i, j;

        for(i = 0; i < 3; i++)
        {
            matrix.add(new ArrayList<>());
            for(j = 0; j < 3; j++)
            {
                matrix.get(i).add(sc.nextDouble());
            }
        }

//        for (ArrayList<Double> row : matrix)       //to print individual elements
//        {
//            for (double value : row)
//            {
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        }

        for (ArrayList<Double> row : matrix)
        {
            System.out.println(row);
        }

    }
}
