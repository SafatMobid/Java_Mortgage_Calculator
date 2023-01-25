import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Loan amount:");
        double principal = input.nextDouble();
        System.out.println("Loan amount:" + principal);

        System.out.println("Enter your Down Payment:");
        double downPayment = input.nextDouble();
        System.out.println("Down Payment Amount:" + downPayment);

        System.out.println("Enter Interest Rate:");
        double interest = (input.nextDouble()/100)/12;
        System.out.println("Interest is:" + interest);

        System.out.println("Loan term in years:");
        double months = input.nextDouble()*12;
        System.out.println("Loan term in months:" + months);

        double value = Math.pow(1 + interest , months);

        double payment = (principal - downPayment) * ((interest * value)/(value - 1));

        System.out.println("Your monthly payment is:" + payment);
        System.out.println("Your BiWeekly Payment is:" + (payment/2));

        input.close();
    }
}
