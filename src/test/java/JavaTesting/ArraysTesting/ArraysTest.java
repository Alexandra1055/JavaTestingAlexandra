package JavaTesting.ArraysTesting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArraysTest {

    @Test
    public void ejemploArraySencilla(){
        String[] numeracion = {"cero", "uno", "dos", "tres"};

        assertEquals("cero", numeracion[0]);

        String numeros = "";

        for (String n: numeracion){
            numeros += n + '|';
        }

        assertEquals(numeros, "cero|uno|dos|tres|");
    }

    @Test
    public void pruebaOrdenarArray(){
        String[] numeracion = {"cero", "uno", "dos", "tres"};

        Arrays.sort(numeracion);

        for (int i = 0; i < numeracion.length-1; i++) {
            assertTrue(numeracion[i].compareTo(numeracion[i+1]) < 0 );
        }
    }

    @Test
    public void rellenarArrayParcialmente(){
        int [] nums = {0,1,2,3,4,5,6,7,8,9};

        Arrays.fill(nums, 5,10, -1);

        for (int i = 5; i < nums.length; i++) {
            assertTrue(nums[i] == -1);
        }
    }

    @Test
    public void copiarRangoMatriz(){
        String[] dias ={"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};

        String[] laborales = Arrays.copyOfRange(dias, 0, 5);

        assertTrue(laborales.length == 5);
        assertTrue(laborales[1].equals("martes") );

        String[] laboralesEsclavos = Arrays.copyOfRange(laborales, 0, 7);

        assertTrue(laboralesEsclavos[0].equals("lunes"));

        assertEquals(laboralesEsclavos[5],null);
        assertEquals(laboralesEsclavos[6],null);

        laboralesEsclavos[5] = "SabadoDETrabajo";
        laboralesEsclavos[6] = "diaDEDescanso";

        assertTrue(laboralesEsclavos[6].equals("diaDEDescanso"));

    }

    @Test
    public void arrayIrregularTest(){
        int[][] arrayIrregular= {
                {0,1,2,3,4,5},
                {0,1,2,3,4},
                {0,1,2,3},
                {0,1,2},
                {0,1},
                {0}
        };

        assertEquals(arrayIrregular.length, 6);
        assertEquals(arrayIrregular[0].length, 6);
        assertEquals(arrayIrregular[5].length, 1);
    }
}
