/*
the total price of the product is the price of the product plus the sales tax. Suppose the sales tax is 6%.
Writer a program that reads the price of the product and displays the total cost of the product :
 */

import java.util.Scanner;

public class Computing_Total_Cost {
    public static final int TAX_RATE = 6;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the product :");
        int price = sc.nextInt();

        double total_Price = price + (((double) price * TAX_RATE) / 100);
        System.out.println("The total price of the product = "+ total_Price);
    }
}
