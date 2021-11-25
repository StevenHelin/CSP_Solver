package CSP;

public class Solution {
    VariableCSP v;
    int valeur;

    public Solution(VariableCSP v) {
        this.v = v;
        this.valeur = -1;
    }

    public VariableCSP getV() {
        return v;
    }

    public void setV(VariableCSP v) {
        this.v = v;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        return "Solution{" +
                "v=" + v +
                ", valeur=" + valeur +
                '}';
    }
}
