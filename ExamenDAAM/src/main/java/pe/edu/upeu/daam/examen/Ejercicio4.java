package pe.edu.upeu.daam.examen;
import java.util.Scanner;

public class Ejercicio4 {
    private static Scanner in = new Scanner(System.in);

        public static void main(String[] args) {
            int x,y;
            System.out.println("ingrese la base:  ");
            x = in.nextInt();
            System.out.println("Ingrese el exponente:  ");
            y = in.nextInt();            
    

            int base = x;
            int exponente = y;
            System.out.println("Respuesta:");
    
            System.out.println(potencia(base, exponente));
            
    
        }
    
        public static double potencia(int base, int exponente) {
            
            if (exponente == 0) { 
                return 1; 
            } else if (exponente == 1) { 
                return base; 
            } else if (exponente < 0) { 
                return potencia(base, exponente + 1) / base;
            } else {  
                return base * potencia(base, exponente - 1);
            }

            
        
    
        }
    
    
}
