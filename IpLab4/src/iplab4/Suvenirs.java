/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedList;
import java.util.Set;
import java.util.ListIterator;

/**
 *
 * @author Catalin
 */
public class Suvenirs {
    LinkedList<Suvenir> listaS = new LinkedList<>();
    Suvenir aux;
    void Add(Suvenir mySuvenir){
        listaS.add(mySuvenir);
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
    }
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
             
         }
        
        
}
