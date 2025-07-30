import java.util.random.RandomGenerator.ArbitrarilyJumpableGenerator;

public class ArrayRotation2 {
    public void reverse(int[] arr , int start , int end){
        int i=start;
        int j=end-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
    public void rotate(int [] arr,int k){
        int n = k%arr.length;

        reverse(arr, 0, arr.length);
        reverse(arr, 0, n);
        reverse(arr, n, arr.length);
    }

    public static void main(String[] args) {
        ArrayRotation2 a = new ArrayRotation2();
        int arr[]={1,2,3,4,5,6,7};
        int k=5;
        a.rotate(arr, k);

        for(int i:arr){
            System.out.println(i);
        }
        
    }
    
}
