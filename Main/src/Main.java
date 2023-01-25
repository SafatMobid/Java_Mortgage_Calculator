import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the house price:");
        double housePrice = input.nextDouble();
        System.out.println("House cost:" + housePrice);

        System.out.println("Enter Loan amount:");
        double principal = input.nextDouble();
        System.out.println("Loan amount:" + principal);

        System.out.println("Enter your Down Payment:");
        double downPayment = input.nextDouble();
        System.out.println("Down Payment Amount:" + downPayment);

        System.out.println("Enter Interest Rate:");
        double interest = (input.nextDouble()/100)/12;

        System.out.println("Loan term in years:");
        double months = input.nextDouble()*12;
        System.out.println("Loan term in months:" + months);

        double insurance = 0;

        if (downPayment < (housePrice * 0.2)){
            insurance = principal * 0.01;
        }

        double payment = Calculator.Mortgage(principal, interest, months);

        System.out.println("Your monthly payment is:" + (payment + insurance));
        System.out.println("Your BiWeekly Payment is:" + (((payment + insurance)/2)));

        input.close();
    }
}
