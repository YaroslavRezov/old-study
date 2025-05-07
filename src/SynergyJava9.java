import java.util.Scanner;

public class SynergyJava9 {
    static String s;
    static char[] ss;
    static int count;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        ss = new char[s.length()];

        for (int i = 0; i<s.length(); i++) {
            ss[i] = s.charAt(i);
        }

        for (int i = 0; i<ss.length; i++) {
            if (ss.length > 0 & ss[i] == ' ' ) {
                count++;
            }
        }
        if (ss.length > 0) {
            count++;
        }
        System.out.println(count);
        System.out.println(ss);
    }
}
