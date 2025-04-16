package JavaTesting.ExplorandoJUnit;

import org.junit.*;
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
}
