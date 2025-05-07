public class JavaFuck32 {
    public static Integer wiggler(Integer x){
        Integer y = x + 10;
        x++;

        return y;
    }

    public static void main(String[] args){
        Integer dataWrapper = new Integer(5);
        Integer value = wiggler(dataWrapper);
        System.out.println(dataWrapper+value);
        Object javaFuck31 = new JavaFuck31();
//        System.out.println(javaFuck31.i);
//        RuntimeException e = null;
//        throw e;
        char i;
       LOOP: for (i=0;i<5;){
            switch(i++){
                case '0': System.out.println("A");
                case 1: System.out.println("B"); break ;
                case 2: System.out.println("C"); break;
                case 3: System.out.println("D"); break;
                case 4: System.out.println("E");
                case 'E' : System.out.println("F");
            }
        }
    }
}
