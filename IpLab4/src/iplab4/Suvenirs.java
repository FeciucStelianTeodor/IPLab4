/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedList;
import java.util.Set;
import java.util.ListIterator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Catalin
 */
public class Suvenirs {
    LinkedList<Suvenir> listaS = new LinkedList<>();
    Suvenir aux;

    public void InsertSuvsFromFile(String FILENAME) {
        String[] tokens;
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String currentLine;

            while ((currentLine = br.readLine()) != null) {
                Suvenir s = new Suvenir();
                tokens = currentLine.split(" ");
                s.categorie = tokens[0];
                s.id = Integer.parseInt(tokens[1]);
                s.nume = tokens[2];
                s.poza = tokens[3];
                s.pret = Integer.parseInt(tokens[4]);
            }
            listaS.add(s);
        }
    }
    
    Suvenirs SearchByCategorie(String categorie){
        Suvenirs result = new Suvenirs();
        ListIterator<Suvenir>  listIterator = listaS.listIterator();
        while(listIterator.hasNext()){
            aux = listIterator.next();
            if(aux.categorie == categorie){
                result.Add(aux);
            }
    }
        System.out.println(result);
        return result;
}
        public Suvenirs SearchByNume(String nume){
        Suvenirs result = new Suvenirs();
        ListIterator<Suvenir>  listIterator = listaS.listIterator();
        while(listIterator.hasNext()){
            aux = listIterator.next();
            if(aux.nume == nume){
                result.Add(aux);
            }
    }
                System.out.println(result);
        return result;
}
        public Suvenirs SearchById(int id){
        Suvenirs result = new Suvenirs();
        ListIterator<Suvenir>  listIterator = listaS.listIterator();
        while(listIterator.hasNext()){
            aux = listIterator.next();
            if(aux.id == id){
                result.Add(aux);
            }
    }        System.out.println(result);
        return result;
}
         public void loadSuvenirs(){//TODO: we read from file the data of suvenirs
             
         }
         
         public void updateById( int id, Suvenir suvenir){
        ListIterator<Suvenir>  listIterator = listaS.listIterator();
        while(listIterator.hasNext()){
            aux = listIterator.next();
            if(aux.id == id){
                aux = suvenir;
            }
    }
         }
         
         public void removeById(int id){
        ListIterator<Suvenir>  listIterator = listaS.listIterator();
        while(listIterator.hasNext()){
            aux = listIterator.next();
            if(aux.id == id){
                aux.pop();
            }
    }
         }
        
        
}
