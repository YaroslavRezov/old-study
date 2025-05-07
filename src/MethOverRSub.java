public class MethOverRSub extends MethOverRSuper {
    String cock = "14";
    @Override
    public  boolean isCock() {
        return false;
    }
    public void showMeElse() {
        System.out.println("sub cock " + isCock());
    }

    public static void main(String[] args) {
        MethOverRSuper methOverRSub = new MethOverRSub();
        MethOverRSuper methOverRSuper = new MethOverRSuper();
        ((MethOverRSub) methOverRSub).showMeElse();
        methOverRSub.showMe();
        System.out.println(methOverRSub.cock + methOverRSuper.cock);
        System.out.println(methOverRSub.isCock());
        System.out.println(methOverRSuper.isCock());


    }
}
