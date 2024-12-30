import java.util.Scanner;

public class Scanner_class_userInput {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = input.nextLine();  //The program execution pauses here, until user-input
        System.out.println("How old are you? ");
        int age = input.nextInt();    //Only reads numeric portion of the input buffer, leaving the newline (enter<])
        input.nextLine();  //Clears the scanner buffer, removing any leftover newlines and characters
        System.out.println("What is ypu favourite food? ");
        String food = input.nextLine();

        System.out.println("Hello " + name + "!");
        System.out.println("You are "+ age +" years old.");
        System.out.println("You love "+ food +"!");

        System.out.println("what's you favourite video game? ");
        String game = input.next();  //Only reads the first token of the input, leaves newline
        System.out.println(game);
        input.nextLine();   //again, clears the scanner buffer
        String demo = input.nextLine();
        System.out.println(demo);

        input.close();   //Completely closes the Scanner Object, clearing out the resources that were being used previously by it
    }
}
