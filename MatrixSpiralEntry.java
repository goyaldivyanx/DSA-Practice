public class MatrixSpiralEntry {

    public  int[][] ElementEntry(int n){
        int e =1;
        int arr[][] = new int[n][n];
        int tr = 0, br =n-1,lc=0,rc =n-1;
        while(tr<=br && lc<=rc){
            //toprow
            for(int i=lc;i<=rc;i++){
                arr[tr][i]=e;
                e++;
            }
            tr++;
            //right col
            for(int i=tr;i<=br;i++){
                arr[i][rc]=e;
                e++;
            }
            rc--;
            //bottom row
            for(int i=rc;i>=lc;i--){
                arr[br][i]=e;
                e++;
            }
            br--;
            //left col
            for(int i=br;i>=tr;i--){
                arr[i][lc]=e;
                e++;
            }
            lc++;
        }
        return arr;
    }
    public static void main(String[] args) {
        MatrixSpiralEntry m =new MatrixSpiralEntry();
        int[][] result = m.ElementEntry(1);

        for(int i[]:result){
            for(int j:i){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }
    
}
