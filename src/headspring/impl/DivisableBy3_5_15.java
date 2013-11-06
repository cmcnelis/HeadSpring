package headspring.impl;

import headspring.api.ICondition;

/**
 * @author cmcnelis
 *         User: cmcnelis
 *         Date: 11/6/13
 *         Time: 3:26 PM
 */
public class DivisableBy3_5_15 implements ICondition {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = "FizzBuzz";

    @Override
    public String eval(int i) {
        if (i % 3 == 0) {
            return FIZZ;
        } else if (i % 5 == 0) {
            return BUZZ;
        } else if (i % 15 == 0) {
            return FIZZ_BUZZ;
        }
     return null;
    }

}
