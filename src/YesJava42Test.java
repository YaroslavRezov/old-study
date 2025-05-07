public class YesJava42Test {
    public static void main(String[] args) throws Exception {
        YesJava42Super d1 = new YesJava42Super(10);
        d1.strVal = "D1";
        YesJava42Super d2 = d1;
        d2.intVal = 20;
        System.out.println("d2 val = "+d2.strVal);
    }
}
