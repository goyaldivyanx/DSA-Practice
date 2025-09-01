public class BubbleSort {
    public void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            boolean f = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    f = true;
                }
            }
            if(f == false){
                return;
            }
        }
    }
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int arr[] = {1,2,5,3,6,7,8};
        b.bubbleSort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
    
}
