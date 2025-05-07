public class JavaFuck28 implements  JavaFuck28Inter2{
    @Override
    public String getId() {
        return null;
    }

    public static void main(String[] args) {
        JavaFuck28Inter2 javaFuck28Inter2 = new JavaFuck28Inter2() {
            @Override
            public String getId() {
                return null;
            }
        };
        System.out.println(javaFuck28Inter2.getId());
    }
}
