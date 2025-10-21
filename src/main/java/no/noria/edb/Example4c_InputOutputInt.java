/**
 * The input we read is a string by default.
 * If we want to read numbers from the user, we must convert (parse) it.
 */
void main() {
    String ageAsString = IO.readln("Enter your age: ");
    int age = Integer.parseInt(ageAsString);
    IO.println("Your age is " + age);
}
