public class LastJava10Imp implements LastJava10{
    int type = 10;
    @Override
    public void jump() {
        System.out.println("bruh" + type);
    }

    public static void main(String[] args) {
        LastJava10 lastJava10 = new LastJava10Imp();
        lastJava10.jump();
    }
}
