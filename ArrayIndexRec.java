public class ArrayIndexRec {
    public int Index(int arr[],int x,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==x){
            //System.out.println("Yes,Exist!!");
            return i;
        }else{
            return Index(arr,x,i+1);
        }

 }
    public static void main(String[] args) {
        int arr[] = {4,12,54,14,3,8,6,1};
        ArrayIndexRec c =  new ArrayIndexRec();
        int x = 14;
        System.out.println(c.Index(arr, x, 0));
        
    }
}

    
