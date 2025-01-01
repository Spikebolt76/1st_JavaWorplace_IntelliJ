public class String_methods_5 {

    public static void main(String[] args) {

        String text = "Hello, world! Welcome to the world of Java programming.";

        // Example for lastIndexOf(int ch)
        char character = 'o';
        int lastIndexChar = text.lastIndexOf(character);
        System.out.println("Last occurrence of character '" + character + "' is at index: " + lastIndexChar);

        // Example for lastIndexOf(String str)
        String word = "world";
        int lastIndexString = text.lastIndexOf(word);
        System.out.println("Last occurrence of string \"" + word + "\" is at index: " + lastIndexString);
    }
}
