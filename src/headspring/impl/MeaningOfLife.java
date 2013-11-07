package headspring.impl;

import headspring.api.ICondition;

/**
 * @author cmcnelis
 *         User: cmcnelis
 *         Date: 11/6/13
 *         Time: 6:38 PM
 */
public class MeaningOfLife implements ICondition{

    protected static final String MEANING = "Meaning of life";
    @Override
    public String eval(int input) {

        if(input % 42 == 0){
            return  MEANING;
        }
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
