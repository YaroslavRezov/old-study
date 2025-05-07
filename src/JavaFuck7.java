public class JavaFuck7 {
    int[][] matrix = new int[2][3];

    int a[] = {1, 2, 3};
    int b[] = {4, 5, 6};

    public static void main(String[] args) {
        JavaFuck7 javaFuck7 = new JavaFuck7();
        javaFuck7.loadMatrix();
    }

    public int compute(int x, int y){
        return a[x]*b[y];
    }

    public void loadMatrix(){
        for(int x=0; x<matrix.length; x++){
            for(int y=0; y<matrix[x].length; y++){
                matrix[x][y] = compute(x, y);
                System.out.println(matrix[x][y]);
            }
        }
    }
}
