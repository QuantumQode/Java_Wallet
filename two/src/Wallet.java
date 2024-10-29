package two;

import java.util.ArrayList;
import java.util.List;

/**
 * A Wallet object two default null card.
 *
 * @author Pouria Ghasemi
 */
public class Wallet {
    /**
     * card1 of this Wallet. Potentially null.
     */
    private Card card1;
    /**
     * card2 of this Wallet. Potentially null.
     */
    private Card card2;

    /**
     * addCard will add the card to which slot
     *
     * @param card the given card
     */
    public void addCard(Card card) {
        if (null == card1) {
            card1 = card;
        } else if (null == card2) {
            card2 = card;
        }
    }

    /**
     * this will format each type separated by pipe
     * @return the formatted cards info
     */
    public String formatCards() {
        List<String> walletCards = new ArrayList<>();
        if (card1 != null) {
            walletCards.add(card1.format());
        }
        if (card2 != null) {
            walletCards.add(card2.format());
        }

        return "[" + String.join(" | ", walletCards) + "]";
    }
}
