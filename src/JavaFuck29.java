import java.io.IOException;
import java.sql.SQLException;

public class JavaFuck29 {
    public static void main(String[] args) throws Exception {
        try{
            throw new Exception();
        }
        catch (IOException e){
            System.out.println("ss");
            throw new SQLException();
        }
        catch(SQLException e){
            System.out.println("Sss");
            throw new InstantiationException();
        }
        finally{
            System.out.println("sssss");
             // this is not a RuntimeException.
        }
    }
}
