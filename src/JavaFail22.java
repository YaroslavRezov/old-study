public class JavaFail22 {
    public static void main(String[] args){
        dick : for(int i = 0; i< 10; i++){
            for (int j = 0; j< 10; j++){
                if ( i+ j > 10 )  break dick;
            }
            System.out.println( "hello");
        }
    }
}
