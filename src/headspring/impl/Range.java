package headspring.impl;

/**
 * @author cmcnelis
 *
 */
public class Range {


    private int start = 0;
    private int end = 0;

    public Range(int start, int end){
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
