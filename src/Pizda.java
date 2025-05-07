public class Pizda {
    static int[][] elMassive = new int[][]{{7, 4, 2, 5, 1},
            {3, 2},
            {1},
            {5, 2, 3},
            {6, 5465, 5, 7, 3},
            {2, 50005}};
    public static void main(String[] args) {
        int innercurrent;
        int result = 0;
        for (int outer = 0; outer < elMassive.length; outer++) {
            for (int inner = 0; inner < elMassive[outer].length; inner++) {
                innercurrent = elMassive[outer][inner];
                if (result < innercurrent) {
                    result = innercurrent;
                }
            }
        }
        System.out.println(Integer.toString(result).length());
    }
}
   // int innerStrinner = elMassive[outer][inner];
   // String countableArray = Integer.toString(innerStrinner);
   // int innerStrinnerPlus = elMassive[outer][innerPlus];
   // String countableArrayPlus = Integer.toString(innerStrinnerPlus);
   // int stringLens = countableArray.length();
   // int stringLensPlus = countableArrayPlus.length();
   //             if (stringLens < stringLensPlus) {
   //     counted1 = countableArrayPlus.length();
   //     }
   //     else {
   //     counted1 = countableArray.length();
   //     }
   //     counted2 = counted1;