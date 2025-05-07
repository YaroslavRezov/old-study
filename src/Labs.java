import java.util.ArrayList;
    public class Labs {

        public static void main(String[] args) {
            String string = "113kg3b";
            char number = '3';
            Labs labs = new Labs();
            int cock = labs.cum(string, number);
            System.out.println(cock);
        }
        int cum(String string, char number) {

            int x = 0;
            for (int i = 0; i < string.length(); i++){
                char symbol = string.charAt(i);
                if (symbol == number) {
                    x++;
                }
            }

            return x;
    }
}

