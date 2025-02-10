public class SpiralMatrix {
    public static void printSpiral (int matrix[][]){
        int startRow = 0;
        int startCoulomn = 0;
        int endRow = matrix.length-1;
        int endCoulomn = matrix[0].length-1;

        while (startRow <= endRow && startCoulomn <= endCoulomn){
            //top
            for (int j = startCoulomn; j <= endCoulomn; j++) {
                System.out.print(matrix[startRow][j]+ " ");
            }
            //right
            for (int i = startRow+1; i <= endRow ; i++) {
                System.out.print(matrix[i][endCoulomn]+ " ");
            }
            //bottom
            for (int j = endCoulomn-1; j >= startCoulomn; j--) {
                if (startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+ " ");
            }
            //left
            for (int i = endRow-1; i >= startRow+1 ; i--) {
                if (startCoulomn == endCoulomn) {
                    break;
                }
                System.out.print(matrix[i][startCoulomn]+ " ");
            }
            startRow++;
            startCoulomn++;
            endRow--;
            endCoulomn--;
        }
        System.out.println();
    }
    public static void main (String[]args){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        printSpiral(matrix);

    }
}
