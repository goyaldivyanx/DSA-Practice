public class ZeroAtLast {
    public void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void ZeroSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int j = i;
            while(j!=arr.length-1 && arr[j]==0 && arr[j+1]!=0){
                swap(arr,j,j+1);
                j++;
            }
        }
    }
    public static void main(String[] args) {
        
    }
    
}
