import java.util.ArrayList;
import java.util.List;

public class PolySub extends PolySuper implements PolyInter {
    public boolean hasSkin() {
        return true;
    }
    public String gunName = "Rampage";
    int uf;

    @Override
    public boolean isGay() {
        return true;
    }
    public void lol() {
        System.out.println("lol");
    }

    public static void main(String[] args) {
        PolySub polySub = new PolySub();
        System.out.println(polySub.gunName);
        PolySuper polySuper1234 = new PolySub();
        System.out.println(polySuper1234.gunName + " ssdfewfwefewg");
        PolySub polySub13445678 = (PolySub) new PolySuper();






        PolyInter polyInter = polySub;
        System.out.println(polyInter.isGay());
        PolySuper polySuper = polySub;
        System.out.println(polySuper.hasSkin());
        polySuper.sheesh();
        System.out.println(polySuper.isGay());
//        System.out.println(polySuper.lol); shit
        polySub.sheesh();

//        PolySuper polySuper1 = ()polySub;
//        PolySub polySub1 = polySuper1;
//        PolySub polySub1 = (PolySub) polySuper1;
//        System.out.println(polySub1.gunName); // same as down one
//        System.out.println(polySub.gunName);

//        PolySuper polySuper2 = polySub; //from sub to super
        PolySub polySub2 = (PolySub) polySuper; //from super to sub cast required
        PolySuper polysuperq = null;
        PolySub polySub123 = null;
        polysuperq = (PolySub)polySub123;
//        В двух словах, полиморфизм означает,
//        что именно класс объекта - new Object()
//        (а не класс ссылочной переменной - Object o;, на которую указывает переменная)
//        определяет, какой метод будет вызываться во время выполнения. private and static arent inherit

//It will pass at compile time but fail at run time as the actual object referenced by b is not a B1.
//By casting b to (B1), you are telling the compiler that the object referred to by b will be of class B1 at runtime.
// The compiler accepts that because it is possible for b to refer to an object of class B1 since B1 is-a B.
// However, at run time, b is pointing to an object of class B.
// B is not B1, so the JVM will throw a ClassCastException.

//        PolySuper polySuper2 = new PolySuper();
//        PolySub polySub2 = (PolySub) polySuper2; trows exception  because Polysuper isnt polysub lol


    }
}
