package JavaTesting;

import javaTesting.Resources.AppParameters;
import org.junit.Assert;
import org.junit.Test;

public class AppParametersTest {

    public static final String DOMAIN_EXPECTED = "127.0.0.1";
    public static final String PORT_EXPECTED = "80";
    public static final String URL_EXPECTED = "https://"+ DOMAIN_EXPECTED + ":" + PORT_EXPECTED;

    @Test
    public void domainURLCorrect(){

        Assert.assertEquals("Devuelve la parte FQDN", DOMAIN_EXPECTED, AppParameters.DOMAIN );
    }

    @Test
    public void correctPORT(){

        Assert.assertEquals("Devuelve el puerto correcto", PORT_EXPECTED, AppParameters.PORT);
    }

    @Test
    public void correctURL(){

        Assert.assertEquals("Devuelve la URL de forma correcta", URL_EXPECTED, AppParameters.deployedURL());
    }

    @Test
    public void singletonCorrectness(){
        AppParameters inst1 = AppParameters.getInstance();
        AppParameters inst2 = AppParameters.getInstance();// new AppParameters();

        Assert.assertTrue("Comprobacion unicidad instancia del singleton", (inst1 == inst2));


    }
}
