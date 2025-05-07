public class AboutSuperMeth {
    int age;
    String name;
    public AboutSuperMeth(int age, String name) {
        this(age);
        this.name = name;
    }
    public AboutSuperMeth(int age) {
        super();
        this.age = age;
        this.name = " No name (the guy is unwanted, probably haha)";
    }
    public AboutSuperMeth() {

    }

    public static void main(String[] args) {
        AboutSuperMeth aboutSuperMeth = new AboutSuperMeth();
        AboutSuperMethDescent aboutSuperMethDescent = new AboutSuperMethDescent(1);

        System.out.println(aboutSuperMeth.age);
    }
    public void cocker() {
        System.out.println("shit"); // yo access can be changed lol overload lol
    }

}
