public class MatrixMultiplication {
    public int[][] productOfMatrix(int a[][] ,int b[][]){
        int r1 = a.length;
        int r2 = b.length;
        int c1 = a[0].length;
        int c2 = b[0].length;

        if(c1!=r2){
            System.out.println("Multiplication not possible");
            int[][] r = new int[0][0];
            return r;
        }

        int result[][] = new int[r1][c2];
        
        for(int i =0 ;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    result[i][j]+=a[i][k]*b[k][j];
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        MatrixMultiplication m = new MatrixMultiplication();
         int[][] a1 = {{1,2},{3,4}};
        int[][] a2 ={{4,3},{2,1}};
        int[][] result = m.productOfMatrix(a1, a2);

        for(int[] i:result){
            for(int j :i){
                System.out.print(j+" ");
            }
            System.out.println();
        
    }
    
}}
