public class Test {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{2, 2}, {2, 2}};


        System.out.println("matrix1:");
        matrix.displayMatrix(matrix1);

        System.out.println("matrix2:");
        matrix.displayMatrix(matrix2);

      matrix.canAdd(matrix1, matrix2);
      matrix.canMultiply(matrix1, matrix2);

      matrix.transpose(matrix1);



    }
}
