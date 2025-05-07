public class SynergyJava4 {
    public static void main(String[] args) {
  outer:   for(int i = 0;i < 3; i++){
            for(int j = 0;j < 2; j++){
                if(i==j){
                    System.out.println(i + " " + j+ "|||||||");
                continue outer;
                }
                System.out.println(i+" " + j);
            }

        }
    }
}
