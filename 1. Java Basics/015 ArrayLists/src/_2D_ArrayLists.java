import java.sql.SQLOutput;
import java.util.ArrayList;

public class _2D_ArrayLists
{
    public static void main(String[] args)
    {
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> snacks = new ArrayList<>();

        snacks.add("Oreos");
        snacks.add("chips");
        snacks.add("candies");

        ArrayList<String> drinks = new ArrayList<>();

        drinks.add("Coke");
        drinks.add("coffee");

        ArrayList<String> bakery = new ArrayList<>();

        bakery.add("bread");
        bakery.add("donuts");
        bakery.add("cheese");

        groceryList.add(snacks);
        groceryList.add(drinks);
        groceryList.add(bakery);

        System.out.println(groceryList);

        groceryList.add(new ArrayList<>());  //to add an empty row in the existing 2D ArrayList

        ArrayList<String> otherStuff = groceryList.get(3);   //to name that added empty row

        otherStuff.add("shampoo");
        otherStuff.add("soap");
        otherStuff.add("face cleanser");

        System.out.println(groceryList);

        groceryList.get(1).add("pepsi");  //to add elements to specific row

        System.out.println(groceryList);

        String item1 = groceryList.get(3).get(2);  //to access elements of the rows
        System.out.println(item1);

        String row1 = String.valueOf(groceryList.get(3));
        System.out.println(row1);

        /*
        groceryList.get(index).set(index, element); : to update element

        groceryList.remove(index); : to remove a row, inner arraylist

        groceryList.get(index).remove(index); : to remove a specific element of row
         */
    }
}
