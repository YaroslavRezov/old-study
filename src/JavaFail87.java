

public class JavaFail87 {
    public void stringProcessor(String... strs){
        System.out.println(strs[0]);
    }

    public static void main(String[] args) {
        JavaFail87 javaFail87 = new JavaFail87();
        String s = "cock";
        String w = "dick";
        String t = "penis";
        String[] ssw = new String[10];
        javaFail87.stringProcessor(w);

//        vargs for evrey tyoe but only one type so like String alone or array of strings

    }

}
