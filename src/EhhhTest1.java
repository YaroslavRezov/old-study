public class EhhhTest1 {
    public static void main(String[] args) {

        try {
            hello();
        } catch (BullShitEeption bullShitEeption) {
            System.out.println((bullShitEeption));
        }
    }
    static void hello() throws BullShitEeption{
        int[] dear = new int[7];
        dear[0] = 766;
        foo();
    }
    static void foo() throws BullShitEeption {
        throw new BullShitEeption("ehh");
    }
}
