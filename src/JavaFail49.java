public class JavaFail49 {
     static int x;
    public static void main(String[] args) {
//        this.x
        int i =5;
        switch (i) {
            default:
            case 1:
                System.out.println(1);
                break;
            case 0:
                System.out.println(0);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
        }

    }
}
