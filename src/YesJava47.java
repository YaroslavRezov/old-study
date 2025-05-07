public class YesJava47 {
    public static void main(String[] args) {
        parseFloat("1");
    }
    public static float parseFloat(String s){
        float f;
        try{
            f = Float.valueOf(s).floatValue();
            System.out.println(f);
            return f ;

        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid input " + s);
            f = Float.NaN ;
            return f;
        }
        finally { System.out.println("finally");  }

    }
}
