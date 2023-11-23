import java.util.Scanner;
class Main{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // makes two matrixes
        int [][] matrix1 = createMatrix("matrix1");
        int [][] matrix2 = createMatrix("matrix2");
        // checks if they can be added and/or multiplied
        canAdd(matrix1,matrix2);
        canMultiply(matrix1,matrix2);
// transposes a matrix
        transpose(matrix1);


    }

    public static int [][] createMatrix(String matrixName){
        //input from user
        System.out.println("enter the number of rows of "+matrixName+" matrix");
        int rows = scanner.nextInt();

        System.out.println("enter the number of columns of "+matrixName+" matrix");
        int columns = scanner.nextInt();
        // sånn man lager en matrise i java...tydligvis
        int [][] matrix = new int[rows][columns];
        // i er rad og j er kolonne eks --- (0,0) (0,1)
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.println("enter the element at position ("+i+","+j+")");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(matrixName+" matrix successfully created");
        // lagde en metode for å vise matrisen
        displayMatrix(matrix);
        return matrix;

    }
    public static void displayMatrix(int [][] matrix){
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
    public static void canAdd(int [][] matrix1,int [][] matrix2){
        //sjekker om matrisene har samme dimensjoner
        if(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length){
            System.out.println("addition is possible, moving to addition method:");
            // hvis de har samme dimensjoner så går den til add metoden
            add(matrix1,matrix2);

        }
        else{
            System.out.println("addition is not possible");
        }
    }
    public static void add(int [][] matrix1,int [][] matrix2){
        // lage ren ny matrise med dimensjonene til matrix1
        int [][] result = new int[matrix1.length][matrix1[0].length];
        //går gjennom hver element i matrisen og legger de sammen
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[0].length;j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("addition of matrix1 and matrix2 is");
        displayMatrix(result);
    }



    public static void canMultiply(int [][] matrix1,int [][] matrix2){
        //sjekker om antall kolonner i matrix1 er lik antall rader i matrix2
        if(matrix1[0].length == matrix2.length){
            System.out.println("multiplication is possible, moving to multiplication method:");
            multiply(matrix1,matrix2);
        }
        else{
            System.out.println("multiplication is not possible");
        }

    }
    public static void multiply(int [][] matrix1,int [][] matrix2){
        int [][] result = new int[matrix1.length][matrix2[0].length];
        // går gjennom alle rader i matrix1 og ganger de emd alle kolonnene i matrix2
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix2[0].length;j++){
                for(int k=0;k<matrix1[0].length;k++){
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("multiplication of matrix1 and matrix2 is");
        displayMatrix(result);
    }

    public static void transpose(int [][] matrix){
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
