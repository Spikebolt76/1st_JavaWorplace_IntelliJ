import java.util.Scanner;
import javax.swing.JOptionPane;

public class String_methods_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = JOptionPane.showInputDialog("Enter a string: ");

        int length = str.length();
        System.out.println("String length: " + length);

        System.out.println("Enter an Index (to return a character): ");
        int index1 = sc.nextInt();
        char ch = str.charAt(index1);
        System.out.println("character at index" + index1 + "is: " + ch);

        sc.close();
    }
}