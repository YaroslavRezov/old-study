public class NoJavaTilt1 {
    public static void main(String[] args) throws Exception{
        int i = 1, j = 10;
        do {
            if (i++ > --j) continue;
        } while (i < 5);
        System.out.println("i=" + i + " j=" + j);
    }
}
