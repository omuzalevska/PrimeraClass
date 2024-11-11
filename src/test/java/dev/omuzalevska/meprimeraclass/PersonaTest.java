package dev.omuzalevska.meprimeraclass;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    public void testPersonaConstructor() {
        Persona person = new Persona("John", "Das", "12345", 
                    1997, "USA", 'M');
        assertEquals("John", person.firstName);
        assertEquals("Das", person.lastName);
        assertEquals("12345", person.idNumber);
        assertEquals(1997, person.birthYear);
        assertEquals("USA", person.birthCountry);
        assertEquals('M', person.gender);
    }


}
