public class JavaFail95 {
    public static void main(String[] args){
        short s = 10;   // 1
        char c = (char) s;     // 2
        s = (short) c;
        System.out.println(s + "sdd");
        System.out.println(c + "ee");// 3
    }
}
