import java.util.Scanner;

public class ComputeChange_monetaryUnits
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the total amount in double (e.g, 10.56) : ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);  //number of total cents

        int numberOfDollars = remainingAmount / 100;
        remainingAmount %= 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        int numberOfPennies = remainingAmount;

        String output = "Your amount "+ amount +" consists of \n" + numberOfDollars + " dollars \n" + numberOfQuarters + " quarters \n" + numberOfDimes + " dimes \n" + numberOfNickels + " nickels \n" + numberOfPennies + " pennies";

        System.out.println(output);

        input.close();
    }
}
