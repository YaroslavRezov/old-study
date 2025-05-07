public class JavaFail50 {
    public static void main(String args[]){
        int x  = 0;
        labelA:   for (int i=10; i>0; i--){
            int j = 0;
            labelB:
            while (j < 10){
                if (j > i) break labelB;
                if (i == j){
                    x++;
                    continue labelA;
                }
                j++;
                System.out.println(j);

            }
            x--;
            System.out.println();
            System.out.println(x);
        }
    }
}
