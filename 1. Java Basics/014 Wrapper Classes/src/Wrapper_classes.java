public class Wrapper_classes
{
    public static void main(String[] args)
    {
        /*
        wrapper class = provides a way to use primitive data tuypes as reference data types.
                        Reference data-types contain useful methods, can be used with collections (ex. ArrayList)

        Primitive Type => Wrapper Class
        -------------------------------
        int	    Integer
        float	Float
        double	Double
        char	Character
        byte	Byte
        short	Short
        long	Long
        boolean	Boolean

        autoboxing = the automatic conversion that Java compiler makes between the primitive data-type and
                     their corresponding object wrapper class
        unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive data-type
        */
        Boolean a = true;
        Integer b = 45;
        Double c = 3.14;
        Character d = '$';
        String e = "Jinesh";

        int num1 = 5;
        Integer wrappedNum1 = num1;  // Autoboxing
        System.out.println(wrappedNum1); // Output: 5

        Integer wrappedNum2 = 10;
        int num2 = wrappedNum2; // Unboxing
        System.out.println(num2); // Output: 10
    }
}
