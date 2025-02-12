package gr.aueb.cf.ch6;

public class TwoDimArrayApp {

    public static void main(String[] args) {

        //κατα γραμμες και στηλες
        int[][] grid = new int [2][3];

        grid[0][1] = 5; //πρωτα αναφερομαστε γραμμες[0] //και μετα στηλες [1]
        grid[0][1] = 2;
        grid[0][2] = 10;
        grid[1][0] = 2;
        grid[1][1] = 6;
        grid[1][2] = 8;

        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int[] row : grid) {
            for (int el : row) {
                System.out.print(el);
            }
            System.out.println();
        }
    }
}
