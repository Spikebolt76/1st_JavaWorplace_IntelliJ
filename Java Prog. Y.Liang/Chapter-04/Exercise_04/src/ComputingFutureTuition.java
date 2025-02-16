public class ComputingFutureTuition {

    public static double compute_1(double tuition, double rate) {
        for (int i = 1; i <= 10; i++) {
            tuition += (tuition * rate) / 100;
        }
        return tuition;
    }

    public static double compute_2(double newTuition, double rate, int yearsFromNow) {
        double tuitionOf4yrs = 0;

        for (int i = 0; i < 4; i++) { // Only 4 years
            tuitionOf4yrs += newTuition; // Add first, then increase
            newTuition += (newTuition * rate) / 100;
        }

        return tuitionOf4yrs;
    }

    public static void main(String[] args) {
        double tuition = 40000.0;
        double rate = 3; // Growth rate per year

        double newTuition = compute_1(tuition, rate);
        System.out.printf("Total Tuition in 10 years = $%.2f%n", newTuition);

        double newTuition_2 = compute_2(newTuition, rate, 11);
        System.out.printf("Total Tuition for 4 years starting from year 11 = $%.2f%n", newTuition_2);
    }
}
