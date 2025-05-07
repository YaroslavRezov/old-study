import java.io.IOException;
public class JavaFail120 {
    public static void main(String[] args){
        try{
            doTest();
        }
        catch(IOException me){
            System.out.println(me);
        }
    }

    static void doTest() throws IOException{
        int[] array = new int[10];
        array[10] = 1000;
        doAnotherTest();
    }

    static void doAnotherTest() throws IOException{
        throw new IOException("Exception from doAnotherTest");
    }
}
