import java.util.Objects;

public class TestAsh {
    public TestAsh(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestAsh testAsh = (TestAsh) o;
        return name.equals(testAsh.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    String name;
    public static void main(String[] args) {

    }
}
