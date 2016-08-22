
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Clase útilizada para crear un arreglo de listas.
 * @author German Garcia 15008.
 * @author Luis Nájera 15581.
 * version 23.08.16
 */
public class Arraylist {
    
    List listA = new ArrayList();
    
    Arraylist (String dato){
        listA.add(dato);
        
        Iterator iter = listA.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        
    }
    
    
    
}
