//Calculate the Sum of all the elements in the given array

class ArraySum{
    public int SumOfElement(int[] arr){
        int sum = 0;
        for(int i :arr){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,3};
        ArraySum a = new ArraySum();
        System.out.println(a.SumOfElement(arr));
        
    }
}


/*
 * Time Complexity :  O(n)
 * Space Complexity: O(1)
 */