public class YesJava40Sub extends YesJava40Super {
    int j;
    public  YesJava40Sub(int x, int y) {
        super(x);  this.j = y;
    }
    public YesJava40Sub(int y) {
        super(y*2 ); j = y;
    }
//    public YesJava40Sub(int z ) {
//        this(z, z);
//    }

}
