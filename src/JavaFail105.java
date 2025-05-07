public class JavaFail105 {
    public static void main(String[] args) {
        String[][][] arr  ={  {   { "a", "b" , "c"}, { "d", "e", null } },
                { {"x"}, null },   {{"y"}},   { { "z","p"}, {} }
        };
        System.out.println(arr[0][1][2]);
        String[ ] ar = new String[2];
        System.out.println(ar[1]);
        int[][] a = new int[2][];
        a[0] = new int[2];
        a[1] = new int[4];
        a[0][0] = 1;
        a[0][1] = 2;
        a[1][0] = 3;
        a[1][1] = 4;
        a[1][2] = 5;
        a[1][3] = 6;
    }
}
