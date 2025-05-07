import java.util.ArrayList;
import java.util.List;

public class JavaFuck35 {
    public static void main(String[] args) {
        int i = 5;
        float f = 5.0f;
        double d = 3.8;
        char c = 'a';
        if (i == f) c++;
//        for(int i : args)
        List s1 = new ArrayList( );
        s1.add("a");
        s1.add("b");
        s1.add(1, "c");
        System.out.println(s1);

        int amount = 100, seed = 6;
        switch(7){
            case 3: amount = amount * 2;
            case 7: amount = amount * 2;
            case 6: amount = amount / amount;
            default :
        }
        System.out.println(amount);

    }
}
