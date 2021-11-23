package Function;

import CSP.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BacktrackingChronologique {

    public Solution bt(CSP csp,int i){
        i = 1;
        boolean ok = true;
        Solution assignation=new Solution(null);
        ArrayList<Solution>listSolution=new ArrayList<Solution>();
        for (int j=0;j<=csp.getListeVariable().size();j++){
            listSolution.get(j).setValeur(-1);
        }
        int x=0;//valeur prise au hasard dans la liste de valeur du domaine
        Domaine dstar=new Domaine(csp.getListeVariable().get(0).getDomaine());
        while (i<=csp.getListeVariable().size()){
            ok=false;
            while (!ok && dstar.getValeur().size()!=0){
                x=dstar.getValeur().get(0);
                dstar.getValeur().remove(0);
                if(verification(csp, listSolution)){
                    ok=true;
                }
            }
            if(!ok){
                bt(csp,i--);
            }else{
                i++;
                dstar=new Domaine(csp.getListeVariable().get(0).getDomaine());
            }
        }
        if (i==0){
            return null;
        }else{
            //todo assignation cohérente
            return null;
        }
    }
    public boolean verification(CSP csp, List<Solution>listsolution){
        for (ArcCSP arc: csp.getListeArc() ){
            Solution s1=new Solution(null);
            Solution s2=new Solution(null);
            for(Solution lists:listsolution){
                if (arc.getDébut().equals(lists.getV())){
                    s1.setV(arc.getDébut());
                }
                if(arc.getFin().equals(lists.getV())){
                    s2.setV(arc.getFin());
                }
            }
            for (Couple contraintes: arc.getContraintes()){
                if(contraintes.getV1()== s1.getValeur() && contraintes.getV2()==s2.getValeur()){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }
}
