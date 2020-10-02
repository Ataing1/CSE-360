package cse360assignment02;

public class AddingMachine {
    private int total;
    private StringBuilder stringBuilder;

    /**
     *
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        stringBuilder = new StringBuilder();
        stringBuilder.append(0);
    }

    /**
     *
     * @return int total amount of stored
     */
    public int getTotal () {
        return total;
    }

    /**
     *
     * @param value int amount to be added to total
     */
    public void add (int value) {
        total += value;
        stringBuilder.append(" + ").append(value);
    }

    /**
     *
     * @param value int amount to be subtracted from total
     */
    public void subtract (int value) {
        total -= value;
        stringBuilder.append(" - ").append(value);
    }

    /**
     *
     * @return string with all previous operations
     */
    public String toString () {
        return stringBuilder.toString();
    }

    /**
     *
     */
    public void clear() {
        total = 0;
    }
}
