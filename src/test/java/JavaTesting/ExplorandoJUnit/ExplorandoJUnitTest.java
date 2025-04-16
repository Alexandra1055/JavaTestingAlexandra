package JavaTesting.ExplorandoJUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class ExplorandoJUnitTest {

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test (expected = IllegalArgumentException.class)
    public void testetandoIllegalAlgumentException(){

        throw new IllegalArgumentException();
    }

    @Test
    public void illegalParametersTest(){
        expected.expect(IllegalArgumentException.class);
        throw new IllegalArgumentException();
    }

    @Test
    public void mensageExepcionTest(){
        expected.expect(IllegalArgumentException.class);
        expected.expectMessage("the");

        throw new IllegalArgumentException("the exception");
    }
}
