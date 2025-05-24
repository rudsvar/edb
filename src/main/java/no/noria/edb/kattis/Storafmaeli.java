package no.noria.edb.kattis;

import java.util.Scanner;

public class Storafmaeli {
    public static void main(String[] args) {
        // Create a scanner to read input from standard input
        Scanner scanner = new Scanner(System.in);

        // Read an integer from the input
        int age = scanner.nextInt();

        // Check if the age is a multiple of 10
        if (age % 10 == 0) {
            System.out.println("Jebb");
        } else {
            System.out.println("Neibb");
        }

        // Not strictly necessary, but good practice to close the scanner
        scanner.close();
    }
}
