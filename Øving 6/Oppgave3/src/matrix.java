public class matrix {
    // function to display matrix
    public static void displayMatrix(int [][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    // function to check if addition is possible
    public static void canAdd(int [][] matrix1,int [][] matrix2){
        //checks if the matrices have the same dimensions
        if(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length){
            System.out.println("addition is possible, moving to addition method:");
            // if they have the same dimensions, move to addition method
            add(matrix1,matrix2);

        }
        else{
            System.out.println("addition is not possible");
        }
    }
    public static void add(int [][] matrix1,int [][] matrix2){
        // makes a new matrix with the same dimensions as matrix1
        int [][] result = new int[matrix1.length][matrix1[0].length];
        //goes through each element in the matrix and adds them together
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[0].length;j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("addition of matrix1 and matrix2 is");
        //calls displayMatrix method to display the result
        displayMatrix(result);
    }
    public static void canMultiply(int [][] matrix1,int [][] matrix2){
        //checks if the number of columns in matrix1 is equal to the number of rows in matrix2
        if(matrix1[0].length == matrix2.length){
            System.out.println("multiplication is possible, moving to multiplication method:");
            // goes to the multiplication method
            multiply(matrix1,matrix2);
        }
        else{
            System.out.println("multiplication is not possible");
        }

    }
    public static void multiply(int [][] matrix1,int [][] matrix2){
        int [][] result = new int[matrix1.length][matrix2[0].length];
        // goes torugh all the rows in matrix1 and multiplies them with all the columns in matrix2
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix2[0].length;j++){
                for(int k=0;k<matrix1[0].length;k++){
                    // adds the result of the multiplication to the result matrix
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("multiplication of matrix1 and matrix2 is");
        // calls displayMatrix method to display the result
        displayMatrix(result);
    }
    public static void transpose(int [][] matrix){
        // makes a new matrix with the dimensions of the transposed matrix
        int [][] result = new int[matrix[0].length][matrix.length];

        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[0].length;j++){
                result[j][i] = matrix[i][j];
            }
        }
        System.out.println("transpose of matrix is");
        displayMatrix(result);
    }


}

