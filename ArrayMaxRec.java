
public class ArrayMaxRec {
    public int maximum(int arr[], int i){
        if(i==arr.length-1){return arr[i];}
        
        int mx = maximum(arr, i+1);
        return mx>arr[i]?mx:arr[i];
    }

    public static void main(String[] args) {
        ArrayMaxRec m = new ArrayMaxRec();
        int arr[] = {10, 5 ,13,15,1,3};
        System.out.println(m.maximum(arr, 0));
    }
    
}
