/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iplab4;

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
        
        //Construim o persoană
        Persoana persoana = new Persoana();
        persoana.setNume("Gheorghe");
        persoana.setEmail("gheorghe@lazar.ro");
        persoana.setCont("gheorghe");
        
        //Verificăm dacă persoana este validă
        if(server.doLogare(persoana))
        {
            System.out.println("Logat " + persoana);
        }
    }
    
}
