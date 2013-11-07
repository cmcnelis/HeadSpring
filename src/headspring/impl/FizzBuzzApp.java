package headspring.impl;

import headspring.api.ICondition;
import headspring.api.IRange;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple tool for outputting messages and numbers to the console
 * based on certain conditions.
 * The default behavior is to print out Fizz for numbers evenly divisible by 3,
 * Buzz for numbers evenly divisible by 5, and FizzBuzz for numbers divisible by 15.
 * The default range of numbers is 1->100.
 * @author cmcnelis
 *
 */
public class FizzBuzzApp {

    private ICondition condition;
    private IRange range;


    /**
     * Constructs a new app with the range specified.
     * @param range
     */
    public FizzBuzzApp(IRange range){
         this(range, new DivisibleBy3_5_15());
    }

    /**
     * Constructs a new app with the range and condition specified.
     * @param range
     * @param condition
     */
    public FizzBuzzApp(IRange range, ICondition condition){
        this.range = range;
        this.condition = condition;
    }

    /**
     * Constructs the default app.
     */
    public FizzBuzzApp(){
        this(new Range(1,100), new DivisibleBy3_5_15());
    }

    public void fizz(){
           _fizz();
    }

    /**
     * @deprecated Use the FizzBuzz(IRange,ICondition) constructor.
     * @param start
     * @param end
     */
    public void fizz(int start, int end){
        this.range = new Range(start,end);
        _fizz();
    }

    protected List<String> _fizz(){
        List<String> recorder = new ArrayList<String>();
        StringBuffer buffer = new StringBuffer();
        String result;

        for(int i = range.getStart() ; i <= range.getEnd() ; i++ ){
            result = condition.eval(i);
            if (result == null) {
                result = new Integer(i).toString();
            }
            buffer.append(result).append(' ');
            recorder.add(result);
        }

        System.out.println(buffer.toString());
        return  recorder;
    }
}
