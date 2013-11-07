package headspring.impl;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static headspring.impl.Divisible_3_5_15_WOO_HOO.*;
import static headspring.impl.DivisibleBy3_5_15.*;
import static headspring.impl.MeaningOfLife.*;

/**
 * @author cmcnelis
 *         User: cmcnelis
 *         Date: 11/6/13
 *         Time: 10:31 AM
 */
public class FizzBuzzAppTest {

    private FizzBuzzApp fizzBuzzApp = null;

    @Before
    public void setUp(){
        fizzBuzzApp = new FizzBuzzApp();
    }

    @After
    public void tearDown(){
        fizzBuzzApp = null;
    }


    @Test
    public void test1(){
        fizzBuzzApp = new FizzBuzzApp(new Range(1,30));
        List<String> result = runIt(fizzBuzzApp);
        Assert.assertEquals("1", result.get(0));
        Assert.assertEquals(FIZZ_BUZZ, result.get(result.size()-1));
    }

    @Test
    public void test2(){
        fizzBuzzApp = new FizzBuzzApp(new Range(0,10));
        List<String> result = runIt(fizzBuzzApp);

        Assert.assertEquals(BUZZ, result.get(result.size()-1));

    }

    @Test
    public void testDiv3515WooHoo(){
       fizzBuzzApp = new FizzBuzzApp(new Range(3,30), new Divisible_3_5_15_WOO_HOO());
        List<String> result = runIt(fizzBuzzApp);

        Assert.assertEquals(WOO, result.get(0));
        Assert.assertEquals(HOO, result.get(2));
        Assert.assertEquals(WOO_HOO, result.get(result.size() - 1));
    }

    @Test
    public void testMeaningOfLife(){
        fizzBuzzApp = new FizzBuzzApp(new Range(42,84), new MeaningOfLife());
        List<String> result = runIt(fizzBuzzApp);

        Assert.assertEquals(MEANING, result.get(0));
        Assert.assertEquals(MEANING, result.get(result.size()-1));
    }

    private List<String> runIt(FizzBuzzApp fizzBuzzApp){
        return fizzBuzzApp._fizz();
    }
}
