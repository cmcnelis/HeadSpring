package headspring.impl;

/**
 * @author cmcnelis
 *         User: cmcnelis
 *         Date: 11/6/13
 *         Time: 10:06 AM
 */
public class FizzBuzz {

    public static void main(String[] arg){
        FizzBuzzApp fizz1 = new FizzBuzzApp();
        fizz1.fizz();

        FizzBuzzApp fizz2 = new FizzBuzzApp(new Range(10,10));
        fizz2.fizz();
    }
}
