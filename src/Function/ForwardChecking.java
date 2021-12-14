package Function;

import CSP.*;

import java.util.ArrayList;
import java.util.List;

public class ForwardChecking {

    public List<Solution> fc(CSP csp){
        int i=0;
        boolean domaineVide=true;
        boolean ok = true;
        ArrayList<Domaine> dcopy= new ArrayList<Domaine>();
        ArrayList<Solution>listSolution=new ArrayList<Solution>();
        int x=0;//valeur prise au hasard dans la liste de valeur du domaine
        ArrayList<Domaine> dstar=new ArrayList<Domaine>();
        for(int j=0;j<csp.getListeVariable().size();j++){
            listSolution.add(new Solution(csp.getListeVariable().get(j)));
            dstar.add(new Domaine(csp.getListeVariable().get(j).getDomaine()));
        }
        while (i>=0 && i<csp.getListeVariable().size()){
            ok=false;
            while (!ok && dstar.get(i).getValeur().size()!=0){
                for(int j=0;j<csp.getListeVariable().size();j++){
                    dcopy.add(dstar.get(j).deepcopy());
                }
                x=dstar.get(i).getValeur().get(0);
                dstar.get(i).getValeur().remove(0);
                listSolution.get(i).setValeur(x);
                domaineVide=false;
                for (int k=i+1;k<csp.getListeVariable().size();k++){
                    REVISE(k,i);
                    if(dstar.get(k).getValeur().isEmpty()){
                        domaineVide=true;
                    }
                }
                if(domaineVide){
                    for(int k=i+1;k<csp.getListeVariable().size();k++){
                        dstar.set(k,dcopy.get(k));
                    }
                }else{
                    ok=true;
                }
            }
            if(!ok){
                dstar.get(i).getValeur().clear();
                for (int j=0;j<=csp.getListeVariable().size();j++){
                    dstar.get(i).getValeur().add(j);
                }
                listSolution.get(i).setValeur(-1);
                i--;
            }else{
                i++;
            }
        }
        if(i==-1){
            return null;
        }else{
            return listSolution;
        }
    }

    public void REVISE(int m,int n){

    }

    public boolean verification(CSP csp, List<Solution>listsolution){
        for (ArcCSP arc: csp.getListeArc() ){
            Solution s1=null;
            Solution s2=null;
            for(Solution lists:listsolution){
                if (arc.getDébut().equals(lists.getV())){
                    s1 = lists;
                }
                if(arc.getFin().equals(lists.getV())){
                    s2 = lists;
                }
            }
            boolean ok=false;
            for (Couple contraintes: arc.getContraintes()){
                if(contraintes.getV1()== s1.getValeur() && contraintes.getV2()==s2.getValeur()) {
                    ok = true;
                }
                if(-1== s1.getValeur() && -1==s2.getValeur()) {
                    ok = true;
                }
                if(-1== s1.getValeur() && contraintes.getV2()==s2.getValeur()) {
                    ok = true;
                }
                if(contraintes.getV1()== s1.getValeur() && -1==s2.getValeur()) {
                    ok = true;
                }
            }if (!ok){
                return false;
            }
        }
        return true;
    }
}
