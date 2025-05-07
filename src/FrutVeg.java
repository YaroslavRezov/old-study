import java.util.ArrayList;
import java.util.List;

public class FrutVeg {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>();
        food.add("orange");
        food.add("banana");
        food.add("strawberry");
        food.add("raspberry");
        food.add("pineapple");
        food.add("eggplant");
        food.add("dick");
        food.add("sweet bread");

        for (int x = 0; x < food.size(); x++) {
            String s = food.get(x);
            switch (s) {
                case "orange":
                    System.out.println("orange");
                    break;
                case "banana":
                    System.out.println("yellow");
                    break;
                case "strawberry":
                    System.out.println("red");
                    break;
                case "raspberry":
                    System.out.println("pink");
                    break;
                case "pineapple":
                    System.out.println("yellow-white");
                    break;
                case "eggplant":
                    System.out.println("purple");
                    break;
                default:
                    System.out.println("Idiot?");
            }
        }
    }

}
