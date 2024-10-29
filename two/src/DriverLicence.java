package two;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * A Card object has a name and a few methods to get the name
 * and format the card.  It never expires.
 *
 * @author Pouria Ghasemi
 */
public class DriverLicence extends IDCard {
    /**
     * expirationYear of this DriverLicence. Potentially null.
     */
    private int expirationYear;

    /**
     * Constructs a DriverLicence object with empty string name, zero idNumber and zero expirationYear.
     */
    public DriverLicence() {
        super("", 0);
        this.expirationYear = 0;
    }

    /**
     * Constructs a DriverLicence object with given name, given idNumber and given expirationYear
     *
     * @param name           the given name
     * @param idNumber       the given idNumber
     * @param expirationYear the given expirationYear
     */
    public DriverLicence(String name, int idNumber, int expirationYear) {
        super(name, idNumber);
        this.expirationYear = expirationYear;
    }

    /**
     * Accessor method for the expirationYear
     *
     * @return the expirationYear
     */
    public int getExpirationYear() {
        return expirationYear;
    }

    /**
     * Gives a String format for the driverLicence
     *
     * @return the formatted String representing this driverLicence
     */
    @Override
    public String format() {
        String expirationYearFormat = "ExpirationYear: " + this.expirationYear;
        return String.format("%s, %s", super.format(), expirationYearFormat);
    }

    /**
     * check if the licence is expired by checking
     * it with the current year
     *
     * @return whether the licence is expired
     */
    @Override
    public boolean isExpired() {
        GregorianCalendar calendar = new GregorianCalendar();
        int currentYear = calendar.get(Calendar.YEAR);
        return currentYear > expirationYear;
    }
}
