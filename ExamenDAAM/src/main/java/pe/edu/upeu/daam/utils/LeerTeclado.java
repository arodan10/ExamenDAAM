package pe.edu.upeu.daam.utils;

import java.io.*;

public class LeerTeclado {

BufferedReader readerI =new BufferedReader(new InputStreamReader(System.in));  

public LeerTeclado(InputStream in) {
}

public int read(int valor, String msg) {
    System.out.println(msg);
    try {
        valor=Integer.parseInt(readerI.readLine());
    } catch (Exception e) {
        System.out.println("Intente de nuevo");
        valor=read(valor,msg);
    }
    return valor;
}

public double read(double valor, String msg) {
    System.out.println(msg);
    try {
        valor=Double.parseDouble(readerI.readLine());
    } catch (Exception e) {
        System.out.println("Intente de nuevo");
        valor=read(valor,msg);
    }
    return valor;    
}

public char read(char valor, String msg) {
    System.out.println(msg);
    try {
        valor=readerI.readLine().charAt(0);
    } catch (Exception e) {
        System.out.println("Intente de nuevo");
        valor=read(valor,msg);
    }
    return valor;    
}

public String read(String valor, String msg) {
    System.out.println(msg);
    try {
        valor=readerI.readLine();
    } catch (Exception e) {
        System.out.println("Intente de nuevo");
        valor=read(valor,msg);
    }
    return valor;      
}

public boolean read(boolean valor, String msg) {
    System.out.println(msg);
    try {
        valor=Boolean.parseBoolean(readerI.readLine());
    } catch (Exception e) {
        System.out.println("Intente de nuevo");
        valor=read(valor,msg);
    }
    return valor;        
}

public int nextInt() {
    return 0;
}

public void nextLine() {

}

public double nextDouble() {
    return 0;
}


}