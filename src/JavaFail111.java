public class JavaFail111 {
    public static void main(String args[]){
        if (true)
            if (false)
                System.out.println("True False");
            else
                System.out.println("True True");
    }
}
