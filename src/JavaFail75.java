public class JavaFail75 {
    public static Integer wiggler(Integer x){
        Integer y = x + 10;
        x++;
        System.out.println(x);
        return y;
    }

    public static void main(String[] args){
        Integer dataWrapper = new Integer(5);
        Integer value = wiggler(dataWrapper);
        System.out.println(dataWrapper+value);
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        String s = "5";
        s += 1;
        System.out.println(s);
    }
}
