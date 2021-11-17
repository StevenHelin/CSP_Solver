package Function;

import CSP.*;

import java.util.Random;

public class BacktrackingChronologique {

    public Solution bt(CSP csp,int i){
        i = 1;
        boolean ok = true;

        int x=0;//valeur prise au hasard dans la liste de valeur du domaine
        Domaine dstar=new Domaine(csp.getListeVariable().get(0).getDomaine());
        while (i<=csp.getListeVariable().size()){
            ok=false;
            while (!ok && dstar.getValeur().size()!=0){
                x=dstar.getValeur().get(0);
                dstar.getValeur().remove(0);
                //todo si assignation courante est cohérente
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

}
