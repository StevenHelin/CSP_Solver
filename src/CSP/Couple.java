package CSP;

public class Couple {
    int v1;
    int v2;

    public Couple(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }

    @Override
    public String toString() {
        return "Couple{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                '}';
    }
}
