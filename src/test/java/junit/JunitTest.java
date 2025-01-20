package junit;

import org.junit.*;
import org.junit.internal.runners.statements.Fail;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class JunitTest {

    private List<String> palabras;


    @BeforeClass
    public static void inicialization(){
        System.out.println("Solo ocurre una vez antes de que se inicie la clase");
    }
    @Before
    public void setUp(){

        System.out.println("Iniciando Test");
        palabras =Arrays.asList("Es","Una", "cosa","muy","que","decir");
    }


    @Test @Ignore
    public void  hasSixStringsAssert(){

        Assert.assertEquals("debe ser un numero 6",6, palabras.size());
    }


    // Nueva versión
    @Test
    public void hasSixStrings(){
        assertThat(palabras.size(), is(6));
    }


    // Exceptions
    // Old style junit 3
    public void nullListThrowsNPEANTES(){
        palabras = null;
        try{
            palabras.add("test");
            fail("Debería haber tirado una excepcion");
        }catch(NullPointerException ex){
        Assert.assertNull(palabras);}
    }

//New stile junit 4
    @Test(expected = NullPointerException.class)
    public void nullListThrowsNPE(){
        palabras= null;
        palabras.add("test");
    }

    // Podemos decirle que tipo de excepcion se espera
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void nullListThrowsNPEUsingRule(){
        String[] stringArray = palabras.toArray(new String[0]);
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        thrown.expectMessage("7");
        System.out.println(stringArray[7]);
    }


    @After
    public void cleanUp(){
        System.out.println("Finalizando test, limpiando.");
    }
}
