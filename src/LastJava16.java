public class LastJava16 {
    public static void main(String[] args) {
        for(int i=0; i<3; i++){
            System.out.println(i);
        }
        if(Boolean.TRUE == new Boolean(true)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        LastJava16 lastJava16 = new LastJava16();
        lastJava16.doneeee();
    }
    void done() {
        int i;
        for (;;){
            i= 0;
        }
    }
    void donee() {this.done();
    done();}
    static void doneeee(){}
}
