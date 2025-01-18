import java.util.Scanner;
import javax.swing.JOptionPane;

public class String_methods_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = JOptionPane.showInputDialog("Enter a string: ");

        // indexOf(int ch); Returns the index of the first occurrence of the specified character.
        // Note: Returns -1 if the character is not found.
        System.out.println("Enter a character (to find its 1st Occurrence): ");
        char ch1 = sc.next().charAt(0);  //charAt(0) is as default, accepts the fist char of the string
        int index2 = str.indexOf(ch1);
        System.out.println("index of character " + ch1 + "is : " + index2);

        sc.close();
    }
}