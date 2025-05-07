import java.util.ArrayList;

public class SynergyJavaArchive {
    public static void main(String[] args) {
        SynergyJavaBook book1 = new SynergyJavaBook("Пушкин", "Я вас любил", "1829", "Город Н", 100);
        SynergyJavaBook book2 = new SynergyJavaBook("Не пушкин", "Я вас не любил", "2981", "Город Ж", 100000);
        SynergyJavaBook book3 = new SynergyJavaBook("Попов", "Учитель", "1711", "Москва", 1);
        ArrayList<SynergyJavaBook> archive = new ArrayList<>();
        archive.add(book1);
        archive.add(book2);
        archive.add(book3);
        for( int i= 0; i< archive.size(); i++) {
            archive.get(i).getEverything();
        }

    }
}
