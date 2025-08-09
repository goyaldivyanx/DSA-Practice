public class ArraySumRec {
    public  int arraySum(int arr[],int i){
        if(i== arr.length-1){
            return arr[i];
        }

        int sum = arr[i] + arraySum(arr, i+1);
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        ArraySumRec s = new ArraySumRec();
        System.out.println(s.arraySum(arr, 0));
    }
    
}
