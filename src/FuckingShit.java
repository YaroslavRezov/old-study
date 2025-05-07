import java.util.ArrayList;
import java.util.Collections;

public class FuckingShit {

    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        FuckingShit fuckingShit = new FuckingShit();
        // namesList.add("Sasha");
        // namesList.add("Pasha");
        // namesList.add("I");
        // for(int x = 0; x > namesList.size(); x++) {
        //      String nameMass = namesList.get(x);
        fuckingShit.getNames(namesList);
        Collections.sort(namesList);
        System.out.println(namesList);



    }

    public void getNames (ArrayList<String> namesList) {
        ArrayList<String> namesList1 = new ArrayList<>();
        namesList1.add("Sasha");
        namesList1.add("Pasha");
        namesList1.add("I");
        for (int x = 0; x < namesList1.size(); x++) {
            String nameMass = namesList1.get(x);
            namesList.add(nameMass);
        }
    }

        // void getNames() {
        //     try {
        //         File myFile = new File("SoDText.txt");
        //         FileReader fileReader = new FileReader(myFile);
        //         BufferedReader reader = new BufferedReader(fileReader);
        //         String line = null;
        //         while ((line = reader.readLine()) != null) {
        //             addName(line);
        //         }
        //         reader.close();
        //     } catch (Exception ex) {
        //         System.out.println("daun");
        //     }
        // }
        // void addName(String lineToParse) {
        //     String[] token = lineToParse.split()
        // }
    }