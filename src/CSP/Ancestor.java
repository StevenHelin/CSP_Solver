package CSP;

import java.util.ArrayList;

public class Ancestor {
    ArrayList<VariableCSP>listvariable;
    VariableCSP fils;

    public Ancestor(VariableCSP fils) {
        this.listvariable = listvariable;
        this.fils = fils;
    }

    public ArrayList<VariableCSP> getListvariable() {
        return listvariable;
    }

    public void setListvariable(ArrayList<VariableCSP> listvariable) {
        this.listvariable = listvariable;
    }

    public VariableCSP getFils() {
        return fils;
    }

    public void setFils(VariableCSP fils) {
        this.fils = fils;
    }
}
