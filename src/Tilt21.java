public class Tilt21 {
    int numSports;
    public Tilt21(int numSports) {
//        numSports = numSports; shit but works
//        numSports = this.numSports; shit but works
        this.numSports = numSports; //works
//          numSports = super.numSports; shit
//          super.numSports = numSports; shit
    }

    public static void main(String[] args) {
        System.out.println(new Tilt21(50).numSports);
    }
}
