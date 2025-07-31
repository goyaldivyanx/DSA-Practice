public class Sortoddeven {
    public void swap(int[] arr,int a,int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] =t;
    }
    public void sorting(int arr[]){
        int l = 0;
        int r = arr.length - 1;
        while(l<r){
            if(arr[l]%2==1 && arr[r]%2==0){
                swap(arr,l,r);
                l++;
                r--;
            }else if(arr[l]%2==0){
                l++;
            }else if(arr[r]%2==1){
                r--;
            }
        }
    }
    public static void main(String[] args) {
        Sortoddeven s = new Sortoddeven();
        int[] arr = {1,2,3,4,5,6,7};
        s.sorting(arr);

        for(int i:arr){
            System.out.println(i);
        }
        
    }
    
}
