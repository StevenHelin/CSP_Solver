package CSP;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "VariableCSP{" +
                "idv=" + idv +
                ", domaine=" + domaine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VariableCSP that = (VariableCSP) o;
        return idv == that.idv && domaine == that.domaine;
    }
}
