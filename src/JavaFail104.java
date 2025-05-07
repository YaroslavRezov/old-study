public class JavaFail104 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][4];
        int innercurrent;
        int result = 0;
        for(int i=0;i<5; i++) matrix[i][1]  = 1;
        for (int outer = 0; outer < matrix.length; outer++) {
            System.out.println();

            for (int inner = 0; inner < matrix[outer].length; inner++) {
                System.out.print(matrix[outer][inner] + "|");

            }
        }
    }
}