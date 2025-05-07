public class LastJava43 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("bruh");
        sb.ensureCapacity(100);
        System.out.println(sb.length());
    }
}
