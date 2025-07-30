public class ArrayRotation {
    public void rotate(int[] arr){
        int i= arr.length -1 ;
        int temp = arr[i];
        while(i>0){
            arr[i]=arr[i-1];
            i--;
        }
        arr[i]=temp;
    }
    public void Multiplerotate(int[] arr , int k){
        for(int i=0;i<k%arr.length;i++){
            rotate(arr);
        }
    }
    public static void main(String[] args) {
        ArrayRotation a = new ArrayRotation();
        int arr[] ={1,2,3,4,5};
        int k=10;
        a.Multiplerotate(arr,k);
        for(int i:arr){
            System.out.println(i);
        }
        
    }
    
}
