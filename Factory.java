import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * Clase factory encargada de instanciar la clase correspondiente para cada caso.
 * @author German Garcia 15008.
 * @author Luis Nájera 15581.
 * version 23.08.16
 */
public class Factory  {
    
    /*****************************************************************************************/
    
    public static void LeerTexto(String direccion, int n) throws FileNotFoundException, IOException{ 
        int cantidad_datos = 0;                                               
        int numero;                                                           
        char espacio_blanco;                                                  
        String salida;                                                        
        
        if (n==1){
            System.out.println("Arraylist :");
            
            Operaciones op = new Operaciones(cantidad_datos);         
            FileReader fr = new FileReader (direccion);     
            BufferedReader br = new BufferedReader (fr);    
            while((numero=br.read())!=-1){
            espacio_blanco=(char)(numero);                  

            if (espacio_blanco !=' '){                  
                salida = String.valueOf(espacio_blanco);
                op.operacion(salida, n);                   
            }
                
            }
            
        }
        
        
        if (n==2){
            System.out.println("Vector: ");
        
            try{                                                    
            FileReader fr = new FileReader (direccion);
            BufferedReader br = new BufferedReader (fr);
            while((numero=br.read())!=-1){
                espacio_blanco=(char)(numero);          
                
                if (espacio_blanco !=' '){              
                    cantidad_datos = cantidad_datos +1; 
                }
                
            }
            
        }catch (Exception ex){
        }   
        /*****************************************************************************************/
        
        Operaciones op = new Operaciones(cantidad_datos);         
        
        
        FileReader fr = new FileReader (direccion);     
        BufferedReader br = new BufferedReader (fr);    
        while((numero=br.read())!=-1){
        espacio_blanco=(char)(numero);                  
                
            if (espacio_blanco !=' '){                  
                salida = String.valueOf(espacio_blanco);
                op.operacion(salida,n);                   
            }
                
        }
        }
        
        if (n==3){
            System.out.println("List :");
            
            Operaciones op = new Operaciones(cantidad_datos);         
            FileReader fr = new FileReader (direccion);     
            BufferedReader br = new BufferedReader (fr);    
            while((numero=br.read())!=-1){
            espacio_blanco=(char)(numero);                  

            if (espacio_blanco !=' '){                  
                salida = String.valueOf(espacio_blanco);
                op.operacion(salida, n);                   
            }
                
            }
        }
        
        if (n>=4){
            System.out.println("Opción no valida");
        }
        
        if (n<=0){
            System.out.println("Opción no valida");
        }
    }
    
}
