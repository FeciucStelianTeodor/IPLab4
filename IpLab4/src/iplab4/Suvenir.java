package iplab4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Catalin
 */
public class Suvenir extends Suvenirs{
    public int id ;
    public String nume;
    public String categorie;
    public int pret;
    public String poza; //base 64

    public Suvenir() {
        id = 1023123;// id for test
    }

    public Suvenir(String nume, String categorie, int pret) {
        this.id = 213143;
        this.nume = nume;
        this.categorie = categorie;
        this.pret = pret;
    }
    
        public Suvenir(String nume, String categorie, int pret, String poza) {
        this.id = 213543;
        this.nume = nume;
        this.categorie = categorie;
        this.pret = pret;
        this.poza = poza;
    }
    

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public void setPoza(String poza) {
        this.poza = poza;
    }
}
