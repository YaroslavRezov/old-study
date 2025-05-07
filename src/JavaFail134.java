public class JavaFail134 {
    public static void main(String args[]) throws Exception {
        try{
            m1();
        }catch(Exception e){
            throw e;
        }finally{
            System.out.println("Done");
        }
    }
    public static void m1() throws Exception{
        throw new Exception();
    }
}
