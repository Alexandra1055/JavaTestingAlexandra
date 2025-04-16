package JavaTesting.ExplorandoJUnit;

import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

import static org.junit.Assert.*;


public class ExplorandoJUnitTest {

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test (expected = IllegalArgumentException.class)
    public void testetandoIllegalAlgumentException(){

        throw new IllegalArgumentException();
    }

    @Ignore
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

    @BeforeClass
    public static void ejecutaUnaVezPorClaseAntesDeCadaTest(){
        System.out.println("Antes de ejecutar cualquier test, una vez por clase");
    }

    @AfterClass
    public static void ejecutaUnaVezPorClaseDespuesDeCadaTest(){
        System.out.println("Despues de ejecutar cualquier test, una vez por clase");
    }

    @Before
    public void ejecutaAntesDeCadaTest(){
        System.out.println("Antes de ejecutar cualquier test, por cada test!");
    }

    @After
    public void ejecutaDespuesDeCadaTest(){
        System.out.println("Despues de ejecutar cualquier test, por cada test!");
    }

    @Test
    public void assercionesDeJUnit(){
        assertEquals(5,2+3);

        assertFalse("falsi es falso", false);
        assertFalse(3 > 5);

        assertTrue(5 > 3);

        int[] hasta10 = {1,2,3,4,5,6,7,8,9,10};
        int[] primeros10 = {2,1,3,5,4,6,8,7,9,10};

        Arrays.sort(primeros10);
        assertArrayEquals(hasta10,primeros10);

        assertNotNull("Un String vacio no es null", "");
        assertNotNull("");

        assertNotSame("Un String vacio no es null", "", null);
        assertNotSame("", null);

        assertNull("Solo null es considerado null", null);

        Object obj = null;
        assertSame(obj, null);
    }
}
