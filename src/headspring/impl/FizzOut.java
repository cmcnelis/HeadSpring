package headspring.impl;

import com.google.common.base.Preconditions;

/**
 * @author cmcnelis
 */
public class FizzOut {

    public static final String DEFAULT_FIZZ = "Fizz";
    public static final String DEFAULT_BUZZ = "Buzz";

    private String word1;
    private String word2;


    public FizzOut(){
        word1 = DEFAULT_FIZZ;
        word2 = DEFAULT_BUZZ;

    }
    public FizzOut(String word1, String word2){
        Preconditions.checkNotNull(word1, "First argument can't be null");
        Preconditions.checkNotNull(word2, "Second argument can't be null");

        this.word1 = word1;
        this.word2 = word2;
    }


}
