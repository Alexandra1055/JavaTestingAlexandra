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
            texto = " Edad == " + edadEnLetras;
        }

        assertEquals(" Edad == 18",texto);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwingIllegalArgumentExceptionTryCatchNullPointerTest(){

        Integer edad = null;
        String edadEnLetras= "";
        String texto;

        try{
            System.out.println("Paso 1: generamos NullPointerException");
            edadEnLetras = edad.toString();
        }catch ( NullPointerException npe ){
            System.out.println("Paso 2: Capturamos la NullPointerException");
            System.out.println("Paso 3: Vamos a lanzar una excepcion");
            throw new IllegalArgumentException("Excepcion creada y lanzada por mi");
        } finally {
            System.out.println("Paso final: codigo de cierre");
        }

    }

    @Test(expected = NullPointerException.class)
    public void excepcionErronea(){

        Integer edad = null;
        String edadEnLetras= "";
        String texto;

        try{
            System.out.println("Paso 1: generamos NullPointerException");
            edadEnLetras = edad.toString();
            throw new IllegalArgumentException("Excepcion creada y lanzada por mi");
        }catch ( IllegalArgumentException e ){
            System.out.println("Paso 2: Capturamos la IllegalArgumentException");
        } finally {
            System.out.println("Paso final: codigo de cierre");
        }

    }
}
