package headspring.impl;

/**
 * @author cmcnelis
 *         User: cmcnelis
 *         Date: 11/6/13
 *         Time: 6:22 PM
 */
public class Divisible_3_5_15_WOO_HOO extends DivisibleBy3_5_15 {
    protected static final String WOO = "Woo";
    protected static final String HOO = "Hoo";
    protected static final String WOO_HOO = WOO+HOO;

    public Divisible_3_5_15_WOO_HOO(){
        word1 = WOO;
        word2 = HOO;
        both = WOO_HOO;
    }
}
