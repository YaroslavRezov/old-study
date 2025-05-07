import java.util.ArrayList;

public class LastJava47 {
    public static void main(String[] args) {
        LastJava47 lastJava47 = new LastJava47();
        System.out.println(lastJava47.isValid("(){}{{}}"));
    }
    public boolean isValid(String s){
        ArrayList<String> s1 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            s1.add(String.valueOf(s.charAt(i)));
        }
        boolean result = false;
        String bruh;
        label:
        while(!s1.isEmpty()) {
            if(s1.size()>1) {
                bruh = s1.get(0) + s1.get(1);
            }else{
                bruh= s1.get(0);
            }
            switch (bruh) {
                case "()":
                    result = true;
                    break;
                case "[]":
                    result = true;
                    break;
                case "{}":
                    result = true;
                    break;
                default:
                    result = false;
                    break label;
            }
            s1.remove(0);
            s1.remove(0);
        }

        return result;
    }
}
