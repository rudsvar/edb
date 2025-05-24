package no.noria.edb.kattis;

import java.util.Scanner;

public class Leggjasaman {
    public static void main(String[] args) {
        // Create a scanner to read input from standard input
        Scanner scanner = new Scanner(System.in);

        // Read two integers from the input
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Print the sum of the two integers
        System.out.println(a + b);

        // Not strictly necessary, but good practice to close the scanner
        scanner.close();
    }
}
