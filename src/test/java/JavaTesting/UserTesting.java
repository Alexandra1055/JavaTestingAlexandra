package JavaTesting;

import DomainEntities.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTesting {

    @Test
    public void constructorUserTest(){
        User usuario = new User();

        assertTrue(usuario != null);

        assertEquals(usuario.getName(),"Alexandra");
        //assertEquals(usuario.getPassword(),"secret");

        assertTrue(usuario.verifyPassword("secret"));

    }
}
