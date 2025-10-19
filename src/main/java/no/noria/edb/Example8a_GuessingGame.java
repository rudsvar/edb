void main() {
    var randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(0, 10);
    while (true) {
        String answer = IO.readln("Enter your guess: ");
        int answerInt = Integer.parseInt(answer);
        if (answerInt == randomInt) {
            IO.println("Correct!");
            break;
        } else if (randomInt < answerInt) {
            IO.println("Lower");
        } else {
            IO.println("Higher");
        }
    }
}
