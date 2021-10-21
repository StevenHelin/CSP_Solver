package CSP;

public class VariableCSP {
    int idv;
    int domaine;

    public VariableCSP(int idv, int domaine) {
        this.idv = idv;
        this.domaine = domaine;
    }

    public int getDomaine() {
        return domaine;
    }

    public void setDomaine(int domaine) {
        this.domaine = domaine;
    }

    public int getIdv() {
        return idv;
    }

    public void setIdv(int idv) {
        this.idv = idv;
    }
}
