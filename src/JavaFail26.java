import java.io.IOException;

public class JavaFail26 {
    public static void doSmth() throws IOException {
        throw new IOException();
    }

    public static void main(String[] args) throws IOException {
        doSmth();
    }
}
