import java.util.Iterator;

public class JavaFail72 {
    public static void main(String[] args) {
        Iterator iterator = new Iterator() {

            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
        int[] cock = new int[10];
//        char[][] cA = {  { 'a', 'b', 'c' },  { 'a', 'b', 'c' }   };
        char cA[][] = new char[3][];
        for (int i=0; i<cA.length; i++) cA[i] = new char[4];
    }
}
