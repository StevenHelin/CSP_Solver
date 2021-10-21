package Function;


import CSP.*;
import java.util.ArrayList;


public class CSPGenerator {
    int n; //nb de variable
    int durete; //nb de contraintes
    int densite;
    int it; //nb d'iteration
    VariableCSP v1;
    VariableCSP v2;
    int domaine; //domaine
    ArrayList<Couple> listeCons;
    int[] nbSolution; //nb de solution
    CSP csp= new CSP(null,null);

    public CSPGenerator(int n, int durete,int domaine, VariableCSP v1, VariableCSP v2){
        int nbv=n; //nb de variable
        for (int i=0; i<=v1.getDomaine();i++){
            for (int j=0; j<=v2.getDomaine();j++){
                listeCons.add(new Couple(i,j));
            }
        }
        for (int i=0; i<domaine*domaine-durete;i++){
           int random = (int) (Math.random()*(listeCons.size()-0));
           if (random== )
        }


    }

}
