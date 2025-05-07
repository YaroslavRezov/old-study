public class JavaFuck40 {
    char c;
    static char l;
    static String s;
    public void m1(){
        char[ ] cA = { 'a' , 'b'};
        m2(c, cA);
        System.out.println( ( (int)c)  + "," + cA[1] );
    }
    public void m2(char c, char[ ] cA){
        this.c = 'b';
        cA[1] = cA[0] = 'm';

    }
    public static void main(String[] args){
        new JavaFuck40().m1();
        System.out.println();


    }
}
