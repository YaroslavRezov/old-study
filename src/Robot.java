public abstract class Robot extends Legend{
    @Override
    public void kill() {
        System.out.println(super.getClassName() + " Die");

    }
    @Override
    public void loot() {
        System.out.println(super.getClassName() + " mine");

    }
}
