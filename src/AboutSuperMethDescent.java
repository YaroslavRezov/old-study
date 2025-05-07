public class AboutSuperMethDescent extends AboutSuperMeth{
    public AboutSuperMethDescent(int age) {
        super(age, " cocker");
        super.age = age;
    }
    public AboutSuperMethDescent(){
     super(2);

    }

    public static void main(String[] args) {
        AboutSuperMethDescent aboutSuperMethDescent = new AboutSuperMethDescent(1);
        System.out.println(aboutSuperMethDescent.age + aboutSuperMethDescent.name);

    }
    private void cocker(int i) { // yo access can be changed lol overload lol

    }
}
