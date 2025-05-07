
public abstract class Legend {

    private String legendaryStory;
    private String ult;
    private String q;
    private int dmResist;
    private int heath;
    private boolean man;
    private int dm;
    private Gun gun;
    private Inventar inventar;



    public Inventar getInventar() {
        return inventar;
    }

    public void setInventar(Inventar inventar) {
        this.inventar = inventar;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public int getDm() {
        return dm;
    }

    public void setDm(int dm) {
        this.dm = dm;
    }

    private final String className = this.getClass().getName();

    public String getClassName() {return className;
    }

    public String getLegendaryStory() {
        return legendaryStory;
    }

    public void setLegendaryStory(String legendaryStory) {
        this.legendaryStory = legendaryStory;
    }

    public String getUlt() {
        return ult;
    }

    public void setUlt(String ult) {
        this.ult = ult;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public int getDmResist() {
        return dmResist;
    }

    public void setDmResist(int dmResist) {
        this.dmResist = dmResist;
    }

    public int getHeath() {
        return heath;
    }

    public void setHeath(int heath) {
        this.heath = heath;
    }

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    @Override
    public String toString() {
        return className + "{" +
                "legendaryStory='" + legendaryStory + '\'' +
                ", ult='" + ult + '\'' +
                ", q='" + q + '\'' +
                ", dmResist=" + dmResist +
                ", heath=" + heath +
                ", gun=" + gun +
                ", inventar=" + inventar +
                '}';
    }
    public void smallHealUp(int healka) {
        int healing = getHeath() + healka;
        setHeath(healing);
    }

    public void actInLobby() {
        System.out.println(className +" stays");
    }
    public void quot() {
        System.out.println(className + " talks");
    }
    public void shoots() {
        System.out.println(className + " paw - paw");
    }
    public void shoots(String sound) {
        System.out.println(className + " " + sound);
    }
    public void jumps() {
        System.out.println(className + " pfp");
    }


    public abstract void kill();

    public abstract void loot();



}