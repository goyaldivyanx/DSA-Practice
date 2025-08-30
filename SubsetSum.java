public class SubsetSum {
    public void subSum(int[] arr,int sum){
        if(arr.length==0){
            System.out.println(sum);
            return;
        }
        int c = arr[0];
        int a[] = new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            a[i-1]=arr[i];
        }
        subSum(a,sum+c);
        subSum(a,sum);
    }
    public static void main(String[] args) {
        SubsetSum s = new SubsetSum();
        int arr[] = {2,4,5};
        s.subSum(arr,0);

        
    }
    
}
