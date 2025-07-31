public class EqualPartition {

    public void prefixSum(int arr[]){
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
    }
    public boolean isEqualPartition(int arr[]){
        prefixSum(arr);
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]==arr[n-1]-arr[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        EqualPartition e = new EqualPartition();
        int arr[] = {0,1,1};
        System.out.println(e.isEqualPartition(arr));
        
    }
    
}
