void main() {
    boolean keepLooping = true;
    while (keepLooping) {
        var password = IO.readln("Enter your password: ");
        if (password.equals("secret")) {
            IO.println("Welcome!");
            keepLooping = false;
        } else {
            IO.println("Invalid password");
        }
    }
}
