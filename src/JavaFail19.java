public class JavaFail19 {
    static String[] days = {"monday", "tuesday", "wednesday", "thursday",
            "friday", "saturday", "sunday" };

    public static void main(String[] args) {
        int index = 0;

        for(String day : days){

            if(index == 3){
                break;
            }else {
                continue;
            }
//           index++;
//           if(days[index].length()>3){
//               days[index] = day.substring(0,3);
//           }
        }
        System.out.println(days[index]);

    }
}
