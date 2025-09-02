public class InsetionSort {
    public void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        }
    }
    public static void main(String[] args) {
        InsetionSort i = new InsetionSort();
        int a[] = {8,9,3,6,5,4,2};
        i.insertionSort(a);
        for(int m : a){
            System.out.println(m);
        }
        
    }
    
}
