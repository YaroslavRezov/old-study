public class JavaFail60 {
    void probe(int... x) { System.out.println("In ..." + x); }  //1

//    void probe(Integer x) { System.out.println("In Integer" + x); } //2

    void probe(long x) { System.out.println("In long" + x); } //3

    void probe(Long x) { System.out.println("In LONG" + x); } //4
    static String ccoking(){
        return null;
    }

    public static void main(String[] args){
        Integer a = 4; new JavaFail60().probe(a); //5
        int b = 5; new JavaFail60().probe(b); //6

        System.out.println(ccoking());
    }
}
