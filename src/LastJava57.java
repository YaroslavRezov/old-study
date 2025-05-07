public class LastJava57 {
    public static void main(String[] args) {
        int a = 65;
        int b = 15;
        int n = 0;
        while (a != 0 & b != 0) {
            if (a > b){
                a = a % b;
            n += 1;
            }
            else
            b = b % a;
        }
        System.out.println(a + b +" " + a * b);
    }
}
