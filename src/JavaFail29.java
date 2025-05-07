import java.io.IOException;

public class JavaFail29 {
    public void doA(int k) throws Exception {  // 0
        for(int i=0; i< 10; i++) {
            if(i == k) throw new Exception("Index of k is "+i); // 1
        }
    }
    public void doB(boolean f) throws Exception { // 2
        if(f) {
            doA(15); // 3
        }
        else return;
    }
    public void doShit() throws IOException {
        throw new IOException();
    }
    public static void main(String[] args)  { // 4
        JavaFail29 javaFail29 = new JavaFail29();
        try {
            javaFail29.doB(args.length>0);
        } catch ( Exception e){
            System.out.println("fuck");
        }
        finally {
            System.out.println("ALL FINE");
        }

//        javaFail29.doShit();
    }
}
