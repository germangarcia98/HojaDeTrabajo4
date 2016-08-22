
 /**
 * Clase encargada de realizar las operaciones del .txt.
 * @author German Garcia 15008.
 * @author Luis Nájera 15581.
 * version 23.08.16
 */
public class Operaciones {
    private int numero1;
    private int numero2;
    private int resultado;
    private boolean on1;
    private boolean on2;
    private int cantidadDatos;
    
    /**
     * Constructor.
     * @param cantidadDatos int.
     */    
    public Operaciones(int cantidadDatos) {
        numero1=0;
        numero2=0;
        resultado=0;
        on1=false;
        on2=false;
        this.cantidadDatos = cantidadDatos;
    }
    
    /**
     * Método operacion, ordena y opera los datos del .txt.
     * @param dato String.
     */
    public void operacion(String dato, int n) {             
        
        
        if ((on1==false)){      
            numero1=Integer.parseInt(dato);                                   
            on1=true;
        }else{
            if (on2==false){
                numero2=Integer.parseInt(dato);                               
                on2=true;
            }
        }
        
        if ((on1==true) && (on2==true)){                                      
            if (dato.equals("+")){
                numero1 = numero1+numero2;                                    
            }
            if (dato.equals("-")){
                numero1 = numero1-numero2;                                     
            }
            if (dato.equals("*")){
                numero1 = numero1*numero2;                                     
            }
            if (dato.equals("/")){
                numero1 = numero1/numero2;                                     
            }
            
            if ((!dato.equals("+"))&&(!dato.equals("-"))){                     
                if ((!dato.equals("*"))&&(!dato.equals("/"))){
                    if(!dato.equals(" ")){
                        numero2 = Integer.parseInt(dato);
                    }
                }
            }
            
            
            
            
        }
        
        if (n == 1){
            Arraylist pila= new Arraylist(String.valueOf(numero1));  
        }
        
        if (n == 2){
            Vector<String> pila= new Vector<>(String.class,cantidadDatos);  
            pila.push(String.valueOf(numero1));                                    
            System.out.println(pila.peek());
        }
                                               
        if (n == 3){
            List pila= new List(String.valueOf(numero1));  
        }
    }
    
}
