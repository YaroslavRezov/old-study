public class LastJava25 {
    public static int m1(int i){
        return ++i;
    }

    public static void main(String[] args) {

        int k = m1(args.length);
        k += 3 + ++k;
        System.out.println(k);
        System.out.println(max(1,2));
    }
    static int max(int x, int y){
        if (x ==y)  return x;
        return y;
    }
}
