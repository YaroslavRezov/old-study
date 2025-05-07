public class JavaFail56 {
    public static void main(String[] args){
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int counter = 0;
        for (int value : arr) {
            if (counter >= 5) {
                break;
            } else {
                continue;
            }
//            if (value > 4) {     unreachable cuz  look at continue in else,
//            the shit skips rest of integration and starts next one
//                arr[counter] = value + 1;
//            }
//            counter++;
        }
        System.out.println(arr[counter]);
    }
}
