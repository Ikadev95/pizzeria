package it.epicode.pizzeria.listini;

import it.epicode.pizzeria.cibarie.Bevanda;
import it.epicode.pizzeria.cibarie.Pizza;

public class Listino {
    public String codice;
    public String descrizione;
    public Pizza[] pizze;
    public float incrementoDiCostoSeBattuta;
    public float incrementoDiCostoSeFamiglia;
    public Bevanda[] bevande;

    public void stampaListino (){
        System.out.println("*********************************");
        System.out.println(descrizione);
        System.out.println("*********************************");

/*        for (int i = 0; i < pizze.length; i++) {
            Pizza pizza = pizze[i];
            System.out.println(pizza.descrizione + " " + pizza.prezzo);
        }*/

        int j = 0;
        while (j < pizze.length){
            Pizza pizza = pizze[j];
            System.out.println(pizza.descrizione + " " + pizza.prezzo);
            j++;
        }

        System.out.println("*********************************");
        System.out.println("Bevande");
        System.out.println("*********************************");

        //come il foreach
        int count = 0;
        for (Bevanda bevanda : bevande) {
            count++;
            System.out.println(bevanda.descrizione + " " + bevanda.prezzo);
            if(count == 3) break;
        }

    }
}
