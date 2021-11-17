package CSP;

import java.util.ArrayList;

public class Domaine {
    int taille=0;///taille du domaine
    ArrayList<Integer>valeur=new ArrayList<Integer>();

    public Domaine(int taille) {
        this.taille = taille;
        int i=0;
        while (i<=taille){
            this.valeur.add(i);
            i++;
        }
    }

    public ArrayList<Integer> getValeur() {
        return valeur;
    }

    public void setValeur(ArrayList<Integer> valeur) {
        this.valeur = valeur;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
}
