void main() {
    int maxAttempts = 3;
    for (int i = 1; i <= maxAttempts; i++) {
        var password = IO.readln("Enter your password: ");
        if (password.equals("secret")) {
            IO.println("Welcome!");
            break;
        } else {
            int attemptsLeft = maxAttempts - i;
            IO.println("Invalid password, " + attemptsLeft + " attempts left");
        }
    }
}
