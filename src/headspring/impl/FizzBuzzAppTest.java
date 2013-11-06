package headspring.impl;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

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
        List<String> result = fizzBuzzApp._fizz();
        Assert.assertEquals("1", result.get(0));
        Assert.assertEquals("FizzBuzz", result.get(result.size()-1));
    }

    @Test
    public void test2(){
        fizzBuzzApp = new FizzBuzzApp(new Range(0,10));
        List<String> result = fizzBuzzApp._fizz();
        Assert.assertEquals("Buzz", result.get(result.size()-1));

    }
}
