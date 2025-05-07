public class JavaFail16 {
    static int someInt = 10;
    public static void changeIt(int a){
        a = 20;
        System.out.println(a);
    }
    public static void main(String[] args){
        changeIt(someInt);
        System.out.println(someInt);
        System.out.println();
        try{
            if (args.length == 0) return;
            else throw new Exception("Some Exception");
        }
        catch(Exception e){
            System.out.println("Exception in Main");
        }
        finally{
            System.out.println("The end");
        }

    }

}
