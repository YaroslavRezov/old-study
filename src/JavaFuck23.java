public class JavaFuck23 {
    public void method(Object o){
        System.out.println("Object Version");
    }



    public void method(RuntimeException s){
        System.out.println("IOException Version");
    }
    public static void main(String args[]){
        JavaFuck23 tc = new JavaFuck23();
        tc.method(null);
        boolean flag = true;
        if (flag)   //1
            if (flag)   //2
                if (flag)   //3
                    System.out.println("False True");
                else        //4
                    System.out.println("True False");
            else        //5
                System.out.println("True True");
        else        //6
            System.out.println("False False");
        JavaFuck11 javaFuck11 = new JavaFuck11();
        System.out.println(javaFuck11 instanceof JavaFail130Inter);
    }
}
