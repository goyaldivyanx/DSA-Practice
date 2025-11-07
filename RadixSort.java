public class RadixSort {
    public int findMax(int arr[]){
        int mx =arr[0];
        for(int i:arr){
            if(i>mx){
                mx =arr[i];
            }
        }
        return mx;
    }
    public void radixSort(int arr[]){
        int max = findMax(arr);
        for(int p = 1 ; max/p>0;p*=10){
            int farr[] = new int[10];
            for(int i : arr){
                int idx = (i/p)%10;
                farr[idx]++;
            }
            for(int i = 1;i<farr.length;i++){
                farr[i]=farr[i]+farr[i-1];
            }
            int output[] = new int [arr.length];
            for(int i =arr.length-1;i>=0;i--){
                int in = farr[((arr[i]/p)%10)]-1;
                output[in] = arr[i];
                farr[((arr[i]/p)%10)]--;
            }

            for(int i=0;i<arr.length;i++){
                arr[i]=output[i];
            }

        }
    }
    public static void main(String[] args) {
        
    }
    
}
