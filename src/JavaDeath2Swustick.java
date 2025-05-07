import java.util.Objects;

public class JavaDeath2Swustick extends JavaDeath2War {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaDeath2Swustick that = (JavaDeath2Swustick) o;
        return cuz.equals(that.cuz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cuz);
    }
    public boolean realEquals(JavaDeath2War o) {
        return cuz == "Values" ? true : false;

    }
}
