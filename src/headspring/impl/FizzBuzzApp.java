package headspring.impl;

import headspring.api.ICondition;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple tool for outputting messages and numbers to the console
 * based on certain conditions.
 * @author cmcnelis
 *
 */
public class FizzBuzzApp {

    private ICondition[] conditions;
    private Range range;

    public FizzBuzzApp(Range range){
         this(range, new DivisibleBy3_5_15());
    }

    public FizzBuzzApp(Range range, ICondition... conditions){
        this.range = range;
        this.conditions = conditions;
    }

    public FizzBuzzApp(){
        this(new Range(1,100), new DivisibleBy3_5_15());
    }

    public void fizz(){
           _fizz();
    }

    public void fizz(int start, int end){
        this.range = new Range(start,end);
        _fizz();
    }

    protected List<String> _fizz(){
        List<String> recorder = new ArrayList<String>();
        StringBuffer buffer = new StringBuffer();
        String result = null;

        for(int i = range.getStart() ; i <= range.getEnd() ; i++ ){
              for(ICondition condition : conditions){
                  result = condition.eval(i);
                  if(result == null){
                      result = new Integer(i).toString();
                  }
                  buffer.append(result).append(' ');
                  recorder.add(result);
              }
        }
        System.out.println(buffer.toString());
        return  recorder;
    }
}
