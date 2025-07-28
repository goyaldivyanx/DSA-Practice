// Print the last occurence of the given no. in the array if not exist print -1


public class ArrayLastOccurence {
    public int LastOccurence(int arr[], int x){
        int last = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x && i>last){
                last=i;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        ArrayLastOccurence a = new ArrayLastOccurence();
        int arr[] = {5,6,5,3,5,4};
        int x = 5;
        System.out.println(a.LastOccurence(arr, x));
        
    }
    
}
/*
 * Time COmplexity : O(n)
 * Space Complexity :O(1)
 */
