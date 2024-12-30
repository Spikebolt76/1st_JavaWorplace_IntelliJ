import java.util.Scanner;

public class convert_String_to_Int {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        In most programming languages like C, C++, Java, and Python, you can't directly typecast a string to an int.
        Instead, you need to use a function or method to perform the conversion.

        Why Explicit Type Casting Doesn't Work:
        Typecasting works when the two types have a compatible memory structure or representation (e.g., casting float
        to int). A string and an int are fundamentally different in structure, so a conversion function is required to
        interpret the string content as a number.
         */
        System.out.println("Enter your Roll number: ");
        String rollNum = sc.nextLine();

        if (rollNum.matches("\\d+"))         //regular expressions
        {                                        // Check if input contains only digits
            int cnvtNum = Integer.parseInt(rollNum);
            System.out.println("Your rol number is: " + cnvtNum);
        }
        else
        {
            System.out.println("Invalid input: " + rollNum);
        }
    }
}
