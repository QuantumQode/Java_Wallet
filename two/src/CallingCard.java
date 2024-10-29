package two;


/**
 * A CallingCard which has inherited the from Card
 * for it's name, it also contains two fields
 * `pin` & `cardNumber` by itself
 *
 * @author Pouria Ghasemi
 */
public class CallingCard extends Card {
    /**
     * Pin of this callingCard. Potentially null.
     */
    private String pin;
    /**
     * CardNumber of this callingCard. Potentially null.
     */
    private int cardNumber;

    /**
     * Constructs a CallingCard object with empty string name & empty pint and zero cardNumber.
     */
    public CallingCard() {
        super("");
        this.pin = "";
        this.cardNumber = 0;
    }

    /**
     * Constructs a Card object with given name, pin and cardNumber
     *
     * @param name       the given name
     * @param pin        the given pin
     * @param cardNumber the given cardNumber
     */
    public CallingCard(String name, String pin, int cardNumber) {
        super(name);
        this.pin = pin;
        this.cardNumber = cardNumber;
    }

    /**
     * Accessor method for the pin
     *
     * @return the pin
     */
    public String getPin() {
        return pin;
    }

    /**
     * Accessor method for the cardNumber
     *
     * @return the cardNumber
     */
    public int getCardNumber() {
        return cardNumber;
    }

    /**
     * Gives a String format for the callingCard
     *
     * @return the formatted String representing this callingCard
     */
    @Override
    public String format() {
        String pinFormat = "Pin: " + this.pin;
        String cardNumberFormat = "CardNumber: " + this.cardNumber;
        return String.format("%s, %s, %s", super.format(), pinFormat, cardNumberFormat);
    }
}
