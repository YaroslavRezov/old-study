public class JavaFail4 {
    public static void main(String[] args) {
        boolean x = false;
        boolean y = true;
        if (x^y) {
            System.out.println("fuck");
        }
        if (x||y) {
            System.out.println("fuck");
        }


    }
}
