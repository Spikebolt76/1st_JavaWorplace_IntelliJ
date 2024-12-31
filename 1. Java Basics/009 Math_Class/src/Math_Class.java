public class Math_Class
{
    public static void main(String[] args) {
        /*
        Overview of Math Class:
            The Math class in Java is a part of the java.lang package, so it's automatically imported into every Java program.
            It provides a set of static methods for performing mathematical operations such as basic arithmetic, trigonometry,
            exponential calculations, and more.

            Static Methods: All methods in the Math class are static, meaning you can call them without creating
                            an instance of the class.
         */
        //two mainly used constants:
        System.out.println("Value of Pi= " + Math.PI);
        System.out.println("Value of e= " + Math.E);

        //Arithmatic Operations:
        int absValue = Math.abs(-10);
        System.out.println("absValue ="+ absValue);

        int maxVal = Math.max(5, 10);
        System.out.println("maxVal ="+ maxVal);

        int minVal = Math.min(5, 10);
        System.out.println("minVal ="+ minVal);

        //Rounding Operations:
        double cielVal = Math.ceil(3.2);
        System.out.println("cielVal ="+ cielVal);

        double floorVal = Math.floor(3.8);
        System.out.println("floorVal ="+ floorVal);

        int roundVal1 = Math.round(11.5f);
        System.out.println("roundVal ="+ roundVal1);
        long roundVal2 = Math.round(188.4);  //for greater precision
        System.out.println("roundVal ="+ roundVal2);

        //Exponential and Log. functions
        double powerVal = Math.pow(2, 3);
        System.out.println("powerVal ="+ powerVal);

        double sqrtVal = Math.sqrt(16);
        System.out.println("sqrtVal ="+ sqrtVal);

        double expVal = Math.exp(1);  //returns the value of e^x
        System.out.println("expVal ="+ expVal);

        double logVal = Math.log(Math.E); // base e
        System.out.println("logVal ="+ logVal);

        double log10val = Math.log10(100); //base 10
        System.out.println("log10val ="+ log10val);

        //trigonometric Functions:
        double sine = Math.sin(Math.PI / 2); //same goes for cos, tan...
        System.out.println("sine ="+ sine);

        double radian = Math.toRadians(180);  //converts degree into radian
        System.out.println("radian ="+ radian);

        double x = Math.asin(1.0); //arcsine... same for atan, acos...
        System.out.println("x ="+ x);

        //special methods:
        double cubeRoot = Math.cbrt(27);
        System.out.println("cubeRoot ="+ cubeRoot);

        double hypotenuse = Math.hypot(3, 4);
        System.out.println("hypotenuse ="+ hypotenuse);

        //random number generations:
        double randomNum = Math.random();
        double scaledNum = randomNum * 10; // Random number between 0 and 10
        System.out.println("scaledNum ="+ scaledNum);
    }
}
