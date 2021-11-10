package CSP;
import java.util.ArrayList;

public class CSP {
    ArrayList<VariableCSP> listeVariable;
    ArrayList<ArcCSP> listeArc;

    public CSP(int n,int durete,int domaine,double densité) {
        this.listeVariable = new ArrayList<VariableCSP>();
        this.listeArc = new ArrayList<ArcCSP>();

        for (int i=0;i <= n;i++){
            listeVariable.add(new VariableCSP(i,domaine));
        }
        for (int j=0;j <= n-1; j++){
            for (int k=j+1;k <=n; k++){
                listeArc.add(new ArcCSP(listeVariable.get(j),listeVariable.get(k),durete));
            }
        }
        //todo générer variables
        //todo générer tous les arcs
        //todo supprimmer random les arcs
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
