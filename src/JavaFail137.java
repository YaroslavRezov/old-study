public class JavaFail137 {
    int x;
    public static void main(String[] args) {
        int counter = 0;
        outer:
        for (int i = 0; i < 3; i++) {
            middle:
            for (int j = 0; j < 3; j++) {
                inner:
                for (int k = 0; k < 3; k++) {
                    if (k - j > 0) {
                        break middle;
                    }
                    counter++;
                    System.out.println("k" + k);
                }
                System.out.println("j" + j);
            }
            System.out.println("" + i);
        }
//        this.x;
    }
}
