import java.util.ArrayList;
import java.util.List;

public class JavaFuck51 {
    public static void main(String[] args) {
        List s1 = new ArrayList( );
        s1.add("a");
        s1.add("b");
        s1.add("c");
        s1.add("a");
        if(s1.remove("a")){
            if(true){
                s1.remove("b");
            }else{
                s1.remove("c");
            }
        }
        System.out.println(s1);
        int k = 9, s = 5;
        switch(k){
            default :
                if( k == 10) { s = s*2; }
                else{
                    s = s+4;
                    break;
                }
            case 7 :
                System.out.println("7 ccc" );
                s = s+3;
        }
        System.out.println(s);
        if (args[0].equals("open"))
            if (args[1].equals("someone"))
                System.out.println("Hello!");
            else System.out.println("Go away "+ args[1]);

    }
}
