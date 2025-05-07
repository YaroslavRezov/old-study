import rope.*;
import rope.TiltRope;
public class UltaTiltRope {
    private static TiltRope rope1 = new TiltRope();
    private static TiltRope rope2 = new TiltRope();
    {
        System.out.println(rope1.lenght);
    }

    public static void main(String[] args) {
        rope1.lenght = 2;
        rope2.lenght = 8;
        System.out.println(rope1.lenght);
    }
}
