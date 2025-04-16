package JavaTesting.ExplorandoJUnit;

import org.junit.Test;

import java.security.InvalidParameterException;

public class ExplorandoJUnitTest {
    @Test (expected = IllegalArgumentException.class)
    public void testetandoIllegalAlgumentException(){

        throw new IllegalArgumentException();
    }
}
