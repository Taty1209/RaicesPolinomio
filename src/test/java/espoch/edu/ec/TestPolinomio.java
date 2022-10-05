package espoch.edu.ec;

import espoch.edu.ec.raicespolinomio.Polinomio;
import espoch.edu.ec.raicespolinomio.RaicesPolinomio;
import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPolinomio {

    private Polinomio unPolinomio;

    public TestPolinomio() {
        unPolinomio = null;
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @Test
    public void CP1() {
        Exception exception = assertThrows(Exception.class, () -> {
            ByteArrayInputStream in = new ByteArrayInputStream("1\n2\nh".getBytes());
            RaicesPolinomio.Ingreso(in);
        });

        String errorEsperado = "Ingrese solo numeros";
        String errorObtenido = exception.getMessage();

        assertTrue(errorObtenido.contains(errorEsperado));
    }

    @Test
    public void CP2() {
        Exception exception = assertThrows(Exception.class, () -> {
            ByteArrayInputStream in = new ByteArrayInputStream("3\ng\n8".getBytes());
            RaicesPolinomio.Ingreso(in);
        });

        String errorEsperado = "Ingrese solo numeros";
        String errorObtenido = exception.getMessage();

        assertTrue(errorObtenido.contains(errorEsperado));
    }

    @Test
    public void CP3() {
        Exception exception = assertThrows(Exception.class, () -> {
            ByteArrayInputStream in = new ByteArrayInputStream("a\nb\nc".getBytes());
            RaicesPolinomio.Ingreso(in);
        });

        String errorEsperado = "Ingrese solo numeros";
        String errorObtenido = exception.getMessage();

        assertTrue(errorObtenido.contains(errorEsperado));
    }

    @Test
    public void CP4() {
        Exception exception = assertThrows(Exception.class, () -> {
            unPolinomio = new Polinomio(0, 1, 2);
        });

        String errorEsperado = "No es un polinomio de grado 2";
        String errorObtenido = exception.getMessage();

        assertTrue(errorObtenido.contains(errorEsperado));
    }

    @Test
    public void CP5() {
        Exception exception = assertThrows(Exception.class, () -> {
            ByteArrayInputStream in = new ByteArrayInputStream("g\n2\n-3".getBytes());
            RaicesPolinomio.Ingreso(in);
        });

        String errorEsperado = "Ingrese solo numeros";
        String errorObtenido = exception.getMessage();

        assertTrue(errorObtenido.contains(errorEsperado));
    }

    @Test
    public void CP6() {
        Exception exception = assertThrows(Exception.class, () -> {
            ByteArrayInputStream in = new ByteArrayInputStream("1\nb\n-3".getBytes());
            RaicesPolinomio.Ingreso(in);
        });

        String errorEsperado = "Ingrese solo numeros";
        String errorObtenido = exception.getMessage();

        assertTrue(errorObtenido.contains(errorEsperado));
    }

    @Test
    public void CP7() {
        Exception exception = assertThrows(Exception.class, () -> {
            ByteArrayInputStream in = new ByteArrayInputStream("a\n9\nj".getBytes());
            RaicesPolinomio.Ingreso(in);
        });

        String errorEsperado = "Ingrese solo numeros";
        String errorObtenido = exception.getMessage();

        assertTrue(errorObtenido.contains(errorEsperado));
    }

    @Test
    public void CP8() {
        Exception exception = assertThrows(Exception.class, () -> {
            ByteArrayInputStream in = new ByteArrayInputStream("e\nu\n7".getBytes());
            RaicesPolinomio.Ingreso(in);
        });

        String errorEsperado = "Ingrese solo numeros";
        String errorObtenido = exception.getMessage();

        assertTrue(errorObtenido.contains(errorEsperado));
    }

    @Test
    public void CP9() {
        try {
            unPolinomio = new Polinomio(1, 0, 9);
            assertTrue(unPolinomio.x1.contains("-0.00+(3.00i)"));
            assertTrue(unPolinomio.x2.contains("-0.00-(3.00i)"));
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @Test
    public void CP10() {
        try {
            unPolinomio = new Polinomio(1, 2, -3);
            assertTrue(unPolinomio.x1.contains("1.0"));
            assertTrue(unPolinomio.x2.contains("-3.0"));
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @Test
    public void CP11() {
        Exception exception = assertThrows(Exception.class, () -> {
            unPolinomio = new Polinomio(4, 100000, -6);
        });

        String errorEsperado = "Ingrese valores de 5 cifras";
        String errorObtenido = exception.getMessage();

        assertTrue(errorObtenido.contains(errorEsperado));
    }

    @Test
    public void CP12() {
        Exception exception = assertThrows(Exception.class, () -> {
            unPolinomio = new Polinomio(100000, 7, -8);
        });

        String errorEsperado = "Ingrese valores de 5 cifras";
        String errorObtenido = exception.getMessage();

        assertTrue(errorObtenido.contains(errorEsperado));
    }

    @Test
    public void CP13() {
        Exception exception = assertThrows(Exception.class, () -> {
            unPolinomio = new Polinomio(-9, 13, 100000);
        });

        String errorEsperado = "Ingrese valores de 5 cifras";
        String errorObtenido = exception.getMessage();

        assertTrue(errorObtenido.contains(errorEsperado));
    }

    @Test
    public void CP14() {
        try {
            unPolinomio = new Polinomio(20, 13, 15);
            assertTrue(unPolinomio.x1.contains("-0.32+(0.80i)"));
            assertTrue(unPolinomio.x2.contains("-0.32-(0.80i)"));
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @Test
    public void CP15() {
        try {
            unPolinomio = new Polinomio(-4, -7, -5);
            assertTrue(unPolinomio.x1.contains("-0.88+(-0.70i)"));
            assertTrue(unPolinomio.x2.contains("-0.88-(-0.70i)"));
        } catch (Exception e) {
            assertTrue(false);
        }
    }
}
