public class JavaFail51 {
    public int radiusA, radiusB;
    public int sum = 100;

    public void setRadius(int r){
        if(r>99) throw new IllegalArgumentException();
        radiusA = r;
        radiusB = sum - radiusA;
        System.out.println(radiusA);

    }

    public static void main(String[] args) {
        JavaFail51  javaFail51 = new JavaFail51();
//        javaFail51.setRadius(100);
        char c = 'a';
        c += 2;
        System.out.println(c);

    }
}
