public class Cons {
  private String name;
   public Cons(String name) {
       this.name = name;
   }
}

class UseCons {
    public static void main(String[] args) {
        Cons cons = new Cons("name");
    }
}
