

import java.io.*;
public class SynergyJava15 implements Runnable {

    @Override
    public void run() {
        String line = null;

        PipedOutputStream pOut = new PipedOutputStream();
        System.setOut(new PrintStream(pOut));
        PipedInputStream pIn = null;
        try {
            pIn = new PipedInputStream(pOut);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(pIn));
        while (true){
            try {
                line = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
