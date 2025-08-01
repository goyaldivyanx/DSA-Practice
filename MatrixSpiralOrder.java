public class MatrixSpiralOrder {
    public void PrintSpiralOrder(int arr[][]){
        int r = arr.length;
        int c = arr[0].length;
        int tr = 0 ,br =r-1,lc =0,rc =c-1;
        while(tr <= br && lc <= rc){
        //toprow
        for(int i=lc;i<=rc;i++){
            System.out.print(arr[tr][i]+" ");
        }
        tr++;

        //right col
        for(int i=tr;i<=br;i++){
            System.out.print(arr[i][rc]+" ");
        }
        rc--;

        //bottom row
        for(int i=rc;i>=lc;i--){
            System.out.print(arr[br][i]+" ");
        }
        br--;
        //left col
        for(int i=br;i>=tr;i--){
            System.out.print(arr[i][lc]+" ");
        }
        lc++;

    }

    }
    public static void main(String[] args) {
         MatrixSpiralOrder obj = new MatrixSpiralOrder();
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        obj.PrintSpiralOrder(matrix);

        
    }
    
}
