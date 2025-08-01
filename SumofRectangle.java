public class SumofRectangle {
    public int SumofElemnt(int arr[][],int x1,int y1,int x2,int y2){
        int sum =0;
        for(int i=x1;i<=x2;i++){
            for(int j=y1;j<=y2;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        SumofRectangle S =new SumofRectangle();
        int arr[][]={{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1}};
        int sum = S.SumofElemnt(arr, 3, 1, 5, 4);

        System.out.println(sum);
        
    }
    
}
