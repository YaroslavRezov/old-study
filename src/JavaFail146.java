public class JavaFail146 {
       static String url = "jdbc://derby://localhost:1527//mydb";
        static JavaFail146 getDatabase() {
           System.out.println("Getting DB");
           return null;
       }
       public static void main(String[ ] args)
       {


           System.out.println( getDatabase().url );
//           String s = "shit";
//           int d = 5;
//           for(int i=0; i<4; i++){
//               d = d + i;
//           }
//           System.out.println(d);
//
//           System.out.println(s.charAt('a'));
       }
}
