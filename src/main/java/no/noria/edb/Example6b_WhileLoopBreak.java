void main() {
    while (true) {
        var password = IO.readln("Enter your password: ");
        if (password.equals("secret")) {
            IO.println("Welcome!");
            break;
        } else {
            IO.println("Invalid password");
        }
    }
}
