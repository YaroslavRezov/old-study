public class Dog {
    int age;
    String breed;
    String name;

    public Dog() {
    }

    public Dog(int age, String breed, String name) {
        this(name);
        this.age = age;
        this.breed = breed;
    }

    public Dog(String n) {
        name = n;
    }

    void bark() {
        System.out.println("Я пёс");
    }
}
