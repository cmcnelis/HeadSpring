package headspring.api;

/**
 * Range Interface for the FizzBuzzApp.
 *
 * This interface allows implementers to decide which
 * ranges are valid for their use case.
 * @author cmcnelis
 *         User: cmcnelis
 *         Date: 11/6/13
 *         Time: 7:15 PM
 */
public interface IRange {

    /**
     * Returns the start of the range.
     */
    public int getStart();

    /**
     * Returns the end of the range.
     */
    public int getEnd();
}
