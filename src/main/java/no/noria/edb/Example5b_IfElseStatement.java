/**
 * We can also say what to do if our check is false.
 */
void main() {
    var password = IO.readln("Enter your password: ");
    if (password.equals("secret")) {
        IO.println("Welcome!");
    } else {
        IO.println("Invalid password");
    }
}
