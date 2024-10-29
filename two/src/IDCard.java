package two;

/**
 * A Card object has a name and a few methods to get the name
 * and format the card.  It never expires.
 *
 * @author Pouria Ghasemi
 */
public class IDCard extends Card {
    /**
     * IdNumber of this IdCard. Potentially null.
     */
    private int idNumber;

    /**
     * Constructs a IDCard object with empty string name & zero idNumber.
     */
    public IDCard() {
        super("");
    }

    /**
     * Constructs a IDCard object with given name and given idNumber
     *
     * @param name     the given name
     * @param idNumber the given idNumber
     */
    public IDCard(String name, int idNumber) {
        super(name);
        this.idNumber = idNumber;
    }

    /**
     * Accessor method for the idNumber
     *
     * @return the idNumber
     */
    public int getIdNumber() {
        return idNumber;
    }

    /**
     * Gives a String format for the idCard
     *
     * @return the formatted String representing this idCard
     */
    @Override
    public String format() {
        String idNumberFormat = "IDNumber: " + this.idNumber;
        return String.format("%s, %s", super.format(), idNumberFormat);
    }
}
