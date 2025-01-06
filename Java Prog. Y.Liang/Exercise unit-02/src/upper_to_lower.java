import java.util.Scanner;

public class upper_to_lower
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a lowercase character :");
        String str = sc.nextLine();
        char lowercase = str.charAt(0);

        int offset = 'a' - 'A';  //Implicit typecasting; from character to integer

        char uppercase = (char) (lowercase - offset);  //Explicit typecasting; from integer to character
        System.out.println("input character in uppercase: "+ uppercase);
    }
}
