public class SwappedSorted {
    public void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] =temp;
    }
    public void fixSorting(int[] arr){
        int x=-1;int y=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                if(x==-1){
                    x=i-1;
                    y=i;
                }
                else{
                    y=i;
                }
            }
        }
        System.out.println(x+" "+y);
        swap(arr,x,y);

    }
    public static void main(String[] args) {
        SwappedSorted f = new SwappedSorted();
        int arr[]={3,8,6,7,5,9,10};
        f.fixSorting(arr);

        for(int i:arr){
            System.out.println(i);
        }
        
    }
    
}
