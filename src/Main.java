import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Calculator 2: A calculator that determines the future value of a
//        one-time deposit assuming compound interest - it is used to help
//        you decide how much a CD will be worth when it matures

//        a. It would accept the deposit, interest rate, and number of
//        years from the user

        // USER INPUT VARIABLES
        Scanner s = new Scanner(System.in);
//        Principal (P): This is the initial deposit amount.
        System.out.println("How much is your deposit? e.g. 1000");
        double principalAmount = s.nextDouble();
        double P = principalAmount;

//        Annual Interest Rate (r): The nominal annual interest rate in decimal form
//        (e.g., 1.75% = 0.0175).
        System.out.println("How much is the Annual Interest Rate? e.g. 1.75");
        double rawRate = s.nextDouble();
        double annualInterestRate = rawRate / 100;
        double r = annualInterestRate;

//        Number of Years (t): The total number of years the deposit will earn interest.
        System.out.println("How many years until the CD matures? e.g. 5");
        int years = s.nextInt();
        int t = years;
//        Days Per Year: Daily compounding assumes 365 days per year.
//        Total Number of Days: This is 365 × t (because there are 365 days per year).

        // OUTPUT VARIABLES
//        Future Value (FV)
        double FV = 0;

//        Total Interest Earned = FV - P
        double total_Interest_Earned = 0;

        // FORMULAS
        FV = P * (1 + Math.pow((r / 365), (365 * t)));
        total_Interest_Earned = FV - P;
//        b. It would display the future value and the total interest earned
        // OUTPUTS
        System.out.printf("The future value of your CD is: $%.2f \n", FV);
        System.out.printf("The total interest you would have earned is: $%.2f \n", total_Interest_Earned);


//    Example: If you deposit $1,000 in a CD that earns 1.75%
//        interest and matures in 5 years, your CD's ending balance will
//        be $1,092.62 and you would have earned $92.62 in interest
//    Note: The numbers above assume daily compounding


    }
}