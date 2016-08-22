import java.io.IOException;
import java.util.Scanner;

/**
 * Clase para leer el .txt y enviar sus datos y longitud arreglo.
 * @author German Garcia 15008.
 * @author Luis Nájera 15581.
 * version 23.08.16
 */
 
public class main {
    
    /**
     * Método main, ingresa la dirección del .txt.
     * @param args String[]
     * @throws IOException String[] 
     */
    public static void main(String[] args) throws IOException {              
        
        int dato=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Indique que tipo de implementación desea utilizar:");
        System.out.println("1. Arraylist");
        System.out.println("2. Vector");
        System.out.println("3. Lista");
        dato = sc.nextInt();
        String direccion = "C:\\Users\\Luis Nájera\\Desktop\\datos.txt";
        
        Factory prueba = new Factory();
        prueba.LeerTexto(direccion,dato);
        
    }
    
   
}
