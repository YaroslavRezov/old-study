public class JavaFail14 {
    static double percent; //1
    int offset = 10, base= 50; //2
//    public static double calc(double value) {
//        int coupon, offset, base; //3
//        if(percent <10){ //4
//            coupon = 15;
//            offset = 20;
//            base = 10;
//        }
//        return coupon*offset*base*value/100; //5 inizlize before use in if
//    }
    public static void main(String[] args) {
        int i = 1;
        int j = i++;
        if( (i==++j) | (i++ == j) ){
            i+=j;
        }
        System.out.println(i);
//        System.out.println(calc(100));
    }

}
