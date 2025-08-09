public class ArrayAllindexRec {
    public void allindex(int arr[],int t,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==t){
            System.out.println(i);
        }
        allindex(arr, t, i+1);
        
    }

    public static void main(String[] args) {
        ArrayAllindexRec a =new ArrayAllindexRec();
        int arr[] = {1,2,3,2,2,5};
        int t = 2;
        a.allindex(arr, t, 0);
    }
    
}
