public class prefixSum {
    public void PrefixSum(int arr[]){
        for(int i = 1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
    }
    public static void main(String[] args) {
        prefixSum p = new prefixSum();
        int arr[] = {2,1,3,4,5};
        p.PrefixSum(arr);

        for(int i: arr){
            System.out.println(i);
        }
        
    }
    
}
