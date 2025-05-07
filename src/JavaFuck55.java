public class JavaFuck55 {
    static int a = 0;
    int b = 5;
    /*
    damn since static vars are from class no matter how many times
    you will crate new object of the class
    static will remain on it val, but instance ones will kinda resign,
    so crate 2 classes and call 1 times method for eache class
    , and this method should mutate states and use as
    instance one and static one
    so static will get mutated and get mutated
     once again but on base of past
    val, but instance one will use val of new class
    * */
    public static void main(String[] args) {
        int i = 0;
        int j;
        i = j = i++;
        System.out.println(i);
        System.out.println(j);

    }
}
