public class BeerSong {

    public static void main (String[] args) {
        int beerNum = 99;
        String word = "Бутылок (Бутылки)";

        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "бутылка";
            }
            System.out.println(beerNum + "" + word + " молока на стене");
            System.out.println(beerNum + "" + word + " молока ");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                System.out.println(beerNum + "" + word + " молока на стене");
            } else {
                System.out.println("Нет бутылок молока на стене");
            }
        }
    }
}
