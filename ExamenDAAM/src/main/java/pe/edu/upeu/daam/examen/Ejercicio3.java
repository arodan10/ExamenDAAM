package pe.edu.upeu.daam.examen;
import java.util.Scanner;

public class Ejercicio3 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int i, j, suma,n;

        System.out.println("Ingrese el numero limite para buscar los números perfectos: ");
        n = in.nextInt();
        for(i=1;i <= n;i++){    
            suma = 0;
            for(j = 1;j < i;j++){                             
                if(i % j==0){
                suma = suma + j; 
                }
            }
            if(i == suma){                           
                System.out.println(i);
            }
        }
    }    
    
    
}
