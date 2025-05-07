public class JavaFuck57 {
    static void probe(Long x) { System.out.println("In LONG"); } //4
    public static void main(String[] args) {
        Integer i = 1000;
        Integer j = i;
        System.out.println(i + " " + j);
        i--;
        System.out.println(i + " " + j);
        i++;
        System.out.println(i + " " + j);
        System.out.println((i==j));
        int innerCounter = 0;
        while (innerCounter < 3) {
            System.out.println( innerCounter);
            innerCounter++;
        }
        char c = 'a';
        c++;
        System.out.println(c);
        switch (i){

        }
        String[] arr = new String[2];
        String s = "cock" + 1;
        System.out.println(s);

    }
}
