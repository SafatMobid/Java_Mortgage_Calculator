public class Calculator {
    public static double Mortgage(double principal, double interest, double months){

    double value = Math.pow(1 + interest , months);
    return principal * ((interest * value)/(value - 1));

    }
}