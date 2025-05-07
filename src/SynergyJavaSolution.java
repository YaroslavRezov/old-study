import java.util.HashMap;

public class SynergyJavaSolution {
    HashMap <Integer, Double> steps = new HashMap<>();
    public static void main(String[] args) {

        SynergyJavaSolution synergyJavaSolution = new SynergyJavaSolution();
        synergyJavaSolution.findTheProfile();


    }
    void findTheProfile() {
        double result = 0.0;
        putFunnies();
        for(int i=1; i < steps.size()+1; i++) {
            for(int j=1; j < steps.size()+1; j++) {
                result = steps.get(i) * steps.get(j);
                if(result < 350 & result > 200){
                    System.out.println("lenght- " + i +" width- "+ j);
                    System.out.println(result);
                }
            }
        }
    }
    void putFunnies() {
        steps.put(1, 2.54);
        steps.put(2, 5.08);
        steps.put(3, 7.62);
        steps.put(4, 10.16);
        steps.put(5, 12.7);
        steps.put(6, 15.24);
        steps.put(7, 17.78);
        steps.put(8, 20.32);
        steps.put(9, 22.86);
    }
}
