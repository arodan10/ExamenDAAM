package pe.edu.upeu.daam.examen;
import java.util.Scanner;

public class Ejercicio4 {
    private static Scanner inDAAM= new Scanner(System.in);

        public static void main(String[] args) {
            int xDAAM,yDAAM;
            System.out.println("ingrese la base:  ");
            xDAAM = inDAAM.nextInt();
            System.out.println("Ingrese el exponente:  ");
            yDAAM = inDAAM.nextInt();            
    

            int baseDAAM = xDAAM;
            int exponenteDAAM = yDAAM;
            System.out.println("Respuesta:");
    
            System.out.println(potencia(baseDAAM, exponenteDAAM));
            
    
        }
    
        public static double potencia(int baseDAAM, int exponenteDAAM) {
            
            if (exponenteDAAM == 0) { 
                return 1; 
            } else if (exponenteDAAM == 1) { 
                return baseDAAM; 
            } else if (exponenteDAAM < 0) { 
                return potencia(baseDAAM, exponenteDAAM + 1) / baseDAAM;
            } else {  
                return baseDAAM * potencia(baseDAAM, exponenteDAAM - 1);
            }

            
        
    
        }
    
    
}
