public class Gun {
    private Pistol pistol;
    private Rifle rifle;
    private Nade nade;

    public Pistol getPistol() {
        return pistol;
    }

    public void setPistol(Pistol pistol) {
        this.pistol = pistol;
    }

    public Rifle getRifle() {
        return rifle;
    }

    public void setRifle(Rifle rifle) {
        this.rifle = rifle;
    }

    public Nade getNade() {
        return nade;
    }

    public void setNade(Nade nade) {
        this.nade = nade;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "pistol=" + pistol +
                ", rifle=" + rifle +
                ", nade=" + nade +
                '}';
    }
}
