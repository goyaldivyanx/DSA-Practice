//Count the Occurance of target in the given array

public class ArrayCount {
    public int CountElement(int[] arr,int x){
        int count = 0 ;
        for(int i : arr){
            if(i==x){count++;}
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayCount a = new ArrayCount();
        int[] arr = {5,6,1,5,5};
        int x = 5;
        System.out.println(a.CountElement(arr, x));
        
    }
    
}


/*
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 */
