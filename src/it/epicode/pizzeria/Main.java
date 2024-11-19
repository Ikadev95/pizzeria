package it.epicode.pizzeria;

import it.epicode.pizzeria.cibarie.Bevanda;
import it.epicode.pizzeria.cibarie.Pizza;
import it.epicode.pizzeria.listini.Listino;

public class Main {

    public static void main(String[] args) {
        Listino listino = new Listino();
        Pizza margherita = new Pizza();
            margherita.descrizione = "pizza margherita";
            margherita.codice = "marg";
            margherita.ingredienti = "pomodoro, mozzarella, olio";
            margherita.prezzo = 5;

        Pizza diavola = new Pizza();
            diavola.descrizione = "pizza diavola";
            diavola.codice = "diav";
            diavola.ingredienti = "pomodoro, mozzarella, salame piccante, olio";
            diavola.prezzo = 6;

        Pizza capricciosa = new Pizza();
            capricciosa.descrizione = "pizza capricciosa";
            capricciosa.codice = "capr";
            capricciosa.ingredienti = "pomodoro, mozzarella, prosciutto, funghi, olive, carciofi";
            capricciosa.prezzo = 7;

        Pizza formaggi4 = new Pizza();
            formaggi4.descrizione = "pizza 4 formaggi";
            formaggi4.codice = "4frm";
            formaggi4.ingredienti = "mozzarella, gorgonzola, fontina, parmigiano, olio";
            formaggi4.prezzo = 6;

        Pizza greca = new Pizza();
            greca.descrizione = "pizza greca";
            greca.codice = "grec";
            greca.ingredienti = "pomodoro, mozzarella, feta, olive nere, cipolla rossa, origano";
            greca.prezzo = 5;

        Bevanda aranciata = new Bevanda();
            aranciata.codice = "ar";
            aranciata.prezzo = 2;
            aranciata.descrizione = "fanta";

        Bevanda cocacola = new Bevanda();
        cocacola.codice = "cc";
        cocacola.prezzo = 2;
        cocacola.descrizione = "Coca-Cola";

        Bevanda acquaNaturale = new Bevanda();
        acquaNaturale.codice = "an";
        acquaNaturale.prezzo = 1;
        acquaNaturale.descrizione = "Acqua naturale";

        Bevanda acquaFrizzante = new Bevanda();
        acquaFrizzante.codice = "af";
        acquaFrizzante.prezzo = 1;
        acquaFrizzante.descrizione = "Acqua frizzante";

        Bevanda theFreddoLimone = new Bevanda();
        theFreddoLimone.codice = "tl";
        theFreddoLimone.prezzo = 2;
        theFreddoLimone.descrizione = "Tè freddo al limone";

        Bevanda theFreddoPesca = new Bevanda();
        theFreddoPesca.codice = "tp";
        theFreddoPesca.prezzo = 2;
        theFreddoPesca.descrizione = "Tè freddo alla pesca";

        listino.descrizione = "listino estate";
        listino.codice = "est";
        listino.incrementoDiCostoSeBattuta = 2;
        listino.incrementoDiCostoSeFamiglia = 5;

        listino.pizze = new Pizza[]{margherita, diavola, capricciosa, formaggi4, greca};
        listino.bevande = new Bevanda[]{cocacola, acquaFrizzante, aranciata, theFreddoPesca,theFreddoLimone, acquaNaturale};
        listino.stampaListino();

    }
}
