public class NoJavaTilt6 {
    public static void main(String[] args) {
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd' };

        String newStr = null;
        for(char ch : myCharArr){
            newStr = newStr + ch;
        }
        String cock = "cock";
        String dick = "cock";

        System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));
        System.out.println(myStr);
        System.out.println(myCharArr);
        System.out.println(newStr);
        System.out.println(dick == cock);

    }
}
