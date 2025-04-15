package JavaTesting.CollectionsTesting;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SimpleCollectionTest {
    @Test
    public void firstCollectionTest(){
        String[] nombres = { "zero", "uno", "dos", "tres" };

        List<String> numerales = new ArrayList<>();

        for ( String s : nombres ){
            numerales.add(s);
        }
        List<String> listaNumeros = Arrays.asList(nombres);
        assertTrue(listaNumeros.size() == 4);
    }
}
