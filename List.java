import java.util.Iterator;
import java.util.LinkedList;

/**
 * Clase utilizada para almacenar los datos en lista.
 * @author German Garcia 15008.
 * @author Luis Nájera 15581.
 * version 23.08.16
 */
public class List {
    LinkedList listB = new LinkedList();
    
    
    List (String dato){
        listB.add(dato);
        
        Iterator iter = listB.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        
    }
}
