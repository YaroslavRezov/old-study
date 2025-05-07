public interface Cum extends SuperCum {
    default int Get(int i) {
        int s = 4;
        for (int d = 5; d < 10; d++) {
            System.out.println(d);
        }
        return s;
    }

    boolean Add (int val);


  //  public static void main(String[] args) {
  //
  //  }
  //  default int cock() {
  //
  //  }
}
