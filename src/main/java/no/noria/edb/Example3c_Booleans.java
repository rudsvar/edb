/**
 * A boolean can be true or false.
 */
void main() {
    boolean isRainy = true;
    boolean isWarm = false;
    boolean isRainyAndWarm = isRainy && isWarm;
    IO.println("Rainy and warm: " + isRainyAndWarm);
    boolean isRainyOrWarm = isRainy || isWarm;
    IO.println("Rainy or warm: " + isRainyOrWarm);
}
