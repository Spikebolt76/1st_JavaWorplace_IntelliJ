public class Switch_variables {

    public static void main(String[] args) {

        int num1 = 13;
        int num2 = 24;

        //Switching both variables with the help of temp:
        System.out.println("Values before switching: \nnum1= " + num1 + " \nnum2= " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Values after swapping: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}