public class MergeSort {
    public static void merge(int arr[],int l,int r){
        int mid = l+(r-l)/2;
        
        int n1 = mid - l+1;
        int n2 = r-mid;

        int L[]=new int[n1];
        int R[]=new int[n2];

        for(int i=0;i<n1;i++){
            L[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[mid+1+j];
        }


        int x,y,z;
        x=0;y=0;z=l;
        while(x<n1 && y<n2){
            if(L[x]<R[y]){
                arr[z++]=L[x++];
            }else{
                arr[z++]=R[y++];
            }
        }
        while(x<n1){
            arr[z++]=L[x++];
        }
        while(y<n2){
            arr[z++]=R[y++];
        }
    }
    public static void mergeSort(int arr[],int l,int r){
        if(l<r){
            int mid = l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr, mid+1, r);

            merge(arr, l, r);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 70, 50, 30, 10, 20, 40, 60 };
        mergeSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
    }
    
}
