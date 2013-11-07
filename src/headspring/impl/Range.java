package headspring.impl;

import headspring.api.IRange;

/**
 * This class allows for the capability to check input ranges
 * when using the FizzBuzzApp. This class ensures the range start is >= 0,
 * and the end is > start.
 *
 * @author cmcnelis
 *
 */
public class Range implements IRange {

    private int start;
    private int end;

    public Range(int start, int end){

        if(start < 0 || start > end )
            throw new IllegalArgumentException("Start should be => 0, and end > start.");

        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

}
