import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromoTest {

    Palindromo p;

    @Before
    public void setUp() throws Exception {
        p = new Palindromo();
    }

    @After
    public void tearDown() throws Exception {
        p = null;
    }

    // 5 casos de prueba propuestos por mi
    @Test
    public void esPalindromo0() {
        assertTrue(p.esPalindromo("anitalavalatina"));
    }
    @Test
    public void esPalindromo1() {
        assertTrue(p.esPalindromo("AnitaLavaLaTina"));
    }
    @Test
    public void esPalindromo2() {
        assertTrue(p.esPalindromo("anita lava la tina"));
    }
    @Test
    public void esPalindromo3() {
        assertTrue(p.esPalindromo("010010"));
    }
    @Test
    public void esPalindromo4() {
        assertTrue(p.esPalindromo("%#@#%"));
    }

    // "aca", "acas", "h"
    @Test
    public void esPalindromo5() {
        assertTrue(p.esPalindromo("aca"));
    }
    @Test
    public void esPalindromo6() {
        assertFalse(p.esPalindromo("acas"));
    }
    @Test
    public void esPalindromo7() {
        assertFalse(p.esPalindromo("h"));
    }
}