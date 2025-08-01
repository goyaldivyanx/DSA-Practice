public class MatrixRotation {
    public void swap(int arr[],int a,int b){
        int temp =arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void rowReversal(int arr[]){
        int l =0;
        int r= arr.length -1;
        while(l<r){
            swap(arr,l,r);
            l++;
            r--;
        }
    }
    public void Transpose(int arr[][]){
        int r = arr.length;
        int c = arr[0].length;

        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]= temp;
            }
        }
    }
    public void RotateMatrix(int arr[][]){
        Transpose(arr);
        for(int i[]: arr){
            rowReversal(i);
        }
    }
    
    public static void main(String[] args) {
        MatrixRotation r = new MatrixRotation();
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        r.RotateMatrix(arr);

        for(int i[]:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
