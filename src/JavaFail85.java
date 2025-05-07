public class JavaFail85 {
    static int value = 0;
    static int i =5;
    public static void main(String[] args) //2
    {
        int ndArgument = Integer.parseInt(args[2]); //3
        if( true == 2 > 10 ) //4
        {
            value = -10;
        }
        else{
            value =  ndArgument;
        }
        for( ; value>0; value--) System.out.println("A"); //5
        switch (value){
//            i =3;
        }
    }
}
