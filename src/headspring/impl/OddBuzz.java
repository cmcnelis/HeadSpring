package headspring.impl;

import headspring.api.ICondition;

/**
 * @author cmcnelis
 *         User: cmcnelis
 *         Date: 11/6/13
 *         Time: 7:57 PM
 */
public class OddBuzz implements ICondition {

    protected static final String ODD = "Odd";
    @Override
    public String eval(int input) {
        if (!(input % 2 == 0)) {
            return ODD;
        }
        return null;
    }
}
