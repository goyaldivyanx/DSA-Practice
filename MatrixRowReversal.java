public class MatrixRowReversal {
    public void swap(int arr[],int a,int b){
        int temp =arr[a];
        arr[a] = arr[b];
        arr[b] =temp;
    }
    public void ArrayReversal(int arr[]){
        int l = 0 ;
        int r =arr.length -1;
        while(l<r){
            swap(arr,l,r);
            l++;
            r--;
        }
    }
    public void rowReversal(int arr[][]){
        for(int i[] : arr ) {
            ArrayReversal(i);

        }
    }
    public static void main(String[] args) {
        MatrixRowReversal m = new MatrixRowReversal();
        int arr[][] ={{1,2,3,10},{4,5,6,11},{7,8,9,12}};
        m.rowReversal(arr);
        
        for(int i[]:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
