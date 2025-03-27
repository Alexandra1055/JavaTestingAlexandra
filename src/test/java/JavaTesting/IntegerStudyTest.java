package JavaTesting;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntegerStudyTest {

    @Test
    public void integerStudy(){

        Integer ocho = new Integer(8);
        Integer veinte = new Integer(20);
        Integer trece = 13;
        int esperar = 13 ;

        //int minimo = Integer.MIN_VALUE;
        int minimo = -2147483648;


        assertEquals("Nuestro trece vale 13" , esperar, trece.intValue());

        assertEquals("Nuestro veinte vale 20" , 20, veinte.intValue());

        assertEquals("El valor minimo de un int es -2147483648" , minimo, Integer.MIN_VALUE);
    }

    @Test
    public void integerComparationStudy(){

        Integer ocho = new Integer(8);
        Integer eight = new Integer(8);

        assertEquals("Nuestro ocho vale 8" , 8, ocho.intValue());

        assertEquals("Nuestro eight vale 8" , 8, eight.intValue());

        //assertTrue(ocho == eight);
        assertTrue(ocho.equals(eight));
    }

    @Test
    public void binaryStudy(){

        Integer dos = new Integer(2);
        Integer veinte = new Integer(20);
        Integer trece = 13;

        String tiposPersonas = "Hay "+ Integer.toBinaryString(2) + " de personas, las que entieneden binario y las que NO!";
        assertEquals(tiposPersonas, 2, dos.intValue());

    }

}
