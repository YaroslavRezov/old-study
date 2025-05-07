public class JavaFail59 {
    public static void main(String[] args) {
        byte starting = 3;
        short firstValue = 5;
        int secondValue = 7;
        int functionValue =
                (int) (starting/2 + firstValue/2 + (int) firstValue/3 ) + secondValue/2;
        System.out.println(functionValue);
        int i =3;
//        i = (int) 0.9;
        System.out.println(i);
        i = 5/2;
        System.out.println(i);
    }
}
