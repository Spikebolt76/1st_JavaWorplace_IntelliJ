import java.util.ArrayList;

public class matrix_2D_arrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // Initialize the 3x3 matrix
        for (int i = 0; i < 3; i++) {
            matrix.add(new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                matrix.get(i).add(i + j); // Fill with some values
            }
        }

        // Print the matrix
        for (ArrayList<Integer> row : matrix) {
            System.out.println(row);
        }
    }
}
