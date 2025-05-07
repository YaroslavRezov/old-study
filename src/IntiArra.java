import java.util.ArrayList;

public class IntiArra {

    public static void main(String[] args) {
        IntiArra intiArra = new IntiArra();
        ArrayList<Integer> nigga = new ArrayList<>();
        nigga.add(1);
        nigga.add(3);
        nigga.add(8);
        nigga.add(9);
        nigga.add(4);
        int summNig = intiArra.summArra(nigga);
        String message = intiArra.summArraMessage(summNig);
        System.out.println(message);
        int intager1 = intiArra.getInt();
        System.out.println(intager1);

    }
    public int summArra(ArrayList<Integer> nigga) {
        int summNig = 0;
        for (int i = 0; i < nigga.size(); i++) {
            int nig = nigga.get(i);
            summNig = summNig + nig;
        }
        return summNig;
    }
    public String summArraMessage(int summNig) {
        return "Dude, take your FUCKING MONEY, ASSHOLE, BITCH, BASTARD, FUCK YOU: " + summNig;
    }


    public int getInt(){

        int integer = 5;
        integer++;
        return integer;
    }

}
