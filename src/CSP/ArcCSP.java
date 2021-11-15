package CSP;

import java.util.ArrayList;
import java.util.Random;

public class ArcCSP {
    VariableCSP debut;
    VariableCSP fin;
    ArrayList<Couple> contraintes;

    public ArcCSP(VariableCSP debut, VariableCSP fin, int durete) {
        this.debut = debut;
        this.fin = fin;
        this.contraintes = new ArrayList<Couple>();
        for (int i=0; i<=debut.getDomaine();i++){
            for (int j=0; j<=fin.getDomaine();j++){
                contraintes.add(new Couple(i,j));
            }
        }
        Random r = new Random();
        for (int i=0; i<debut.getDomaine()*fin.getDomaine()-durete;i++){
            contraintes.remove(r.nextInt(contraintes.size()));
        }
    }


    public VariableCSP getDébut() {
        return debut;
    }

    public void setDébut(VariableCSP début) {
        this.debut = début;
    }

    public VariableCSP getFin() {
        return fin;
    }

    public void setFin(VariableCSP fin) {
        this.fin = fin;
    }

    public ArrayList<Couple> getContraintes() {
        return contraintes;
    }

    public void setContraintes(ArrayList<Couple> contraintes) {
        this.contraintes = contraintes;
    }

    @Override
    public String toString() {
        return "ArcCSP{" +
                "debut=" + debut +
                ", fin=" + fin +
                ", contraintes=" + contraintes +
                '}';
    }
}
