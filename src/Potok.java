import java.io.*;

public class Potok {
    public static void main(String[] args) throws InterruptedException {
        Potok potok = new Potok();
        File myFile = new File("SoDText.txt");
        potok.task2(myFile);

    }

    public  void task2(File myFile) throws InterruptedException {
        Potok1 potok1 = new Potok1();
        potok1.setFile(myFile);
        Thread cock = new Thread(potok1);
        System.out.println("Принят файл");
        cock.start();
        System.out.println("start печити файла");
        }
    }


class Potok1 implements Runnable {
    private File myFile;
     public void setFile(File myFile) {
         this.myFile = myFile;
     }
    public File getFile() {
        return myFile;
    }
//    public Potok1(File myFile) {
//        this.myFile = myFile;
//    }
    @Override
    public void run() {
        Potok1 potok1 = new Potok1();
        potok1.setFile(myFile);
        try {
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception ex) {
            System.out.println("error" + ex.getLocalizedMessage());
        }
    }

}
