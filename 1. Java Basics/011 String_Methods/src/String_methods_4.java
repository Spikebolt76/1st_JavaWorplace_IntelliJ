import java.util.Scanner;
import javax.swing.JOptionPane;

public class String_methods_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = JOptionPane.showInputDialog("Enter a string: ");

        //indexOf(string str); Returns the index of the first occurrence of the specified substring.
        System.out.println("Enter a substring: (to get the its 1st Occurrence): )");
        String subStr3 = sc.nextLine();
        int index3 = str.indexOf(subStr3);
        System.out.println("Index of the substring is: " + index3);

        sc.close();
    }
}