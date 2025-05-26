package no.noria.edb.kattis;

import java.io.IOException;
import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] expectedCounts = {1, 1, 2, 2, 2, 8};
        StringBuilder output = new StringBuilder();
        for (int expectedCount : expectedCounts) {
            int actualCount = scanner.nextInt();
            int difference = expectedCount - actualCount;
            output.append(difference).append(" ");
        }
        System.out.println(output.toString().trim());
    }
}
