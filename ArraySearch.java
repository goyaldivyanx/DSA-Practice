//Return the element of x if it exist in arr else return -1

public class ArraySearch {
    public int SearchIndex(int[] arr , int x){
        for(int j=0;j<arr.length;j++){
            if(arr[j]==x){
                return j;
            }
        }      return -1;
    }
        public static void main(String[] args) {
        ArraySearch a = new ArraySearch();
        int arr[] = {1,5,3};
        int x = 5;
        System.out.println(a.SearchIndex(arr,x));
    }
    
}
/*
 * Time Complexity : O(n)
 * Space Complexity :O(1)
 */
