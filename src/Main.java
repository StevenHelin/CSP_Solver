import CSP.CSP;
import Function.Backjumping;
import Function.BacktrackingChronologique;
import Function.ForwardChecking;

public class Main {

    public static void main(String[] args) {
        BacktrackingChronologique backtrack=new BacktrackingChronologique();
        Backjumping backjump=new Backjumping();
        ForwardChecking forwardChecking=new ForwardChecking();
        CSP csp = new CSP(5,0.5,3,0.5);
        System.out.println(csp.toString());
        System.out.println(backtrack.bt(csp));
        System.out.println(backjump.bj(csp));
        System.out.println(forwardChecking.fc(csp));
    }
}
