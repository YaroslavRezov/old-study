public class JavaFail74 {
    public static void main(String[] args) {
        String s = "1234567";
        StringBuilder sb;
        sb = new StringBuilder(s.substring(0, 1));
        System.out.println(sb);
    }
}
