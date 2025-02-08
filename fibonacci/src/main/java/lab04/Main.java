package lab04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int limit = scanner.nextInt();
            int a = 0, b = 1, next;

            do {
                next = a + b;
                a = b;
                b = next;
            } while (next <= limit);

            System.out.println("First Fibonacci number greater than " + limit + " is " + next);
            scanner.close();
        }
    }
