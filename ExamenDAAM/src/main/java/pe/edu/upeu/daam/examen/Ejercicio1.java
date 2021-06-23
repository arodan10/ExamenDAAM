package pe.edu.upeu.daam.examen;

import java.util.Scanner;

public class Ejercicio1 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int i, n;
        double categoria_1DAAM, categoria_2DAAM, categoria_3DAAM, claveDAAM, costoDAAM;
        double impuestoDAAM, impuesto_a_pagarDAAM;
        categoria_1DAAM = 0;
        categoria_2DAAM = 0;
        categoria_3DAAM = 0;
        impuesto_a_pagarDAAM= 0;
        System.out.print("Ingrese la cantidad de vehiculos: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("vehiculo " + i );
            System.out.print(" Ingresa la categoria del vehiculo: ");
            claveDAAM = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el costo del vehiculo: ");
            costoDAAM = in.nextDouble();
            in.nextLine();
            impuestoDAAM=0;
            if(claveDAAM==1)
            {
                impuestoDAAM=costoDAAM*0.12;
                categoria_1DAAM=categoria_1DAAM+impuestoDAAM;
            }
            if(claveDAAM==2)
            {
                impuestoDAAM=costoDAAM*0.08;
                categoria_2DAAM=categoria_2DAAM+impuestoDAAM;
            }
            if(claveDAAM==3)
            {
                impuestoDAAM=costoDAAM*0.05;
                categoria_3DAAM=categoria_3DAAM+impuestoDAAM;
            }
            impuesto_a_pagarDAAM=impuesto_a_pagarDAAM+impuestoDAAM;
            System.out.println("Valor de impuesto: " + impuestoDAAM);
            System.out.println();
        }
        System.out.println("Valor de categoria 1: " + categoria_1DAAM + " soles");
        System.out.println("Valor de categoria 2: " + categoria_2DAAM+ " soles");
        System.out.println("Valor de categoria 3: " + categoria_3DAAM+ " soles");
        System.out.println("Valor de impuesto a pagar: " + impuesto_a_pagarDAAM + " soles");
    }

}

    

