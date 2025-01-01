import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_intro
{
    public static void main(String[] args)
    {
        // ArrayList is a resizable array implementation of the List interface.
        // Unlike arrays, it can grow or shrink dynamically as elements are added or removed.
        // Stores reference data-types
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<String>();

        names.add("Jinesh");
        names.add("Akash");
        names.add("Jeel");
        names.add(sc.nextLine());
        names.add(1, "Dhruv"); //Inserts an element at the specified index
        names.set(0, "SpikeBolt");  //replaces the element at the specified index

        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        names.clear();  //clears the ArrayList

        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
    }
}
