import java.util.Scanner;

public class Main {
    public static double futureValueCalc(double P, double r, int t){
        int DAYS_IN_YEAR = 365;
        // P = principal amount (initial deposit amount)
        // r = annual interest rate
        // t = total numbers of years the deposit will earn interest
        return P * (Math.pow((1 + (r / DAYS_IN_YEAR)), (DAYS_IN_YEAR * t)));
    }

    public static void main(String[] args) {
        // CREATE AN INSTANCE OF SCANNER NAMED s
        Scanner s = new Scanner(System.in);

//        Calculator 2: A calculator that determines the future value of a
//        one-time deposit assuming compound interest - it is used to help
//        you decide how much a CD will be worth when it matures

//        a. It would accept the deposit, interest rate, and number of
//        years from the user

//        b. It would display the future value and the total interest earned

//        Example: If you deposit $1,000 in a CD that earns 1.75%
//        interest and matures in 5 years, your CD's ending balance will
//        be $1,092.62, and you would have earned $92.62 in interest
//        Note: The numbers above assume daily compounding

        // INTRO
        System.out.println("\n--------------- CD Future Value Calculator ---------------");

        // USER INPUT VARIABLES
        System.out.println("\nPlease enter your initial deposit amount e.g. 1000: ");
        double principalAmount = s.nextDouble();

        System.out.println("Please enter the annual interest rate e.g. 1.75: ");
        double rawRate = s.nextDouble();
        // convert rate from % to decimals
        double annualInterestRate = rawRate / 100;

        System.out.println("Please enter the total number of years until CD is matured e.g. 5: ");
        int years = s.nextInt();

        // OUTPUTS
        double futureValue = futureValueCalc(principalAmount,annualInterestRate,years);
        double total_Interest_Earned = futureValue - principalAmount;

        // DISPLAY
        System.out.printf("\nIf you deposit $%.2f in a CD that earns %.2f%% interest and matures in %d years,\nyour CD's ending balance will be $%.2f,\nand you would have earned $%.2f in interest\n\n*** Note: The numbers above assume daily compounding.***\n", principalAmount, rawRate, years, futureValue, total_Interest_Earned);
    }
}