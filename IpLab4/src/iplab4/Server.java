/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iplab4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author michael
 */
public class Server {

    private LinkedList<Persoana> valide;
    private LinkedList<Persoana> logate;

    public Server() {
        this.valide = new LinkedList<>();
        citestePersoaneValide();
    }

    private void citestePersoaneValide() {
        String line;
        String[] substrings;
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("valid.in"));

            while ((line = reader.readLine()) != null) {
                substrings = line.split(" ");

                Persoana noua = new Persoana();
                noua.setNume(substrings[0]);
                noua.setEmail(substrings[1]);
                noua.setCont(substrings[2]);

                valide.add(noua);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void scriePersoaneValide() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("valid.in"));
            for (Persoana element : valide) {
                writer.write(element.getNume() + " ");
                writer.write(element.getEmail() + " ");
                writer.write(element.getCont() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void doLogare(Persoana persoana) {
        for (Persoana element : valide) {
            if (element.getNume().equals(persoana.getNume())
                    && element.getEmail().equals(persoana.getEmail())
                    && element.getCont().equals(persoana.getCont())) {
                logate.add(persoana);
                break;
            }
        }
    }
}
