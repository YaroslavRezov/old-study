public class JavaFail118 {
    public static void main(String[] args) {
        int c = 0;
        boolean flag = true;

        for(int i = 0; i < 3; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 100; i++){
            System.out.println(i);
        }
    }
}
