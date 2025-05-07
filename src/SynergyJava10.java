import java.util.Scanner;

public class SynergyJava10 {
    static String s;
    static char[] ss;
    static int count;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        ss = new char[s.length()];
        for (int i = 0; i<s.length(); i++) {
            ss[i] = s.charAt(ss.length-1-i);
        }
        System.out.println(ss);
    }
}
