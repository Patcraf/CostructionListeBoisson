package org.example;

public class Boisson {
    private String Nom;
    private int prix;
    private boolean isCold;



//setter et getter
    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public boolean isCold() {
        return isCold;
    }

    public void setCold(boolean cold) {
        isCold = cold;
    }

    //const
    public Boisson() {
    }

    public Boisson(String nom, int prix, boolean isCold) {
        Nom = nom;
        this.prix = prix;
        this.isCold = isCold;
    }
}
