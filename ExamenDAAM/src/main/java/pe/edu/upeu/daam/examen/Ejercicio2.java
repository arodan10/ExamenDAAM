package pe.edu.upeu.daam.examen;
import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
 
        Scanner inDAAM = new Scanner(System.in);
        int nDAAM;
        System.out.print("Introduce un número entero: ");                                                         
        nDAAM = inDAAM.nextInt();
        System.out.println("Tabla del " + nDAAM);
        for(int iDAAM = 1; iDAAM<=10; iDAAM++){
             System.out.println(nDAAM + " * " + iDAAM + " = " + nDAAM*iDAAM);                                                     
        }
    }
}
    



