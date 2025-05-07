public class YesJava37 {
    void m1(){
        YesJava37.m2();  // 1
        m4();             // 2
//        YesJava37.m3();  // 3
    }

    static void m2(){ }  // 4

    void m3(){
        m1();            // 5
        m2();            // 6
//        YesJava37.m1(); // 7
    }

    static void m4(){ }
}
