public class JavaFuck17 {
    public static void main(String args[]) throws Exception {
        for(int i = 0; i< args.length; i++){
            System.out.print("  "+args[i]);
        }
        doshit();

    }
    public static void doshit() throws Exception  {
        try {
            throw new Exception("Index of k is "); // 1
        } catch (Exception e) {
            System.out.println();

        }
    }
}
