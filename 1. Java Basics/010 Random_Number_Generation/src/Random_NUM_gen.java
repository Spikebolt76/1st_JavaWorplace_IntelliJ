import java.util.Random;

//Not Truly Random: It’s a pseudo-random number generator (PRNG) and not suitable for cryptographic purposes.
//Thread Safety: Random is not thread-safe.

public class Random_NUM_gen {

    public static void main(String[] args){

        //Random is a class from java.util.Random package, and 'random' is an Instance of the class Random
        Random random = new Random(); //Generates a random number for specific dataType in its bounded range

        //auto dice:
        int x = random.nextInt(6) + 1; // 6 is called a "Seed" for the nextInt method of random instance

        System.out.println(x);

        //using some arithmetic, we can generate a random number with any kind of range
    }
}
