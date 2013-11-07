package headspring.api;

/**
 * Interface for the FizzBuzz framework. All conditions that are meant to
 * be met should implement this interface.
 * @author cmcnelis
 *
 */
public interface ICondition {

    /**
     * Based on the integer passed this method returns the conditions
     * output. If the input does not match the condition, the condition should
     * return null as the result.
     * @param input The integer to be evaluated
     * @return The output from the evaluation for this condition. Must be null if the
     * condition isn't satisfied.
     */
    public String eval(int input);

}
