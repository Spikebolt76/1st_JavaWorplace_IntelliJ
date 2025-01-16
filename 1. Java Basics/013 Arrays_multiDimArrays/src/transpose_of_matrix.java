public class transpose_of_matrix
{
    public static void main(String[] args)
    {
        int[][] matrix = {
                {41, -5, 17},
                {12, 17, -10},
                {1, 0, 31}
        };

        System.out.println("Given Matrix :");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }

        System.out.println();
        int temp = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = i + 1; j < matrix[0].length; j++)
            {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("Transposed Matrix :");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }

    }
}