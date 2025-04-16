package JavaTesting.ExceptionsTesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExceptionsTest {
    @Test//(expected = NullPointerException.class)
    public void NullPointerTest(){

        Integer edad = null;

        String edadEnLetras = edad.toString();

        assertEquals(""+18,edadEnLetras);
    }

}
