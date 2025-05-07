public class JavaFuck50 {
    static int si = 10;
    public static void main (String args[]){
        new JavaFuck50();
    }
    public JavaFuck50(){
        System.out.println(this);
    }
    public String toString(){
        return "TestClass.si = "+this.si;
    }
}
