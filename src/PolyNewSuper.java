public abstract class PolyNewSuper {
    public void doing() {
        System.out.println("doing super");
    }

    public static void main(String[] args) {
        PolyNewSuper polyNewSuper = new PolyNewSub();
        polyNewSuper.doing();
    }
}
