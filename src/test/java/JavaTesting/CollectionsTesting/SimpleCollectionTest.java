package JavaTesting.CollectionsTesting;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SimpleCollectionTest {
    @Test
    public void firstCollectionTest(){
        String[] nombres = { "zero", "uno", "dos", "tres" };

        List<String> numerales = new ArrayList<>();

        for ( String s : nombres ){
            numerales.add(s);
        }

        numerales.add("cuatro");
        assertTrue(numerales.size() == 4);

        List<String> listaNumeros = Arrays.asList(nombres);

        //listaNumeros.add("cuatro");

        assertTrue(listaNumeros.size() == 4);
    }

    @Test
    public void diasSemana(){

        List<String> diasSemana = new ArrayList<>();
        List<String> diasLaborales = new ArrayList<>() ;
        List<String> diasFestivos = new ArrayList<>() ;
        List<String> diasLaboralesImpares = new ArrayList<>();
        List<String> calculoDias = new ArrayList<>();

        initDiasLaborales(diasLaborales);

        assertTrue(diasLaborales.size() == 5);

        assertEquals(0,diasSemana.size());
        assertFalse(diasSemana.containsAll(diasLaborales));

        diasSemana.addAll(diasLaborales);

        assertEquals(5,diasSemana.size());
        assertTrue(diasSemana.containsAll(diasLaborales));

        diasFestivos.add("sabado");
        diasFestivos.add("domingo");

        diasSemana.addAll(diasFestivos);

        assertEquals(7,diasSemana.size());
        assertTrue(diasSemana.containsAll(diasFestivos));

        List<String> diasImpares = new ArrayList<>();

        diasImpares.addAll(diasSemana);

        assertTrue(diasImpares.contains("martes"));

        diasImpares.remove(1);

        assertFalse(diasImpares.contains("martes"));

        diasImpares.remove("jueves");

        assertFalse(diasImpares.contains("jueves"));

        diasLaboralesImpares.addAll(diasImpares);

        diasLaboralesImpares.removeAll(diasFestivos);

        assertEquals(3 ,diasLaboralesImpares.size());

        assertFalse(diasLaboralesImpares.contains("sabado"));

        calculoDias.addAll(diasSemana);

        assertTrue(calculoDias.containsAll(diasLaborales));
        assertTrue(calculoDias.containsAll(diasFestivos));

        calculoDias.clear();

        assertTrue(calculoDias.isEmpty());

        calculoDias.addAll(diasSemana);

        calculoDias.removeAll(diasFestivos);

        assertEquals(5, calculoDias.size());

    }

    @Test
    public void pruebasConMapTest(){

        Map<String,String> map = new HashMap<>();

        map.put("fondos","negro");
        map.put("menus","azul");
        map.put("dialogos","verde");

        assertEquals(map.size(),3);

        assertTrue(map.containsKey("menus"));
        assertTrue(map.containsValue("negro"));

        map.remove("dialogos");

        assertEquals(map.size(),2);

        map.remove("claveInexesitente");

        assertEquals(map.size(),2);

        assertEquals(map.get("fondos"),"negro");




    }

    public void initDiasLaborales (List<String> dias){
        dias.add("lunes");
        dias.add("martes");
        dias.add("miercoles");
        dias.add("jueves");
        dias.add("viernes");

    }
}
