public class SynergyJava16 {
    public static void main(String[] args) {
        SynergyJava16 synergyJava16 = new SynergyJava16();
        System.out.println(synergyJava16.func(5));
    }
    public  int func(int i){
        if(i <= 1) {
            i = 1;

        } else {
            i = i * func(i - 1);
        }
        return i;
    }
}
