/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iplab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author feciu
 */
public class IpLab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Construim un server
        Server server = new Server();

        String[] credentials = new String[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Nume: ");
            credentials[0] = reader.readLine();
            System.out.println("Email: ");
            credentials[1] = reader.readLine();
            System.out.println("Cont: ");
            credentials[2] = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
                //Construim o persoană
        Persoana persoana = new Persoana();
        persoana.setNume(credentials[0]);
        persoana.setEmail(credentials[1]);
        persoana.setCont(credentials[2]);

        //Verificăm dacă persoana este validă
        if (server.doLogare(persoana)) {
            System.out.println("Logat " + persoana);
        }
        else {
            System.out.println("Nu s-a putut autentifica utilizatorul");
        }


    }

}
