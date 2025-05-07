import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaFuck11  {
    private static List<Object> list = new ArrayList<>();


    public static void main(String[] args) {
        list.add("dick");
        list.add("cock");
        list.add("pussy");
        list = list.stream().
                filter(str -> ((String) str).length() < 5)
                .map(str -> ((String)str).length())
                .collect(Collectors.toList());
//        List<Integer> list1 =
//        list.stream()
//                .map(String::length)
//                    .filter(length -> length < 5 )
//                        .collect(Collectors.toList());
        System.out.println(list);
    }

}
