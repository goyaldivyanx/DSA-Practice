//find the total number of  pair in array whose sum is equal to the given value of x
public class TargetSum {
    /*
    Appoach 1: Using double for loop 
    time complexity : O(n^2)
    Space compelxity : O(1)
    */
    public int NumberofPairs(int[] arr, int x){
        int count = 0 ;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        TargetSum t = new TargetSum();
        int[] arr = {4,6,3,5,8,2};
        int x = 7;
        System.out.println(t.NumberofPairs(arr, x));
    }
    
}
