public class JavaFuck8 {
    public static void main(String[] args){
        Integer i = Integer.parseInt(args[0]);
        Integer j = i;
        i--;
        i++;
        System.out.println((i==j));

    }
}
