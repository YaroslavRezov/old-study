public class JavaFail28Sub extends  JavaFail28Super{
    int i, j, k;
    public JavaFail28Sub( int m, int n )     {
        i = m ;  j = m ;  } //1
    public JavaFail28Sub( int m )  {   super(m );   } //2


    public static void main(String[] args) {
        int f = 6 % 3;
        System.out.println(f);
        try {

        } finally {

        }
        boolean gg = args.length == 0;
        System.out.println(gg);
    }
}
