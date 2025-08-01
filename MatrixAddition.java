public class MatrixAddition {
    public int[][] SumofMatrix(int a1[][],int a2[][]){
        int r1 = a1.length;
        int c1 = a1[0].length;
        int r2 = a2.length;
        int c2 = a2[0].length;
        if(r1!=r2 || c1!=c2){
            System.out.println("Enter Valid Arrays!");
            int arr[][] = new int [0][0];
            return arr;
        }
        int sum[][] = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=a1[i][j]+a2[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        MatrixAddition m = new MatrixAddition();
        int[][] a1 = {{1,2},{3,4}};
        int[][] a2 ={{4,3},{2,1}};
        int[][] result = m.SumofMatrix(a1, a2);

        for(int[] i:result){
            for(int j :i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
    
}
