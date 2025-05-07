import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LastJava42 {
    int i = 0 ;
    Object prevObject ;
    public static void main(String[] args) {
        LastJava42 lastJava42 = new LastJava42();
        Collection c = new ArrayList();

        lastJava42.saveObject((List) c);
    }
    public  void saveObject(List e ){
        prevObject = e ;
        i++ ;
    }
}
