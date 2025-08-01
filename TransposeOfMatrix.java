public class TransposeOfMatrix {
    public int[][] Transpose(int arr[][]){
        int r = arr.length;
        int c = arr[0].length;
        int result[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                result[i][j]=arr[j][i];
            }
        }
        return result;

    }
    public static void main(String[] args) {
        TransposeOfMatrix t = new TransposeOfMatrix();
        int arr[][] ={{1,2,3},{4,5,6},{7,8,9}};
        int transpose[][]=t.Transpose(arr);

        for(int[] i:transpose){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}
