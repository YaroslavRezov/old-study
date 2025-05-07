public class JavaFuck53Sub2 {

    public static void main(String[] args) {
        JavaFuck53 a = new JavaFuck53();//1
        JavaFuck53Sub b = new JavaFuck53Sub();//2
        System.out.println(b.i);
        String[] x = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };
        String[] y1 = { "1", "2", "3", "4", "5" };
        String[] y2 = { "a", "b", "c" };
        String[][] table;
        table = new String[3][];
        table[0] = x;
        table[1] = y1;
        table[2] = y2;
        for(String[] row : table){
            System.out.print(row[row.length-1]);
        }
         int[] g = new int[0];

            g[0] = 10;
    }
}
