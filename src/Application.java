public class Application {
    public static void main(String[] args) {
        Bulldog bulldog = new Bulldog();
        bulldog.age = 40;
        bulldog.breed = "bulldog";
        bulldog.name = "Gay";
        bulldog.bark();


        Dog dog = new Dog();
        dog.age = 33;
        dog.breed = "ddd";
        dog.name = "tom";

        Dog dog1 = new Dog(33, "ddd", "tom1");
        Dog dog2 = new Dog("tom2");

        System.out.println(dog2.name);

    }
}
