import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SynegyJava2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
//      Linkedlist is basically a chain of bound objects
//        it not an array
//        the membership in LikedList adds to object links to previous and next obeject, like: s2 has link to s1 and s3

        String s1 = "God";
        String s2= "has";
        String s3 = "left";
        String s4 = "this";
        String s5 = "place";
        String s0 = "Yes,";
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(0, s0);
        list.remove(5);
        list.addFirst("Jesus,");
        list.addLast("Earth");
        list.pollLast();
        String[] lists = list.toArray(new String[0]);
        for (String i: list){
        System.out.print(i.concat(" "));
        }
        System.out.println();
        System.out.println("Who has? " + list.peekFirst().replace(",", "") + " !!!");
        for (String i : lists){
        System.out.println(i);
        }
        for (int i = 0; i < 1000000; i++){
            list.add(0, new String());
        }
        ArrayList<String> arrayList = new ArrayList();
        for (int i = 0; i < 1000000; i++){
            arrayList.add(0, new String());
        }






    }
}
