import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SynergyJava21 {
    public static void main(String[] args) {
        SynergyStudent[][] studentsArray = new SynergyStudent[10][]; // Создаем двумерный динамический массив для хранения данных о студентах

        try {
            File file = new File("C:\\Users\\arezov\\Desktop\\synerg\\Аларитмизация\\ИнфаОстудентах.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                int groupNumber = Integer.parseInt(line.substring(5, 6));

                if (studentsArray[groupNumber] == null) {
                    studentsArray[groupNumber] = new SynergyStudent[10];
                }

                for (int i = 0; i < studentsArray[groupNumber].length; i++) {
                    if (studentsArray[groupNumber][i] == null) {
                        studentsArray[groupNumber][i] = new SynergyStudent(line);
                        break;
                    }
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        for (int i = 0; i < studentsArray.length; i++) {
//            for (int j = 0; j < studentsArray[i].length; j++) {
//                System.out.print(studentsArray[i][j].getName());
//            }
//            System.out.println();
//        }
//        System.out.println(studentsArray[0][0].getName());

    }

}
