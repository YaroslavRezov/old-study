public class LastJava51 {
    public static void main(String[] args) {
        try{
            bruh();
            System.out.println("try ");
        }
        catch(RuntimeException e){
            System.out.print("catch ");
        }
        finally   {
            System.out.print("finally ");
        }
        System.out.print("out ");
    }
    public static void bruh()throws RuntimeException{
        throw new RuntimeException();
    }
}
