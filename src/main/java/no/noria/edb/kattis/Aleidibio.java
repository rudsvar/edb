package no.noria.edb.kattis;

import java.util.Scanner;

public class Aleidibio {
    public static void main(String[] args) {
        // Read inputs
        Scanner scanner = new Scanner(System.in);
        int minutesFromHannesToArnar = scanner.nextInt();
        int minutesFromArnarToCinema = scanner.nextInt();
        int filmStartMinute = scanner.nextInt();

        // Compute total travel time and when they must leave
        int travelTime = minutesFromHannesToArnar + minutesFromArnarToCinema;
        int leaveMinute = filmStartMinute - travelTime;

        System.out.println(leaveMinute);
    }
}
