package no.noria.edb.kattis;

import java.util.Scanner;

public class Aldur {
    public static void main(String[] args) {
        // Find out how many friends Tomas has
        Scanner scanner = new Scanner(System.in);
        int numberOfFriends = scanner.nextInt();

        // Keep track of the lowest age so far
        int lowestAge = Integer.MAX_VALUE;

        // Read ages of all friends
        for (int friendNumber = 0; friendNumber < numberOfFriends; friendNumber++) {
            int age = scanner.nextInt();
            // Update the lowest age if the new age is lower
            if (age < lowestAge) {
                lowestAge = age;
            }
        }

        System.out.println(lowestAge);
    }
}
