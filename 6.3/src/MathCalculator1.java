public class MathCalculator1 {
    public static double findAverage(double[] number) {
        double sum = 0.0;
        double avg = 0.0;
        for (double x : number) {
            sum += x;
        }
        avg = sum / number.length;
        return avg;
    }

    public static double findAverage(int[] number) {
        double sum = 0.0;
        double avg = 0.0;
        for (int x : number) {
            sum += x;
        }
        avg = sum / number.length;
        return avg;
    }
    public static int factorial (int number) {
        int fact = 1;
        for (int i=number; i>0; i--) {
            fact *= i;
        }
        return fact;
    }
}
