
public class Program {

    public static void main(String[] args) {
        // Test your method here
        int rows = 2;
        int columns = 3;
        int[][] matrix = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };
        System.out.println(arrayAsString(matrix));
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            int[] row = array[i];
            String rowString = "";
            for (int j = 0; j < row.length; j++) {

                rowString += row[j];
            }
            sb.append(rowString + '\n');
        }
        return sb.toString();
    }

}
