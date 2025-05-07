import java.util.ArrayList;

public class LastJava45 {
    public static void main(String[] args) {
        String s = "(){}}";
        ArrayList<String> s1 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            s1.add(String.valueOf(s.charAt(i)));
        }
        boolean result = false;
//        StringBuffer stringBuffer = new StringBuffer(s);
//        System.out.println(stringBuffer.substring(0, 2));
//        while(s.length()!=0) {
//            if (s.length()>1 && s.substring(0, 2).equals("()")) {
//                result = true;
//            } else if (s.length()>1 && s.substring(0, 2).equals("{}")) {
//                result = true;
//            } else if (s.length()>1 && s.substring(0, 2).equals("[]")) {
//                result = true;
//            } else {
//                result = false;
//            }
//            s = s.substring(2, s.length());
//        }
//        System.out.println(result);
        String bruh;
        while(!s1.isEmpty()) {
            if(s1.size()>1) {
                bruh = s1.get(0) + s1.get(1);
            }else{
                bruh= s1.get(0);
            }
            if (bruh.equals("()")) {
                result = true;
            } else if (bruh.equals("[]")) {
                result = true;
            } else if (bruh.equals("{}")) {
                result = true;
            } else {
                result = false;
                break;
            }
            s1.remove(0);
            s1.remove(0);
        }
        System.out.println(s1);
        System.out.println(result);
    }
}


