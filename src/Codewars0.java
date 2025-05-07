public class Codewars0 {
    public static void main(String[] args) {
        greet("");
    }
    public static void greet(String hello){
        switch (hello) {
            case "Hello world":
                System.out.println("Hello world");
                break;

            case "HelloWorld":
                System.out.println("HelloWorld");
                break;

            case "Helloworld":
                System.out.println("Helloworld");
                break;

            case "helloworld":
                System.out.println("helloworld");
                break;
            case "hello world":
                System.out.println("hello world");
                break;
            default:
                System.out.println("Hello world");
        }
    }
}
