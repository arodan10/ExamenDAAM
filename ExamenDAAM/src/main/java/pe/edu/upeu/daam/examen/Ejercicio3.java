package pe.edu.upeu.daam.examen;
import java.util.Scanner;

public class Ejercicio3 {
    private static Scanner inDAAM = new Scanner(System.in);
    public static void main(String[] args) {
        int iDAAM, jDAAM, sumaDAAM,n;

        System.out.println("Ingrese el numero limite para buscar los números perfectos: ");
        n = inDAAM.nextInt();
        for(iDAAM=1;iDAAM <= n;iDAAM++){    
            sumaDAAM = 0;
            for(jDAAM = 1;jDAAM < iDAAM;jDAAM++){                             
                if(iDAAM % jDAAM==0){
                sumaDAAM = sumaDAAM + jDAAM; 
                }
            }
            if(iDAAM == sumaDAAM){                           
                System.out.println(iDAAM);
            }
        }
    }    
    
    
}
