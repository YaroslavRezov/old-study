import java.util.*;

public class MapMap {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        HashMap<Integer, String> legends = new HashMap<>();
        legends.put(1, "d");
        legends.put(2, "c");
        legends.put(3, "a");
        legends.put(4, "w");

        Set<Map.Entry<Integer, String>> entries = legends.entrySet();
        System.out.println(legends.keySet());

        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();

        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            if (entry.getKey() % 2 > 0){
                iterator.remove();
            }
        }

//        for (Map.Entry<Integer, String> entry: entries) {
//            if (entry.getKey() % 2 > 0){
//                legends.replace(entry.getKey(), "hhh");
//            }
//        }

        System.out.println(legends);

//        for (int b = 0; b < legends.size(); b++)
//        {
//            Legend ass = legends.get(b);
//            s.add(ass);
//            System.out.println(legends.get(b));
//        }

//        Set<Map.Entry<String, Integer>> entries = legends.entrySet();
//
//        for (Map.Entry<String, Integer> entry : entries) {
//            int g = entry.getValue();
//            int i = g % 2;
//            if (i != 0) {
//                entry.setValue(0);
//            }
//            s.add(entry.getValue());
//        }
//        for (int cock = 0; cock < s.size(); cock++) {
//            int h = s.get(cock);
//            if (h == 0) {
//                s.remove(cock);
//            }
//        }
//        legends.clear();
//        legends.put("a", null);
//        legends.put("b", null);
//        System.out.println(s);
//
//
//        for (Map.Entry<String, Integer> entri : entries) {
//            for (int shit = 0; shit < s.size(); shit++) {
//                int lol = s.get(shit);
//                entri.setValue(lol);
//            }
//        }
//        int hoh = s.get(0);
//        legends.replace("a", hoh);
//        System.out.println(legends);

        String x = null;
        System.out.println(x);
    }

}