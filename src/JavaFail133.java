public class JavaFail133 {
    public static void main(String[] args) {
        String[] dataList = {"x", "y", "z"};
        for (String dataElement : dataList) {
            int innerCounter = 0;
            while (dataList.length > innerCounter) {
                System.out.println(dataElement + ", " + innerCounter);
                innerCounter++;
            }

        }
    }
}
