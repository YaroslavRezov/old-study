public abstract class Human extends Legend{
    @Override
    public void kill() {
        System.out.println(super.getClassName() + " lol");

    }
    @Override
    public void loot() {
        System.out.println(super.getClassName() + " mayee");

    }
}
