import java.util.ArrayList;

public class JavaFail5 {
    static int cocjk;
    int dickk = 4;
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
//        for (String x : arrayList) {
//            System.out.println(x);
//
//        }
        System.out.println(cocjk);
        System.out.println(arrayList.indexOf("4"));
        System.out.println(arrayList.contains(1.0));
        for (int i = 0; arrayList.size() > i; i++) {
            if (arrayList.get(i) == "2"){
                continue;
            }
            System.out.println(arrayList.get(i));
        }
        String k = "kock";
        System.out.println(k.charAt(0));
        ArrayList<Double> al = new ArrayList<>();
        System.out.println(al.indexOf(1));
        TestAsh ash = new TestAsh("Ash");
        TestAsh ash1 = new TestAsh("Ash");
        System.out.println(ash.equals(ash1));




    }
    private int fuck(){
        return dickk;
    }
}
