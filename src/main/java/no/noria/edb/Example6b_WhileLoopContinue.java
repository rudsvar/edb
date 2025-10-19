void main() {
    while (true) {
        var password = IO.readln("Enter your password: ");
        if (!password.equals("secret")) {
            IO.println("Invalid password");
            continue;
        }
        IO.println("Welcome!");
        break;
    }
}
