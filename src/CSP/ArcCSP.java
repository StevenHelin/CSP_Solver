package CSP;

import java.util.ArrayList;

public class ArcCSP {
    VariableCSP début;
    VariableCSP fin;
    ArrayList<Couple> contraintes;

    public ArcCSP(VariableCSP début, VariableCSP fin, ArrayList<Couple> contraintes) {
        this.début = début;
        this.fin = fin;
        this.contraintes = contraintes;
    }

    public VariableCSP getDébut() {
        return début;
    }

    public void setDébut(VariableCSP début) {
        this.début = début;
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
}
