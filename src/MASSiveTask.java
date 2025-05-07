public class MASSiveTask {
    static int[][] elMassive = new int[][]{{7, 4, 2, 5, 1},
            {3, 23},
            {1},
            {5, 23, 3},
            {3, 55, 5, 7, 3},
            {2, 5333}};

    public static void main(String[] args) {
        MASSiveTask masSiveTask = new MASSiveTask();
        int result1 = masSiveTask.counter(elMassive);
       // masSiveTask.showo(elMassive, masSiveTask.result);
        masSiveTask.printer(elMassive, result1);

    }
    public int counter(int[][] elMassive) {
        int innercurrent;
        int result = 0;
        for (int outer = 0; outer < elMassive.length; outer++) {
            for (int inner = 0; inner < elMassive[outer].length; inner++) {
                innercurrent = elMassive[outer][inner];
                result = Math.max(result, innercurrent);

            }
        }
     return Integer.toString(result).length();
    }
    public void printer (int[][] elMassive, int maxLenght) {
        for (int outer = 0; outer < elMassive.length; outer++) {
            String lines = digitToLines(maxLenght * elMassive[0].length + elMassive[0].length + 1);
            System.out.println(lines);

            for (int inner = 0; inner < elMassive[0].length; inner++) {
                String elString;
                try {
                   elString = Integer.toString(elMassive[outer][inner]);
                }catch (ArrayIndexOutOfBoundsException e) {
                    elString = "";
                }
                int elLength = elString.length();
                if (elLength < maxLenght) {
                    int defLenght = maxLenght - elLength;
                    float defLenght1 = defLenght / 2.0F;
                    int leftDefLenght = (int) Math.ceil(defLenght1);
                    int rightDefLenght = (int) Math.floor(defLenght1);
                    String leftSpaces = digitToSpaces(leftDefLenght);
                    String rightSpaces = digitToSpaces(rightDefLenght);
                    if (inner == 0) {
                        System.out.print("|" + leftSpaces + elString + rightSpaces + "|"  );
                    } else {
                        System.out.print(leftSpaces + elString + rightSpaces + "|"  );
                    }
                } else {
                    if (inner ==0) {
                        System.out.print("|" + elString + "|");
                    } else {
                        System.out.print(elString + "|");
                    }
                }


            }

            System.out.println();

        }
    }
    public String digitToSpaces (int digit) {
        StringBuilder spaces = new StringBuilder();
        for (int i = 0; i < digit; i++ ) {
            spaces.append(" ");
        }
        return spaces.toString();
    }
    public String digitToLines (int digit) {
        StringBuilder lines = new StringBuilder();
        for (int i = 0; i < digit; i++ ) {
            lines.append("-");
        }
        return lines.toString();
    }
   // public void showo(int[][] elMassive, int result) {
   //     result = Integer.toString(result).length();
   //     for (int outer = 0; outer < elMassive.length; outer++) {
   //         System.out.println("____________");

   //              System.out.print("|");
   //              for (int inner = 0; inner < elMassive[outer].length; inner++) {

   //                  switch (result){
   //                      case 1 :
   //                          System.out.print(elMassive[outer][inner] + "|");
   //                          break;
   //                      case 2 :
   //                          if (Integer.toString(elMassive[outer][inner]).length() == 1)
   //                              System.out.print(elMassive[outer][inner] + "  |  ");
   //                          if (Integer.toString(elMassive[outer][inner]).length() == 2)
   //                              System.out.print(elMassive[outer][inner] + " |  ");
   //                          break;
   //                      case 3 :
   //                          if (Integer.toString(elMassive[outer][inner]).length() == 1)
   //                              System.out.print(elMassive[outer][inner] + "  |  ");
   //                          if (Integer.toString(elMassive[outer][inner]).length() == 2)
   //                              System.out.print(elMassive[outer][inner] + " |   ");
   //                          if (Integer.toString(elMassive[outer][inner]).length() == 3)
   //                              System.out.print(elMassive[outer][inner] + "|  ");
   //                          break;
   //                      case 4:
   //                          if (Integer.toString(elMassive[outer][inner]).length() == 1)
   //                             System.out.print(elMassive[outer][inner] + "   |   ");
   //                          if (Integer.toString(elMassive[outer][inner]).length() == 2)
   //                              System.out.print(elMassive[outer][inner] + "  |   ");
   //                          if (Integer.toString(elMassive[outer][inner]).length() == 3)
   //                              System.out.print(elMassive[outer][inner] + " | ");
   //                          if (Integer.toString(elMassive[outer][inner]).length() == 4)
   //                              System.out.print(elMassive[outer][inner] + "|   ");
   //                          break;
   //                      case 5:
   //                          if (Integer.toString(elMassive[outer][inner]).length() == 1)
   //                              System.out.print(elMassive[outer][inner] + "    |  ");
   //                          if (Integer.toString(elMassive[outer][inner]).length() == 2)
   //                              System.out.print(elMassive[outer][inner] + "   |  ");
   //                          if (Integer.toString(elMassive[outer][inner]).length() == 3)
   //                              System.out.print(elMassive[outer][inner] + "  | ");
   //                          if (Integer.toString(elMassive[outer][inner]).length() == 4)
   //                              System.out.print(elMassive[outer][inner] + " |  ");
   //                          if (Integer.toString(elMassive[outer][inner]).length() == 5)
   //                              System.out.print(elMassive[outer][inner] + "|");
   //                          break;
   //                      default:
   //                          System.out.print("'xcuse me? durak? ");
   //                  }


   //              }
   //              System.out.println(" ");
   //     }
   // }
}
        //elMassive[outer][inner]