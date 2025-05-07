public class JavaFail77 {
    public static void main(String[] args) {
        boolean greenLight = true;
        boolean pedestrian = false;
        boolean rightTurn = true;
        boolean otherLane = false;


        boolean b = rightTurn && !pedestrian || otherLane;
        System.out.println(b);

    }
}
