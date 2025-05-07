import java.util.ArrayList;

public class TryDaCatch {
    public static void main(String[] args) {
        TryDaCatch tryDaCatch = new TryDaCatch();
        ArrayList<Object> trai = new ArrayList<>();
        Giby giby = new Giby();
        boolean pravda = true;
        trai.add("cum");
        trai.add(pravda);
        trai.add(1);
        trai.add('i');
        trai.add(2);
        trai.add(3);
        trai.add("fergfe");
        trai.add("fregergd");
        trai.add("dfefewcfewrewv");
        trai.add(7);
        tryDaCatch.tolkaInt(trai);
        System.out.println(trai);

        try {
            tryDaCatch.go();
        } catch (ShitException e) {
            System.out.println(e.getLocalizedMessage());
        }

    }

    public ArrayList tolkaInt(ArrayList<Object> trai) {

        for (int i = 0; i < trai.size(); i++) {
            Object x = trai.get(i);
            int i1 = 0;
            try {
                i1 = Integer.parseInt(x.toString());
            } catch (NumberFormatException e){
                System.out.println(e.getMessage());
                trai.remove(i);
                i--;
            }
        }
        return trai;
    }
    public int shitting(int x) throws ShitException {
        int z = x % 2;
        if( z != 0) {
            throw new ShitException("kjij");
        }
        return x;
    }

    public void go() throws ShitException {
        TryDaCatch tryDaCatch = new TryDaCatch();

        System.out.println(tryDaCatch.shitting(3));

    }

}