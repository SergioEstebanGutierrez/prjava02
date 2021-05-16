package prjava02;

import java.io.*;
import java.net.*;

/**
 *
 * @author --> ester210403@gmail.com
 * 
 */
public class Prjava02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("versió 0.1 del projecte prjava02"); 
        System.out.println("Creació d'una branca del projecte prjava02");
        System.out.println("Afegint m�s codi a la branca00 del projecte prjava02");
	System.out.println("Afegint codi a la branca01 del projecte prjava02");
	try {
            InetAddress adreça = InetAddress.getLocalHost();
            String hostname = adreça.getHostName();
            System.out.println("hostname="+hostname);
            System.out.println("Nom de l'usuari: " + System.getProperty("user.name"));
            System.out.println("Carpeta Personal: " + System.getProperty("user.home"));
            System.out.println("Sistema operatiu: " + System.getProperty("os.name"));
            System.out.println("Versió OS: " + System.getProperty("os.version"));
        }
        catch (IOException e) {
		System.out.println("Exception occurred");
        }  
    }
}
