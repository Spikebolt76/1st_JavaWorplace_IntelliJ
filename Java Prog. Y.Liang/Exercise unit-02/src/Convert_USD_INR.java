import java.util.Scanner;

public class Convert_USD_INR {
    // Constant for conversion rate
    public static final double USD_TO_INR_RATE = 85.62;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What Operation do you want? : \n 1) USD to INR \n 2) INR to USD");
        short choice = sc.nextShort();

        switch (choice) {
            case 1:
                usdToInr(sc); // Pass the scanner object
                break;
            case 2:
                inrToUsd(sc); // Pass the scanner object
                break;
            default:
                System.out.println("Invalid! Please enter a valid choice!");
        }

        sc.close(); // Close scanner once all operations are done
    }

    public static void usdToInr(Scanner sc) {
        System.out.println("\n======== USD TO INR CONVERSION ========");
        System.out.println("==> Enter the amount in US Dollars:");

        double usd = sc.nextDouble();
        double inr = usd * USD_TO_INR_RATE;

        System.out.println("$ " + usd + " == ₹ " + inr);
    }

    public static void inrToUsd(Scanner sc) {
        System.out.println("\n======== INR TO USD CONVERSION ========");
        System.out.println("==> Enter the amount in Indian Rupees:");

        double inr = sc.nextDouble();
        double usd = inr / USD_TO_INR_RATE;

        System.out.println("₹ " + inr + " == $ " + usd);
    }
}
