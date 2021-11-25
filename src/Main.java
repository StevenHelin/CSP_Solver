import CSP.CSP;
import Function.BacktrackingChronologique;

public class Main {

    public static void main(String[] args) {
        BacktrackingChronologique backtrack=new BacktrackingChronologique();
        CSP csp = new CSP(3,0.5,3,0.5);
        System.out.println(csp.toString());
        System.out.println(backtrack.bt(csp));

    }
}
