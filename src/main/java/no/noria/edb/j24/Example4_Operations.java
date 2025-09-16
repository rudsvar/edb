package no.noria.edb.j24;

public class Example4_Operations {
    public static void main() {
        int a = 10;
        int b = 20;
        int c = a + b; // We can use common math operators like +, -, *, /
        System.out.println(c);

        // This also works for strings
        String hello = "Hello";
        String world = " World";
        String helloWorld = hello + " " + world;
        System.out.println(helloWorld);

        String helloWorld2 = String.format("%s %s", hello, world);
        System.out.println(helloWorld2);
    }
}
