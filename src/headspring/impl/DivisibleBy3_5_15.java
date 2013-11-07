package headspring.impl;

import headspring.api.ICondition;

/**
 * @author cmcnelis
 *         User: cmcnelis
 *         Date: 11/6/13
 *         Time: 3:26 PM
 */
public class DivisibleBy3_5_15 implements ICondition {

    protected static final String FIZZ = "Fizz";
    protected static final String BUZZ = "Buzz";
    protected static final String FIZZ_BUZZ = FIZZ + BUZZ;

    protected String word1 = FIZZ;
    protected String word2 = BUZZ;
    protected String both = FIZZ_BUZZ;

    @Override
    public String eval(int input) {
        if( input % 15 == 0){
            return both;
        } else  if (input % 3 == 0) {
            return word1;
        } else if (input % 5 == 0) {
            return word2;
        }

     return null;
    }

}
