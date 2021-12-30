import CSP.CSP;
import Function.Backjumping;
import Function.BacktrackingChronologique;
import Function.ForwardChecking;

public class Main {

    public static void resolution(int n, double densite, int domaine, double durete){
        double totalBt= 0;
        double totalBj=0;
        double totalFc=0;
        BacktrackingChronologique backtrack=new BacktrackingChronologique();
        Backjumping backjump=new Backjumping();
        ForwardChecking forwardChecking=new ForwardChecking();
        CSP csp;
        long start;
        System.out.println("Variable= "+ n+"densité="+densite+"domaine="+domaine+"dureté="+durete);
        for (int i= 0; i<100; i++){
            csp = new CSP(n,durete,domaine,densite);
            start=System.currentTimeMillis();
            ///backtracking
            backtrack.bt(csp);
            totalBt += System.currentTimeMillis()-start;
            start=System.currentTimeMillis();
            ///backjumping
            backjump.bj(csp);
            totalBj += System.currentTimeMillis()-start;
            start=System.currentTimeMillis();
            ///forwardchecking
            forwardChecking.fc(csp);
            totalFc += System.currentTimeMillis()-start;
        }
        System.out.println(String.format("backtracking: %f",totalBt/(100.0*1000)));
        System.out.println(String.format("backjumping: %f",totalBj/(100.0*1000)));
        System.out.println(String.format("forwardchecking : %f",totalFc/(100.0*1000)));

    }

    public static void main(String[] args) {
        BacktrackingChronologique backtrack=new BacktrackingChronologique();
        Backjumping backjump=new Backjumping();
        ForwardChecking forwardChecking=new ForwardChecking();
        //CSP csp = new CSP(5,0.5,3,0.5);
        //System.out.println(csp.toString());
        //System.out.println(backtrack.bt(csp));
        //System.out.println(backjump.bj(csp));
        //System.out.println(forwardChecking.fc(csp));

        //Variable
        /**resolution(10,0.5,10,0.5);
        resolution(20,0.5,10,0.5);
        resolution(30,0.5,10,0.5);
        resolution(40,0.5,10,0.5);
        resolution(50,0.5,10,0.5);
        resolution(100,0.5,10,0.5);**/

        //densité
        /**resolution(10,0.2,10,0.5);
        resolution(10,0.4,10,0.5);
        resolution(10,0.6,10,0.5);
        resolution(10,0.8,10,0.5);
        resolution(10,1,10,0.5);

        resolution(20,0.2,10,0.5);
        resolution(20,0.4,10,0.5);
        resolution(20,0.6,10,0.5);
        resolution(20,0.8,10,0.5);
        resolution(20,1,10,0.5);
        **/
        //dureté

        /**resolution(10,0.5,10,0.2);
        resolution(10,0.5,10,0.4);
        resolution(10,0.5,10,0.6);
        resolution(10,0.5,10,0.8);
        resolution(10,0.5,10,1);

        resolution(20,0.5,10,0.2);
        resolution(20,0.5,10,0.4);
        resolution(20,0.5,10,0.6);
        resolution(20,0.5,10,0.8);
        resolution(20,0.5,10,1);***/

        //domaine

        resolution(10,0.5,5,0.5);
        resolution(10,0.5,10,0.5);
        resolution(10,0.5,15,0.5);
        resolution(10,0.5,25,0.5);
    }
}
