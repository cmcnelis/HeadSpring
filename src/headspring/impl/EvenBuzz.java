package headspring.impl;

import headspring.api.ICondition;

/**
 * @author cmcnelis
 *         User: cmcnelis
 *         Date: 11/6/13
 *         Time: 6:49 PM
 */
public class EvenBuzz implements ICondition {
    protected static final String EVEN_YO = "EvenYo";


    @Override
    public String eval(int input) {
        if(input % 2 == 0){
            return EVEN_YO;
        }
        return null;
    }
}
