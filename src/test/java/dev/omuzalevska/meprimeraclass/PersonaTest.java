package dev.omuzalevska.meprimeraclass;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    public void testPersonaConstructor() {
        Persona person = new Persona("John", "Das", "12345", 
                    1997, "USA", 'M');
        assertEquals("John", person.getFirstName());
        assertEquals("Das", person.getLastName());
        assertEquals("12345", person.getIdNumber());
        assertEquals(1997, person.getBirthYear());
        assertEquals("USA", person.getBirthCountry());
        assertEquals('M', person.getGender());
    }


    @Test
    public void testGettersAndSetters() {
        Persona person = new Persona("Juan", "Gomez", "12345678", 1998, "Spain", 'H');
        assertEquals("Juan", person.getFirstName());
        assertEquals("Gomez", person.getLastName());
        assertEquals("12345678", person.getIdNumber());
        assertEquals(1998, person.getBirthYear());
        assertEquals("Spain", person.getBirthCountry());
        assertEquals('H', person.getGender());

         person.setFirstName("Carlos");
        person.setLastName("Perez");
        person.setIdNumber("98765432");
        person.setBirthYear(2000);
        person.setBirthCountry("Mexico");
        person.setGender('M');

        assertEquals("Carlos", person.getFirstName());
        assertEquals("Perez", person.getLastName());
        assertEquals("98765432", person.getIdNumber());
        assertEquals(2000, person.getBirthYear());
        assertEquals("Mexico", person.getBirthCountry());
        assertEquals('M', person.getGender());
    }
}
