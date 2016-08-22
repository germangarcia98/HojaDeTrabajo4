
import org.junit.Test;
import static org.junit.Assert.*;

 /**
 *@author German Garcia, Luis Najera
 * @version 23.08.16
 * 
 */
public class OperacionesTest {
    
    public OperacionesTest() {
    }
    

    /**
     * Test of operacion method, of class Operaciones.
     */
    @Test
    public void testOperacion() {
        System.out.println("operacion");
        String dato = "8";
        int n = 2;
        Operaciones instance = new Operaciones(n);
        instance.operacion(dato, n);
        if (n==0){
            fail("The test case is a prototype.");
        }
    }
    
}
