package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");

        UtilsBoissons utilitaireBoissons = new UtilsBoissons();

        ArrayList<Boisson> lalisteDesBoissonsCourante = utilitaireBoissons.buildArrayListFromResources();

        for (Boisson b : lalisteDesBoissonsCourante ){
        System.out.println("les parametres de la boisson :" + b.getNom() + ":" + b.getPrix() + ":" + b.isCold());
        }
    }

}
