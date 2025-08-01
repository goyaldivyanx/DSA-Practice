public class InplaceTranspose {
    public void Transpose(int arr[][]){
        int r =arr.length;
        int c =arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        InplaceTranspose t = new InplaceTranspose();
        int arr[][] ={{1,2,3},{4,5,6}};
        t.Transpose(arr);
        for(int[] i:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}
        