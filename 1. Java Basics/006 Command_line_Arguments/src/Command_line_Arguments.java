public class Command_line_Arguments {

    public static void main(String[] args){

        System.out.println("Who is your OOP_JAVA professor?");
        System.out.println(args[0]); // You can access the arguments using the array index args[index].

        System.out.println("What is your roll number?");
        /*
        Command-line arguments are always passed as strings.
        You need to convert them to other types (like int, double, etc.) if needed.
         */
        int num = Integer.parseInt(args[1]);

        System.out.println("My roll number: "+ num);
    }
}
