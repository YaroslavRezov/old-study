public class JavaFail112 {
    public static void main(String[] args){
        int i = 2;
        switch(i)  //1
        {
            case 0 :
                boolean b = false;
                System.out.println(b);
                break;


            case 1 :
                b = true; //2
                System.out.println(b);
                break;

        }

//        if(b) System.out.println(args[2]);
    }
}
