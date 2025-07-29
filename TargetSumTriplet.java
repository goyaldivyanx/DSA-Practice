//count the number of triplet whose sum is equal to the given number x

public class TargetSumTriplet {
    public int NumberofTriplet(int[] arr, int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        TargetSumTriplet t = new TargetSumTriplet();
        int[] arr = {1,4,5,6,3};
        int x =12;
        System.out.println(t.NumberofTriplet(arr, x));
        
    }
}
