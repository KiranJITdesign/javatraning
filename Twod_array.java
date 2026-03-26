public class Twod_array { 
    public static void main(String[] args) {
        int[][] matrix1={ {1,2,3}, {4,5,6}, {7,8,9} };
        for(int i=0;i < matrix1.length;i++){
            for(int j=0;j<matrix1[0].length;j++){
                System.out.print(matrix1[i][j] +" ");

            }
            System.out.println();
        }
    
    }
}
