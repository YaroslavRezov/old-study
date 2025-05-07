public class TestChild extends TestSuper {

    public TestChild(int test2) {
        this.test1 = test2;
    }
    public static void main(String[] args) {
        TestChild testChild = new TestChild(1);
        TestSuper testSuper = new TestSuper();
        System.out.println(testChild.test1);
        System.out.println(testSuper.test1);
    }

}
