 /**
 *@author German Garcia, Luis Najera
 * @version 23.08.16
 * 
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class VectorTest {
    
    public VectorTest() {
    }
    

    /**
     * Test of push method, of class Vector.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object e = "+";
        Vector instance = new Vector<>(String.class,5);
        instance.push(e);
        // TODO review the generated test code and remove the default call to fail.
        if (!e.equals("+")){
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of pop method, of class Vector.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Vector instance = new Vector<>(String.class,5);
        Object expResult = "+";
        Object result = "+";
        if (!expResult.equals(result)){
            fail("The test case is a prototype.");
        }  
    }

    /**
     * Test of peek method, of class Vector.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        Vector instance = new Vector<>(String.class,5);
        Object expResult = "+";
        Object result = "+";
        if (!expResult.equals(result)){
            fail("The test case is a prototype.");
        }
    }
    
}
