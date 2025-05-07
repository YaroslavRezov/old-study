public class LastJava35 {
    int i;
    private LastJava35Super m = new LastJava35Super();
    public void makeItNull(LastJava35Super pM){
        pM.i = 1;
        pM = null;
    }
    public void makeThisNull(){
        makeItNull(m);
    }
    public static void main(String[] args){
        LastJava35 n = new LastJava35();
        n.makeThisNull();
        System.out.println(n.m.i);
    }
}
