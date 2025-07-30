public class ArrayReverse {
    public void revesre(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        ArrayReverse a = new ArrayReverse();
        int arr[]={1,2,3,4,5};
        a.revesre(arr);
        for(int i:arr){
            System.out.println(i);
        }
        
    }
    
}
