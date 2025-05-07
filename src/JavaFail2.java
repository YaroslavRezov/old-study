import java.util.Arrays;

public class JavaFail2 {
    public static void main(String[] args) {
        Object[][] cock = new Object[][] {{155,434, 515,null},
                                    {null, 111, null, null},
                                    {666, 777, 111, 222}
        };
//        System.out.println(Arrays.deepToString(cock));
        for (int outer = 0; outer < cock.length; outer++) {
            System.out.println();
            for (int inner = 0; inner < cock[outer].length; inner++) {
                System.out.print(cock[outer][inner] + " ");
            }
        }
    }
}
