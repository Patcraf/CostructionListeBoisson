package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class UtilsBoissons implements iListUtils{
    /** Permet de construire une liste de boissons a partir des donnees issue du fichier boissons_csv.txt **/

    @Override
    public ArrayList<Boisson> buildArrayListFromResources() {
        ArrayList<Boisson> lalisteAmettreAjour = new ArrayList<>();
        ClassLoader myClassLoader = Thread.currentThread().getContextClassLoader();
        InputStream in = myClassLoader.getResourceAsStream("boisson_csv.txt");
        InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        String ligne ="";

      //  try (BufferedReader in = new BufferedReader(new FileReader(String.valueOf(this.getClass().getResource("boisson_csv.txt"))))) {

            while (true){
                try{
                    if (!((ligne = br.readLine()) != null)) break;
                } catch (Exception e) {
               System.out.println("erreur I/O" + e.getMessage());
                }
                String[] tableau_valeurs_boisson = ligne.split(";");
                Boisson b = new Boisson();
                b.setNom(tableau_valeurs_boisson[0]);
                b.setPrix(Integer.parseInt(tableau_valeurs_boisson[1]));
                b.setCold(Boolean.parseBoolean(tableau_valeurs_boisson[2]));
                lalisteAmettreAjour.add(b);
            }

        return lalisteAmettreAjour;
    }
}
