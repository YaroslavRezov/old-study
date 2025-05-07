public class DeepNightMeth13Sub extends DeepNightMeth13 {
    public void printName(int imput){
        System.out.println("Sub " + imput);
    }

    public static void main(String[] args) {
        DeepNightMeth13Sub deepNightMeth13Sub = new DeepNightMeth13Sub();
        deepNightMeth13Sub.printName(1);
        deepNightMeth13Sub.printName(1.1);
    }
}
