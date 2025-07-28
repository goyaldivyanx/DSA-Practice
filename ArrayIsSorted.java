//check if array is sorted or not (in ascensding order)
public class ArrayIsSorted{
    public boolean isSorted(int arr[]){
        boolean flag = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag=false;
                return flag;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        ArrayIsSorted a = new ArrayIsSorted();
        int arr[] = {1,5,6,5,5,7,8};
        System.out.println(a.isSorted(arr));
        
    }
}
    


/*
 * time complexity :  O(n)
 * space Compelexity : O(1)
 */

    

