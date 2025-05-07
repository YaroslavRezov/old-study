import java.util.Arrays;

public class LastJava26 {
    int k = 5;
    String[] ss = {" ", ""};
    public static void main(String[] args) {
        LastJava26 javaLast26 = new LastJava26();
        javaLast26.checkIt(javaLast26.ss);
        System.out.println(Arrays.toString(javaLast26.ss));
    }
    public void checkIt(String[] gg){
        gg[0] ="some";
        gg[1] = "shit";

    }
}
