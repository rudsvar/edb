/**
 * Doubles an integer.
 *
 * @param input an integer to double.
 * @return the doubled value.
 */
int doubleInt(int input) {
    return 2 * input;
}

/**
 * Adds two numbers.
 *
 * @param a the first number.
 * @param b the second number.
 * @return the sum of the two numbers.
 */
int add(int a, int b) {
    return a + b;
}

void main() {
    int thirteen = 13;
    int twentySix = doubleInt(thirteen);
    IO.println(twentySix);

    int thirtyNine = add(thirteen, twentySix);
    IO.println(thirtyNine);
}
