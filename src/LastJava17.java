public class LastJava17 {
    public static void main(String[] args) {
        LastJava17 lastJava17 = new LastJava17();
        lastJava17.parseFloat("0.1");
    }
    public float parseFloat(String s){
        float f = 0.0f;
        try{
            f = Float.valueOf(s).floatValue();
            return f ;
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid input " + s);
            f = Float.NaN ;
            return f;
        }
        finally { System.out.println("finally");
        }

    }
}
