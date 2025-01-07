import java.util.Scanner;

public class ComputeLoan
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter yearly interest rate (in %), for example 8.25 : ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;  //in decimal format

        System.out.println("Enter number of years : ");
        int numberOfYears = input.nextInt();

        System.out.println("Enter loan amount : ");
        double loanAmount = input.nextDouble();

        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

        double totalPayment = monthlyPayment * numberOfYears * 12;

        //format to keep two digits after the decimal point :
        monthlyPayment = (int) (monthlyPayment * 100) / 100.0;
        totalPayment = (int) (totalPayment * 100) / 100.0;

        System.out.println("The monthly payment is " + monthlyPayment);
        System.out.println("The total payment is " + totalPayment);

        input.close();
    }

}
