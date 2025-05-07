public class SynergyInfo {
    public static void main(String[] args) {
        String s ="";
        for (int i= 0; i < 101; i++) {
            s = s + "1";
        }

        String ss ="";
        while(s.substring(0).equals("111")) {
            if (s.substring(0).equals("2")) {
            ss = s.replaceFirst("222", "1");
            } else {ss = s.replaceFirst("11", "2");
            }


        }
        System.out.println(ss);


    }
}
