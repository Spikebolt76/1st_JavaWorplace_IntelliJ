public class MethodOverloading
{
    public static int add(int a, int b)
    {
        return a + b;
    }

    public static int add(int a, int b, int c)
    {
        return a + b + c;
    }

    public static double add(double a, double b)
    {
        return a + b;
    }

    public static double add(double a, double b, double c)
    {
        return a + b + c;
    }

    public static void main(String[] args)
    {
        int i1 = 33, i2 = 43, i3 = 56;
        double d1 = 45.0, d2 = 56.7, d3 = 12.5;

        System.out.println(add(i1, i2));

        System.out.println(add(i1, i2, i3));

        System.out.println(add(d1, d2));

        System.out.println(add(d1, d2, d3));
    }
}
