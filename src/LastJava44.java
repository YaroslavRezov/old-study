import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LastJava44 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        String num = "XXVII";
        int result = 0;
        ArrayList<Character> s1 = new ArrayList<>();
        for(int i = 0; i <num.length(); i++) {
            s1.add(num.charAt(i));
        }
        for(int i = 0; i<s1.size();i++){
            int nextNum = i++;
            if(nextNum<s1.size()-1 && s1.get(i) == s1.get(nextNum)){

            }
        }
        System.out.println(result);
        LastJava44 lastJava44 =new LastJava44();
        System.out.println(lastJava44.romanToInt("MCMXCIV"));


    }
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                res -= map.get(s.charAt(i));
            } else {
                res += map.get(s.charAt(i));
            }
        }
        return res;
    }

}
