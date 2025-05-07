public class YesJava24 {
    private int j;
    public static void main(String[] args) {
        YesJava24 yesJava24 = new YesJava24();
        yesJava24.showJ();
    }
    void showJ() {
        while(j <= 5) {
            for (int j = 1 ; j <= 5;){
                System.out.print(j + " ");
                j++;

            }
            System.out.println("line: " + j );
            j++;
        }
    }
}
