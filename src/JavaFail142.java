public class JavaFail142 {
    public static void testInts(Integer obj, int var){
        obj = var++;
        ++obj;
        System.out.println(obj +" " + var);
    }
    public static void main(String[] args) {
        Integer val1 = new Integer(5);
        int val2 = 9;
        testInts(val1++, ++val2);
        System.out.println(val1+" "+val2);
    }
}
