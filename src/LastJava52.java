import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LastJava52 {
    public static void main(String[] args) {
        LastJava52Bruh[] dataArr = new LastJava52Bruh[]{ new LastJava52Bruh(), new LastJava52Bruh(),
                new LastJava52Bruh(), new LastJava52Bruh() };

        List<LastJava52Bruh> dataList = Arrays.asList(dataArr);
        dataList.add(new LastJava52Bruh());
    }
}
