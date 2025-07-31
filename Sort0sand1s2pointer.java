public class Sort0sand1s2pointer {
    public void Sorting(int arr[]){
        int left =0;
        int right = arr.length -1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                arr[left]=0;
                left++;
                arr[right]=1;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }}
    }

    public static void main(String[] args) {
        Sort0sand1s s = new Sort0sand1s();
        int arr[] = {1, 0, 0, 1, 0, 1, 1, 0, 0};
        s.sorting(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }

        
}
    
