public class JavaFuck9 {
    public int available = 0;
    public int getAvailable(){
        return available;
    }
    public JavaFuck9(int quota){
        this.available = quota;
    }
    public void addMore(int more){
        available += more;
    }

    public static void main(String[] args) {
        JavaFuck9 javaFuck9 = new JavaFuck9(100);
        javaFuck9.available = 0;
        System.out.println(javaFuck9.getAvailable());
        double d = 1;
        float f = 1.0f;

    }
}
