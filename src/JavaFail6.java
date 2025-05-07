public class JavaFail6 {
     int shheit = 5;

    public JavaFail6(int shheit) {
        this.shheit = 10;

    }

    public static void main(String[] args) {

//        int sum = 0;
//        for (int i = 0, j = 1; sum < 10; ++i)      // 1
//        {
//            sum = sum + i;
//            System.out.println(i);
//            System.out.println(sum);
//            System.out.println("---------------");
//        }
        JavaFail6 javaFail6 = new JavaFail6(10);
        System.out.println(javaFail6.shheit);
        String s = "cock";
        System.out.println(s.substring(0, 4));
        javaFail6.factorial(1000);
//        javaFail6.printMe(null);
//        javaFail6.m2();

    }
    int factorial(int n){
        if(n==1) return 1;
        else return n*factorial(n-1);
    }
    void printMe(Object[] oa){
        for(int i=0; i<=oa.length; i++)
            System.out.println(oa[i]);
    }
//    Object m1(){
//        return new Object();
//    }
//    void m2(){
//        String s = (String) m1();
//    }
}
