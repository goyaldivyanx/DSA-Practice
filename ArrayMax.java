//Find the maximum element in the array

public class ArrayMax {
    public int MaxElement(int[] arr){
        int max=arr[0];
        for(int i:arr){
            if(i>max){max=i;}
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayMax a = new ArrayMax();
        int[] arr = {1,5,3};
        System.out.println(a.MaxElement(arr));  

        
    }
    
}


//Time Complexity : O(n)
//Space Complexity : O(1)