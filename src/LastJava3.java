public class LastJava3 {
    public static void main(String[] args) {
        LastJava3 lastJava3 = new LastJava3();
        try{
            lastJava3.cocking();
        } catch (Exception e) {
            System.out.println("found");
        }
        System.out.println("fucks");
    }
    public void cocking() throws Exception {
        throw new Exception();
    }
}
