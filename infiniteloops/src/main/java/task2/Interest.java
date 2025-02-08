package task2;

import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {

        final int COMPOUND_PER_YEAR = 1; // annual
        final double INTEREST_RATE = 0.025; // 2.5% / year
     
        Scanner input = new Scanner(System.in);

        while(true) {
            double principal;

            while(true) {
                System.out.print("Initial Investment: ");
                if (input.hasNextDouble()) {
                    principal = input.nextDouble();
                    if (principal == -1) {
                        System.out.println("Exiting program");
                        return;
                    }
                    if (principal > 0) break;
                } else {
                    input.next();
                }
                System.out.println("Invalid input, enter a positive number ");
            }
            

        double future = principal * (1 + INTEREST_RATE / 2);
        System.out.printf("6 month: $%,.2f\n", future);

        future = principal;
        for (int years = 1; years < 6; years++) {
            future *= (1 + INTEREST_RATE / COMPOUND_PER_YEAR);
            System.out.printf(years + "year: $%,.2f\n", future);
        }
        System.out.println();
        input.close();
    }

    }
}