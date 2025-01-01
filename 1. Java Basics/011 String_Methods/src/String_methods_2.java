import java.util.Scanner;
import javax.swing.JOptionPane;

public class String_methods_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = JOptionPane.showInputDialog("Enter a string: ");

        System.out.println("Enter a begin-index and an end-index: ");
        int beginIndex = sc.nextInt();
        int endIndex = sc.nextInt();

        //Returns a new string that is a substring of the current string, starting from the specified index to the end.
        String subStr1 = str.substring(beginIndex);
        System.out.println("Substring type-1: " + subStr1);

        //Returns a substring starting from the specified beginIndex to endIndex - 1.
        String subStr2 = str.substring(beginIndex, endIndex);
        System.out.println("Substring type-2: " + subStr2);

        sc.close();
    }
}