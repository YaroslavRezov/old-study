public class YesJava26Donkey implements YesJava26Inter {
    int location = 200;
    public void move(int by) {
        location = location+by;
    }
    public void moveBack(int by) {
        location = location-by;
    }
}
