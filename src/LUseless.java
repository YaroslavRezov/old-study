import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LUseless {
    public static void main(String[] args) {
        LUseless lUseless = new LUseless();
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
//        int s =
//        Stream<String> stringStream =
        List<String> collect = list.stream()
                .filter(lUseless.filterNeChet())
                .map(intNum -> intNum + 2)
                .map(lUseless.intToString())
                .collect(Collectors.toList());

//                .reduce((currentInt, nextInt) -> currentInt + nextInt)
//                .get()
//                .forEach(stringNumber -> System.out.println(stringNumber));
//        System.out.println(s);


    }

    public Function<Integer, String> intToString(){
        return integerNumber -> {
            int i = integerNumber + 2;
            return Integer.toString(i);
        };
    }
    public Predicate<Integer> filterNeChet() {
        return integerNumber -> (integerNumber % 2) > 0;
    }

}
