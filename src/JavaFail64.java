public class JavaFail64 {
     static String[] o = {"shit"};

    public static void main(String[] args) {
        cock(o);
        System.out.println(o[0]);
        Object t = new Integer(106);
        int k = ((Integer) t).intValue() / 10;
        System.out.println(k);
        int shit = 5;
        int poo = shit = 1;
        System.out.println(poo);
        System.out.println(shit);
        boolean flag = true;
        if(flag = false){
            System.out.println("1");
        }else if(flag){
            System.out.println("2");
        }else if(!flag){
            System.out.println("3");
        }else    System.out.println("4");
    }
    public static void cock(String[] i) {
        i[0] = "cock";
    }
    public static void calculate(int x){
        String val;
        switch(x){
            case 2:
            default:
                val = "def";
        }
        System.out.println(val);
    }

}
