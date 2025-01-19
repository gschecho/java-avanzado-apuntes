package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class JunitTest {

    private List<String> palabras;


    @Before
    public void setUp(){

        System.out.println("Iniciando Test");
        palabras =Arrays.asList("Es","Una", "cosa","muy","que","decir");
    }


    public void  hasSixStringsAssert(){


    }


    // Nueva versión
    @Test
    public void hasSixStrings(){
        assertThat(palabras.size(), is(6));
    }


    @After
    public void cleanUp(){
        System.out.println("Finalizando test, limpiando.");
    }
}
