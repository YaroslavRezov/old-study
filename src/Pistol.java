public class Pistol {
    private String name;
    private int clipSize;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClipSize() {
        return clipSize;
    }

    public void setClipSize(int clipSize) {
        this.clipSize = clipSize;
    }

    @Override
    public String toString() {
        return "Pistol{" +
                "name='" + name + '\'' +
                ", clipSize=" + clipSize +
                '}';
    }
}
