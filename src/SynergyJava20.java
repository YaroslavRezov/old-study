import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class SynergyJava20 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\arezov\\Desktop\\synerg\\Аларитмизация\\bruh.txt"));
            String textInString = reader.readLine();
            LinkedList<Integer> Lastscobka = new LinkedList<>();
            LinkedList<Character> text = new LinkedList<>();

            for (int i = 0; i < textInString.length(); i++) {
                text.add(textInString.charAt(i));

            }

            for (int i = 0; i < text.size(); i++) {
                if (text.get(i) == ')') {
                    Lastscobka.addFirst(i);
                }
            }

            for (Integer position : Lastscobka) {
                System.out.println(position);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

