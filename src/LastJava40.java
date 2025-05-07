public class LastJava40 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        
    }
    public static boolean isPalindrome(int x) {
        long i = 121;
        long checking;
        StringBuffer sb = new StringBuffer(String.valueOf(i));
        sb.reverse();
        if(sb.charAt(sb.length()-1)!='-'){
             checking = Long.parseLong(sb.toString());
        } else {
            return false;
        }
        boolean b = checking == i;
        System.out.println(b);
        return b;


    }

}
