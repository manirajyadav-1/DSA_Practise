public class Matrix {
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        int row = matrix.length;
        int col = matrix[0].length;


        System.out.println(row + " " + col);
        System.out.println("\n");

        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
