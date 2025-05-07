public class SynergyJavaStraight {
    public static void main(String[] args) {
        int[][] map = new int [10][10];
        int locationMaker = 1;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = locationMaker++;
            }
        }
        for (int i = 0; i < map.length; i++) {
            System.out.println();
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] < 10) {
                    System.out.print("|  "+map[i][j]+ " ");
                } else {
                System.out.print("| "+map[i][j]+ " ");
                }
            }
        }
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {

            }
        }



    }
}
