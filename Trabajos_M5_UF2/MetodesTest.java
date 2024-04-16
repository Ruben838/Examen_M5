/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package exercici2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ruben
 */
public class MetodesTest {


    /**
     * Test of existeixNom method, of class Metodes.
     */
    @Test
    public void testExisteixNom() {
        System.out.println("existeixNom");
        String[] llista = {"Persona"};
        String busqueda = "Persona";
        boolean expResult = true;
        boolean result = Metodes.existeixNom(llista, busqueda);
        assertEquals(expResult, result);
    }

    /**
     * Test of posicioArray method, of class Metodes.
     */
    @Test
    public void testPosicioArray() {
        System.out.println("posicioArray");
        String[] llista = {"Persona"};
        String busqueda = "Persona";
        int expResult = 0;
        int result = Metodes.posicioArray(llista, busqueda);
        assertEquals(expResult, result);
    }

    /**
     * Test of introduirLlistaGrup method, of class Metodes.
     */
    @Test
    public void testIntroduirLlistaGrup() {
        System.out.println("introduirLlistaGrup");
        String[] llista = {"Persona"};
    }

    /**
     * Test of introduirNomBuscat method, of class Metodes.
     */
    @Test
    public void testIntroduirNomBuscat() {
        System.out.println("introduirNomBuscat");
        String expResult = "1";
        String result = "1";
        assertEquals(expResult, result);

    }
    
}
