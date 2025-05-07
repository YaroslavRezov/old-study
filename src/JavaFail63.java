public class JavaFail63 {
    int i;
    public static void main(String args[]){
        String[][][] arr  ={  {   { "a", "b" , "c"}, { "d", "e", null } },
                { {"x"}, null },   {{"y"}},   { { "z","p"}, {} }
        };
        System.out.println(arr[0][1][2]);
        int i = 5;
    }
    public void cockd() {
        int i = 5;
    }
}
