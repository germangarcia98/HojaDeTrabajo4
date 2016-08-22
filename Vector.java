
import java.lang.reflect.Array;


/**
 * Clase utilizada para guardar datos en vector, implementa Stack.
 * @author German Garcia 15008.
 * @author Luis Nájera 15581.
 * version 23.08.16
 */
public class Vector<T> implements Stack<T>{ 
    private T datos[];                                                         
    private int tamaño;                                                        
    private int top;                                                           
    
    /**
     * Constructor.
     * @param dato_entrada T.
     * @param tamaño int.
     */
    public Vector(Class<T> dato_entrada, int tamaño){                          
        this.tamaño = tamaño;                                                  
        top=-1;                                                                
        datos=(T[]) Array.newInstance(dato_entrada, tamaño);                   
    }
    
    
    /**
     * Metodo push, ingresa los datos a un array.
     * @param e T.
     */
    @Override
    public void push(T e) {                                                   
        if (top<tamaño-1){                                                    
            datos[++top]=e;                                                   
        }
    }

    /**
     * Metodo pop, extrae los datos del array del último al primero en ingresar.
     * @return El ultimo dato del array.
     */
    @Override
    public T pop() {
        T salida=null;                                                        
        if (top>=0){                                                          
            salida=datos[top--];                                              
        }
        return salida;                                                        
    }

    /**
     * Metodo peek, muestra el último dato del array.
     * @return último dato del array.
     */
    @Override
    public T peek() {
        return datos[top];                                                    
    }
    
}
