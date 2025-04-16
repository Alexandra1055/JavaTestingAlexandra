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

    @Test
    public void catchNullPointerTest(){

        Integer edad = null;

        String edadEnLetras;

        try{
            edadEnLetras = edad.toString();
        }catch ( NullPointerException npe ){
            edad = 18;
            edadEnLetras = edad.toString();
        }
        assertEquals(""+18,edadEnLetras);
    }

    @Test
    public void tryCatchNullPointerTest(){

        Integer edad = null;

        String edadEnLetras= "";
        String texto;

        try{
            edadEnLetras = edad.toString();
        }catch ( NullPointerException npe ){
            edad = 18;
            edadEnLetras = edad.toString();
        } finally {
            texto = " Edad == 18 " + edadEnLetras;
        }

        assertEquals(""+18,texto);
    }
}
