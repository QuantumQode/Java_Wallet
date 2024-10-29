package two;

import java.util.Objects;

/**
 * A WalletTester which test the given card
 * implementation formatCards
 *
 * @author Pouria Ghasemi
 */
public class WalletTester {

    /**
     * the test cards with given cards
     */
    public static String testFormatCards(Card... cards) {
        Wallet wallet = new Wallet();

        for (Card card : cards) {
            wallet.addCard(card);
        }

        return wallet.formatCards();
    }

    /**
     * Tests two String values for equality.
     * <p>
     * Side effects: screen output of test result
     *
     * @param description to be used as part of the screen output
     * @param expected    the expected value
     * @param actual      the actual value
     */
    public static void testStringsEqual(String description, String expected, String actual) {
        sideEffectsForTest(description, expected, actual, Objects.equals(expected, actual));
    }

    /**
     * Helper method for the side effects of the tests for different data types
     * (here already converted to Strings): screen output and increment of
     * static counter variables.
     *
     * @param description description of the test to be printed
     * @param expected    String representation of the expected value
     * @param actual      String representation of the actual value
     * @param result      true: test has passed; false: test has failed
     */
    private static void sideEffectsForTest(String description, String expected, String actual, boolean result) {
        String output;
        if (result) {
            output = "OK";
        } else {
            output = "FAILED";
        }
        System.out.println(output + " - Test: " + description + ", expected: " + expected + ", actual: " + actual);
    }

    public static void main(String[] args) {
        testStringsEqual("testFormatCards[NO-Card]"
                , "[]"
                , testFormatCards(
                ));

        testStringsEqual("testFormatCards[One-Card]"
                , "[Name: Bob, IDNumber: 4513378, ExpirationYear: 2026]"
                , testFormatCards(
                        new DriverLicence("Bob", 4513378, 2026)
                ));

        testStringsEqual("testFormatCards[TWO-Card]"
                , "[Name: Catrin, IDNumber: 9584561 | Name: John, Pin: A85464ZK, CardNumber: 8547123]"
                , testFormatCards(
                        new IDCard("Catrin", 9584561),
                        new CallingCard("John", "A85464ZK", 8547123)
                ));

        testStringsEqual("testDriverLicenceExpiration"
                , "false"
                , String.valueOf(new DriverLicence("Fernando", 4513378, 2026).isExpired())
        );

        testStringsEqual("testDriverLicenceExpiration"
                , "true"
                , String.valueOf(new DriverLicence("Fernando", 4513378, 2022).isExpired())
        );
    }
}
