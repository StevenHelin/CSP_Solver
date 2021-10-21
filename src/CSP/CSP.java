package CSP;
import java.util.ArrayList;

public class CSP {
    ArrayList<VariableCSP> listeVariable;
    ArrayList<ArcCSP> listeArc;

    public CSP(ArrayList<VariableCSP> listeVariable, ArrayList<ArcCSP> listeArc) {
        this.listeVariable = listeVariable;
        this.listeArc = listeArc;
    }

    public ArrayList<VariableCSP> getListeVariable() {
        return listeVariable;
    }

    public void setListeVariable(ArrayList<VariableCSP> listeVariable) {
        this.listeVariable = listeVariable;
    }

    public ArrayList<ArcCSP> getListeArc() {
        return listeArc;
    }

    public void setListeArc(ArrayList<ArcCSP> listeArc) {
        this.listeArc = listeArc;
    }
}
