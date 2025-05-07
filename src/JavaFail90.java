public class JavaFail90 {
    public static void methodX() throws Exception {
        throw new AssertionError();
    }

    public static void main(String[] args) {
//        try{
//            methodX();
//        }
//        catch(Error | Exception e) {
//            System.out.println("EXCEPTION");
//        }
        System.out.println(parseFloat("0.0"));

    }
    public static float parseFloat( String s ){
        float f = 0.0f;
        try{
            f = Float.valueOf( s ).floatValue();
            return f ;
        }
        catch(NumberFormatException nfe){
            f = Float.NaN ;
            return f;
        }
    }
}
