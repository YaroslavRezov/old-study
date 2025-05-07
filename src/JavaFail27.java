import java.io.IOException;

public class JavaFail27 {
    public static void main(String[] args) throws IOException {
        try{
            amethod();
            System.out.println("try ");
        }
        catch(Exception e){
            System.out.print("catch ");
        }
        finally   {
            System.out.print("finally ");
        }
        System.out.print("out ");
    }
    public static void amethod(){ }
}
