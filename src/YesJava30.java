public class YesJava30 {
    long l1;
    public void YesJava30(long pLong) { l1 = pLong ; }  //(1)
    public static void main(String args[]){
        YesJava30 a, b ;
        a = new YesJava30();  //(2)
//        b = new YesJava30(5);  //(3)
    }
}
