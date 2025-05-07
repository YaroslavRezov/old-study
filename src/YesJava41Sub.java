public class YesJava41Sub extends YesJava41Super {
    int i = 4;
    public static void main(String[] args){
        YesJava41Super yesJava41Super = new YesJava41Sub();
        yesJava41Super.print();
    }
    void print() {
        System.out.print(i+" ");
    }
}

