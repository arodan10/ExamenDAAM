package pe.edu.upeu.daam.examen;
import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
 
        Scanner inDAAM = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");                                                         
        n = inDAAM.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);                                                     
        }
    }
}
    



