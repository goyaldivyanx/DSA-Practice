public class QuickSort {
    public void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]=temp;
    }
    public int partition(int arr[],int st,int end){
        int p = arr[st];
        int count = 0;
        for(int i=st+1;i<end+1;i++){
            if(arr[i]<=p){
                count++;
            }
        }
        int pi = st +count;
        swap(arr,st,pi);

        int l,r;
        l = st;
        r=end;
        while(l<pi && r>pi){
            while(arr[l]<p){
                l++;
            }
            while(arr[r]>p){
                r--;
            }
            if(l<pi && r>pi){
                swap(arr,l,r);
            }
        }

        return pi;


    }
    public void quickSort(int arr[],int st,int end){
        if(st<end){
            int pi = partition(arr, st, end);
            quickSort(arr, st, pi-1);
            quickSort(arr,pi+1,end);
        }
    }
    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        int arr[] = {5,4,8,7,10,2,13};
        q.quickSort(arr, 0, arr.length-1);

        for(int i : arr){
            System.out.println(i);
        }
        
    }
    
}
