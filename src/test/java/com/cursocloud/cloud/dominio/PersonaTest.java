package com.cursocloud.cloud.dominio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

public class PersonaTest {

    @Test
    void testHBirthday() {

        Random random = new Random();

        int edad = random.nextInt();

        Persona viva = new Persona("0001", "victor", edad);

        viva.hBirthday();

        assertEquals(viva.getAge(), edad + 1);

        Persona muerta = new Persona("0001", "victor", edad, false);

        muerta.hBirthday();

        assertEquals(muerta.getAge(), edad);

    }

    @Test
    void testMayorDeEdad() throws Exception
    {
        Persona persona17 = new Persona("a","b",17);
        Persona persona18 = new Persona("a","b",18);
        Persona persona19 = new Persona("a","b",19);
        
        boolean result17 = persona17.mayorDeEdad();
        boolean result18 = persona18.mayorDeEdad();
        boolean result19 = persona19.mayorDeEdad();
        
        boolean expResult17 = false;
        boolean expResult18 = true;
        boolean expResult19 = true;
        
        assertEquals(result17, expResult17);       
        assertEquals(result18, expResult18);
        assertEquals(result19, expResult19);

    }
}
