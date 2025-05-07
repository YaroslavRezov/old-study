public class Cats {
    String name;
    int age;
    Cats(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public  String toString() {
        return this.name;
    }

   //@Override
   //public int compareTo(Cats c) {
   //    return name.compareTo(c.getName());
   //}
}
