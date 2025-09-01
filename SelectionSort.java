public class SelectionSort {
    public void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void selectSort(int arr[]){
        int n = arr.length;
        int min;
        for(int i=0;i<n;i++){
            min = i ; 
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            swap(arr,min,i);
        }
    }
    public static void main(String[] args) {
        SelectionSort s =  new SelectionSort();
        int arr[] = {5,3,2,1,4};
        s.selectSort(arr);
        for(int i:arr){
            System.out.println(i);
        }
        
    }
    
}
