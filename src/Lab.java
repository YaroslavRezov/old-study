import java.util.ArrayList;

public class Lab {
    public static void main(String[] args) {

        String string = "qwerty1234590";
        Lab lab = new Lab();
        int gcfhki = lab.zabratSymbol(string);

        System.out.println(gcfhki);





    }

    int zabratSymbol(String m) {
        ArrayList<Character> nums = new ArrayList<>();
        nums.add('1');
        nums.add('2');
        nums.add('3');
        nums.add('4');
        nums.add('5');
        nums.add('6');
        nums.add('7');
        nums.add('8');
        nums.add('9');
        nums.add('0');
        int count = 0;

        for (int i = 0; i < m.length(); i++) {

            char symbol = m.charAt(i);

            if (nums.contains(symbol)) {
                count++;
            }
        }

        return count;
    }
}