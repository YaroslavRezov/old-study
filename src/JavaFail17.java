public class JavaFail17 {
    public static void main(String[] args) {
        int k = 1;
        k = (k = 4) * (k + 2);
        System.out.println(k);
        String kk = "Java";
        String s = kk.concat("c");
        System.out.println(kk.replace("J", "L"));
        System.out.println(kk);

    }

}
