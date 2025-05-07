public class PhaseOMatic {
    public static void main (String[] args) {
        String[] wordListOne = {"круглосуточный", "трех-звездный", "30000-фунтовый", "взаимный"};
        String[] wordListTwo = {"уполномоченый", "трудный", "чистный продукт", "херовый"};
        String[] wordListThree = {"cum", "dick", "ass", "anal", "cock", "pussy", "ahhhohhah"};
        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;
        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Всё, что нам нужно, - это " + phrase);
    }

}
